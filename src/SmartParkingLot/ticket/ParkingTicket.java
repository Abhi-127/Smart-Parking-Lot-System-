package SmartParkingLot.ticket;


import SmartParkingLot.model.Vehicle;
import SmartParkingLot.parking.ParkingSpot;

import java.time.LocalDateTime;

public class ParkingTicket {

    private static int counter = 1000;

    private int ticketId;
    private Vehicle vehicle;
    private ParkingSpot parkingSpot;
    private LocalDateTime entryTime;
    private LocalDateTime exitTime;
    private double fee;

    public ParkingTicket(Vehicle vehicle,
                         ParkingSpot parkingSpot) {

        this.ticketId = counter++;
        this.vehicle = vehicle;
        this.parkingSpot = parkingSpot;
        this.entryTime = LocalDateTime.now();
    }

    public int getTicketId() {
        return ticketId;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public LocalDateTime getEntryTime() {
        return entryTime;
    }

    public void setExitTime(LocalDateTime exitTime) {
        this.exitTime = exitTime;
    }

    public LocalDateTime getExitTime() {
        return exitTime;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public double getFee() {
        return fee;
    }
}