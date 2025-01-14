package parkingLot.parkingSpot;

import parkingLot.vehicle.VehicleType;

public class TwoWheelerSpot extends ParkingSpot{

    public TwoWheelerSpot(int id, boolean isEmpty) {
        super(id, isEmpty, VehicleType.FOUR_WHEELER);
        this.price = 20;
    }

}
