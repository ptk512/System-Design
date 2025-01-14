package parkingLot.parkingSpot;

import parkingLot.vehicle.VehicleType;

public class FourWheelerSpot extends ParkingSpot{

    public FourWheelerSpot(int id, boolean isEmpty) {
        super(id, isEmpty, VehicleType.FOUR_WHEELER);
        this.price = 40;
    }
}
