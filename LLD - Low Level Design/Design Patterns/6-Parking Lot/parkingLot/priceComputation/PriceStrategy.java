package parkingLot.priceComputation;

import parkingLot.ticket.Ticket;

public interface PriceStrategy {

    public int price(Ticket ticket);
}
