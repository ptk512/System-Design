package parkingLot.ticket;

import parkingLot.parkingSpot.ParkingSpot;
import parkingLot.vehicle.Vehicle;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ticket {
    long entryTime;
    Vehicle vehicle;
    ParkingSpot parkingSpot;

    public Ticket(long entryTime, Vehicle vehicle, ParkingSpot parkingSpot) {
        this.entryTime = entryTime;
        this.vehicle = vehicle;
        this.parkingSpot = parkingSpot;
    }

    public long getEntryTime() {
        return this.entryTime;
    }

    public Vehicle getVehicle() {
        return this.vehicle;
    }

    public ParkingSpot getParkingSpot() {
        return this.parkingSpot;
    }

    public String getEntryDateTime(){
        Date date = new Date(entryTime);
        DateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String formatted = format.format(date);

        return formatted;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "\n entryTime = " + getEntryDateTime() +
                "\n vehicleNo = " + vehicle.getVehicleNo() +
                "\n vehicleType = " + vehicle.getVehicleType() +
                "\n parkingSpot = " + parkingSpot.getId() + "\n" +
                '}';
    }
}
