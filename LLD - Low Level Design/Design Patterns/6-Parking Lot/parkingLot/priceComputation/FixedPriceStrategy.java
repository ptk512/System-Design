package parkingLot.priceComputation;

import parkingLot.ticket.Ticket;
import parkingLot.vehicle.VehicleType;

public class FixedPriceStrategy implements PriceStrategy{

    @Override
    public int price(Ticket ticket) {
        if(ticket.getVehicle().getVehicleType() == VehicleType.FOUR_WHEELER){
            return 40;
        }
        else if(ticket.getVehicle().getVehicleType() == VehicleType.TWO_WHEELER){
            return 20;
        }
        //If not 2 wheeler, 4 wheeler then no price
        return 0;
    }
}
