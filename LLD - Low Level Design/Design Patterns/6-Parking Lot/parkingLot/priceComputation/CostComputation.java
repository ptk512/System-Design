package parkingLot.priceComputation;

import parkingLot.ticket.Ticket;

public class CostComputation {
    PriceStrategy priceStrategy;

    public CostComputation(PriceStrategy priceStrategy){
        this.priceStrategy = priceStrategy;
    }

    public int price(Ticket ticket){
        return priceStrategy.price(ticket);
    }
}
