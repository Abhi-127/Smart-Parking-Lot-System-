package SmartParkingLot.parking;



import java.util.ArrayList;
import java.util.List;

public class ParkingFloor {

    private int floorNumber;
    private List<ParkingSpot> parkingSpots;

    public ParkingFloor(int floorNumber) {
        this.floorNumber = floorNumber;
        this.parkingSpots = new ArrayList<>();
    }

    public void addSpot(ParkingSpot spot) {
        parkingSpots.add(spot);
    }

    public List<ParkingSpot> getParkingSpots() {
        return parkingSpots;
    }

    public int getFloorNumber() {
        return floorNumber;
    }
}