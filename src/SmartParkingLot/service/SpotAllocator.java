package SmartParkingLot.service;


import SmartParkingLot.exception.ParkingFullException;
import SmartParkingLot.model.Vehicle;
import SmartParkingLot.parking.ParkingFloor;
import SmartParkingLot.parking.ParkingLot;
import SmartParkingLot.parking.ParkingSpot;

public class SpotAllocator {

    public ParkingSpot allocateSpot(ParkingLot parkingLot, Vehicle vehicle)
            throws ParkingFullException {

        for (ParkingFloor floor : parkingLot.getFloors()) {

            for (ParkingSpot spot : floor.getParkingSpots()) {

                if (spot.isAvailable() && spot.canFitVehicle(vehicle)) {

                    spot.parkVehicle(vehicle);

                    return spot;
                }
            }
        }

        throw new ParkingFullException("No parking spot available!");
    }
}