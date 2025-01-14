package AbstractFactoryPattern.Factory;

public class VehicleFactoryAbstract {

    VehicleFactory getVehicleFactory(String factory){

        switch (factory){
            case "Luxury":
                return new LuxuryFactory();
            case "Ordinary":
                return new OrdinaryFactory();
            default:
                return null;
        }
    }
}
