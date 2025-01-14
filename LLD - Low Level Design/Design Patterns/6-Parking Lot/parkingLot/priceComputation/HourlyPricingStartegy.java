package parkingLot.priceComputation;

import parkingLot.ticket.Ticket;
import parkingLot.vehicle.VehicleType;

import java.util.concurrent.TimeUnit;

public class HourlyPricingStartegy implements PriceStrategy{

    @Override
    public int price(Ticket ticket) {
        int ticketPrice = 0;
        if(ticket.getVehicle().getVehicleType() == VehicleType.FOUR_WHEELER){

            long timeDiff = ticket.getEntryTime() - System.currentTimeMillis();
            long diffHours = TimeUnit.MILLISECONDS.toHours(timeDiff);
            ticketPrice = (int) ((int)10*diffHours);

        }
        else if(ticket.getVehicle().getVehicleType() == VehicleType.TWO_WHEELER){

            long timeDiff = ticket.getEntryTime() - System.currentTimeMillis();
            long diffHours = TimeUnit.MILLISECONDS.toHours(timeDiff);
            ticketPrice = (int) ((int)5*diffHours);

        }

        return ticketPrice;
    }
}
