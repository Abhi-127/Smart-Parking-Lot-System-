package SmartParkingLot.parking;



import java.util.ArrayList;
import java.util.List;

public class ParkingLot {

    private List<ParkingFloor> floors;

    public ParkingLot() {
        floors = new ArrayList<>();
    }

    public void addFloor(ParkingFloor floor) {
        floors.add(floor);
    }

    public List<ParkingFloor> getFloors() {
        return floors;
    }
}