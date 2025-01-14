package parkingLot.priceComputation;

import parkingLot.vehicle.VehicleType;

public class CostComputationFactory {

    PriceStrategy priceStrategy;

    public CostComputationFactory(PriceStrategy priceStrategy){
        this.priceStrategy = priceStrategy;
    }

    public CostComputation getCostComputation(VehicleType vehicleType){
        switch (vehicleType){
            case TWO_WHEELER:
                return new TwoWheelerCostComputation(priceStrategy);

            case FOUR_WHEELER:
                return new FourWheelerCostComputation(priceStrategy);

            default:
                return null;
        }
    }
}
