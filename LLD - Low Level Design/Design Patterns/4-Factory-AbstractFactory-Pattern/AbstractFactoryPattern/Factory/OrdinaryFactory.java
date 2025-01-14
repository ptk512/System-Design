package AbstractFactoryPattern.Factory;

import AbstractFactoryPattern.Creta;
import AbstractFactoryPattern.Swift;
import AbstractFactoryPattern.Vehicle;

public class OrdinaryFactory implements VehicleFactory{

    @Override
    public Vehicle getVehicle(String carName) {
        switch (carName){
            case "Swift":
                return new Swift();
            case "Creta":
                return new Creta();
            default:
                return null;
        }
    }
}
