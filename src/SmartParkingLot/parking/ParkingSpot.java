package SmartParkingLot.parking;


import SmartParkingLot.Enum.SpotStatus;
import SmartParkingLot.Enum.VehicleType;
import SmartParkingLot.model.Vehicle;

public class ParkingSpot {

    private int spotId;
    private VehicleType supportedType;
    private SpotStatus status;
    private Vehicle parkedVehicle;

    public ParkingSpot(int spotId, VehicleType supportedType) {
        this.spotId = spotId;
        this.supportedType = supportedType;
        this.status = SpotStatus.AVAILABLE;
    }

    public boolean isAvailable() {
        return status == SpotStatus.AVAILABLE;
    }

    public boolean canFitVehicle(Vehicle vehicle) {
        return vehicle.getVehicleType() == supportedType;
    }

    public void parkVehicle(Vehicle vehicle) {
        this.parkedVehicle = vehicle;
        this.status = SpotStatus.OCCUPIED;
    }

    public void removeVehicle() {
        parkedVehicle = null;
        status = SpotStatus.AVAILABLE;
    }

    public int getSpotId() {
        return spotId;
    }

    public VehicleType getSupportedType() {
        return supportedType;
    }

    public SpotStatus getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Spot " + spotId +
                " [" + supportedType + "] " +
                status;
    }
}