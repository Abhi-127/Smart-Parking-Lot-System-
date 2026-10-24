package SmartParkingLot.main;


import SmartParkingLot.Enum.VehicleType;
import SmartParkingLot.exception.ParkingFullException;
import SmartParkingLot.model.Car;
import SmartParkingLot.model.Vehicle;
import SmartParkingLot.parking.ParkingFloor;
import SmartParkingLot.parking.ParkingLot;
import SmartParkingLot.parking.ParkingSpot;
import SmartParkingLot.service.ParkingManager;
import SmartParkingLot.ticket.ParkingTicket;

public class Main {

    public static void main(String[] args) {

        ParkingLot parkingLot = new ParkingLot();

        ParkingFloor floor1 = new ParkingFloor(1);

        floor1.addSpot(new ParkingSpot(1, VehicleType.CAR));
        floor1.addSpot(new ParkingSpot(2, VehicleType.CAR));
        floor1.addSpot(new ParkingSpot(3, VehicleType.MOTORCYCLE));
        floor1.addSpot(new ParkingSpot(4, VehicleType.BUS));

        parkingLot.addFloor(floor1);

        ParkingManager manager = new ParkingManager();

        try {

            Vehicle car = new Car("UP32AB1234");

            ParkingTicket ticket = manager.checkIn(parkingLot, car);

            Thread.sleep(5000);

            manager.checkOut(ticket.getTicketId());

        } catch (ParkingFullException e) {

            System.out.println(e.getMessage());

        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }
}