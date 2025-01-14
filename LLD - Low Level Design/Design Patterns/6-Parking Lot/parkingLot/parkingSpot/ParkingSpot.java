package parkingLot.parkingSpot;

import parkingLot.vehicle.Vehicle;
import parkingLot.vehicle.VehicleType;

public class ParkingSpot {
    int id;
    boolean isEmpty;
    VehicleType vehicleType;
    int price;

    public ParkingSpot(int id, boolean isEmpty, VehicleType vehicleType){
        this.id = id;
        this.isEmpty = isEmpty;
        this.vehicleType = vehicleType;

    }

    public int getId() {
        return id;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public ParkingSpot setEmpty(boolean empty) {
        isEmpty = empty;
        return this;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public int getPrice() {
        return price;
    }





}