package parkingLot.gates;

import parkingLot.parkingSpot.ParkingSpot;
import parkingLot.parkingSpot.ParkingSpotFactory;
import parkingLot.parkingSpot.ParkingSpotManager;
import parkingLot.ticket.Ticket;
import parkingLot.vehicle.Vehicle;
import parkingLot.vehicle.VehicleType;


public class EntranceGate {
    ParkingSpotFactory parkingSpotFactory;
    ParkingSpotManager parkingSpotManager;

    public EntranceGate(ParkingSpotFactory parkingSpotFactory){
        this.parkingSpotFactory = parkingSpotFactory;
    }

    public Ticket enterVehicle(Vehicle vehicle){

        Ticket ticket = bookSpot(vehicle);
        System.out.println("TIcket1 details are \n" + ticket.toString());

        parkingSpotManager.parkVehicle(ticket.getParkingSpot());

        return ticket;
    }

    public Ticket bookSpot(Vehicle vehicle){

        ParkingSpot parkingSpot = findSpace(vehicle.getVehicleType());
        if(parkingSpot != null){
            System.out.println("Parking spot : " + parkingSpot.getId() +" is available....Genrating Ticket");
            return generateTicket(vehicle, parkingSpot);
        }
        System.out.println("Sorry... None of the parking spots are available");
        return null;
    }

    public Ticket generateTicket(Vehicle vehicle, ParkingSpot parkingSpot){
        Ticket ticket = new Ticket(System.currentTimeMillis(), vehicle, parkingSpot);

        parkingSpot.setEmpty(false);

        System.out.println("Ticket for parking spot : "+parkingSpot.getId() + " is generated for vehicle no : " + vehicle.getVehicleNo());

        return ticket;
    }

    public ParkingSpot findSpace(VehicleType vehicleType){

        this.parkingSpotManager = parkingSpotFactory.getPSManager(vehicleType);

        ParkingSpot parkingSpot = this.parkingSpotManager.findParkingSpace();

        return parkingSpot;
    }
}
