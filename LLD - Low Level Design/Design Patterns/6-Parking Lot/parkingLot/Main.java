package parkingLot;

import parkingLot.gates.EntranceGate;
import parkingLot.gates.ExitGate;
import parkingLot.parkingSpot.ParkingSpot;
import parkingLot.parkingSpot.ParkingSpotFactory;
import parkingLot.parkingSpot.ParkingSpotManager;
import parkingLot.ticket.Ticket;
import parkingLot.vehicle.Vehicle;
import parkingLot.vehicle.VehicleType;

public class Main {

    public static void main(String[] args) {

        ParkingSpotFactory psFactory = new ParkingSpotFactory();

        EntranceGate entranceGate = new EntranceGate(psFactory);

        Vehicle vehicle1 = new Vehicle();
        vehicle1.setVehicleNo("UP35BF4691")
                .setVehicleType(VehicleType.TWO_WHEELER);

        Vehicle vehicle2 = new Vehicle();
        vehicle2.setVehicleNo("UP35E2052")
                .setVehicleType(VehicleType.FOUR_WHEELER);

        Vehicle vehicle3 = new Vehicle();
        vehicle3.setVehicleNo("UP35X8449")
                .setVehicleType(VehicleType.TWO_WHEELER);

        Vehicle vehicle4 = new Vehicle();
        vehicle4.setVehicleNo("UP35AB3535")
                .setVehicleType(VehicleType.TWO_WHEELER);


        Ticket ticket1 = entranceGate.enterVehicle(vehicle1);
        Ticket ticket2 = entranceGate.enterVehicle(vehicle2);
        Ticket ticket3 = entranceGate.enterVehicle(vehicle3);


        ExitGate exitGate = new ExitGate(psFactory);
        exitGate.exitVehicle(ticket1);

        Ticket ticket4 = entranceGate.bookSpot(vehicle4);
        System.out.println("TIcket4 details are \n" + ticket4.toString());



    }
}
