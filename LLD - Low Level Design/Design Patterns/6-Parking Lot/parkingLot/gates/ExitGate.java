package parkingLot.gates;

import parkingLot.parkingSpot.ParkingSpotFactory;
import parkingLot.parkingSpot.ParkingSpotManager;
import parkingLot.priceComputation.CostComputation;
import parkingLot.priceComputation.CostComputationFactory;
import parkingLot.priceComputation.FixedPriceStrategy;
import parkingLot.priceComputation.PriceStrategy;
import parkingLot.ticket.Ticket;

public class ExitGate {
    Ticket ticket;
    ParkingSpotFactory parkingSpotFactory;
    ParkingSpotManager parkingSpotManager;

    public ExitGate(ParkingSpotFactory parkingSpotFactory){
        this.parkingSpotFactory = parkingSpotFactory;
    }

    public void exitVehicle(Ticket ticket){
        int ticket1Price = calculatePrice(ticket);

        ticket.getParkingSpot().setEmpty(true);

        ParkingSpotManager psManager = parkingSpotFactory.getPSManager(ticket.getParkingSpot().getVehicleType());
        psManager.removeVehicle();

        System.out.println("Vehicle number " + ticket.getVehicle().getVehicleNo() +
                " exited and total price for parking is : " + ticket1Price);
    }

    public int calculatePrice(Ticket ticket){
        PriceStrategy fixedPriceStrategy = new FixedPriceStrategy();
        CostComputationFactory costComputationFactory = new CostComputationFactory(fixedPriceStrategy);

        CostComputation costComputation = costComputationFactory.getCostComputation(ticket.getVehicle().getVehicleType());

        int parkingPrice = costComputation.price(ticket);

        return parkingPrice;
    }

}
