package SmartParkingLot.model;

import SmartParkingLot.Enum.VehicleType;

public class Car extends Vehicle {

    public Car(String vehicleNumber) {
        super(vehicleNumber, VehicleType.CAR);
    }
}