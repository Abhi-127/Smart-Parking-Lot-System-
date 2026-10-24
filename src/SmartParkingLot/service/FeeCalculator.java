package SmartParkingLot.service;


import SmartParkingLot.model.Vehicle;

import java.time.Duration;
import java.time.LocalDateTime;

public class FeeCalculator {

    public double calculateFee(Vehicle vehicle,
                               LocalDateTime entry,
                               LocalDateTime exit) {

        long minutes = Duration.between(entry, exit).toMinutes();

        long hours = (minutes + 59) / 60;

        if (hours == 0)
            hours = 1;

        double rate = switch (vehicle.getVehicleType()) {

            case MOTORCYCLE -> 20;

            case CAR -> 50;

            case BUS -> 100;
        };

        return hours * rate;
    }
}