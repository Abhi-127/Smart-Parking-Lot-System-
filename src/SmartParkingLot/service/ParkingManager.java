package SmartParkingLot.service;


import SmartParkingLot.exception.ParkingFullException;
import SmartParkingLot.model.Vehicle;
import SmartParkingLot.parking.ParkingLot;
import SmartParkingLot.parking.ParkingSpot;
import SmartParkingLot.ticket.ParkingTicket;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class ParkingManager {

    private SpotAllocator allocator = new SpotAllocator();

    private FeeCalculator calculator = new FeeCalculator();

    private Map<Integer, ParkingTicket> activeTickets = new HashMap<>();


    public ParkingTicket checkIn(ParkingLot lot,
                                 Vehicle vehicle)
            throws ParkingFullException {

        ParkingSpot spot = allocator.allocateSpot(lot, vehicle);

        ParkingTicket ticket = new ParkingTicket(vehicle, spot);

        activeTickets.put(ticket.getTicketId(), ticket);

        System.out.println("Vehicle Parked Successfully");

        System.out.println("Spot : " + spot.getSpotId());

        System.out.println("Ticket ID : " + ticket.getTicketId());

        return ticket;
    }

    public void checkOut(int ticketId) {

        ParkingTicket ticket = activeTickets.get(ticketId);

        if (ticket == null) {

            System.out.println("Invalid Ticket");

            return;
        }

        ticket.setExitTime(LocalDateTime.now());

        double fee = calculator.calculateFee(
                ticket.getVehicle(),
                ticket.getEntryTime(),
                ticket.getExitTime());

        ticket.setFee(fee);

        ticket.getParkingSpot().removeVehicle();

        activeTickets.remove(ticketId);

        System.out.println("\nVehicle Exited");

        System.out.println("Fee = ₹" + fee);

        System.out.println("Spot Released");
    }
}