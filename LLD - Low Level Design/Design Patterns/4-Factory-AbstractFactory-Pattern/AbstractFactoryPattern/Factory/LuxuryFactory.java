package AbstractFactoryPattern.Factory;

import AbstractFactoryPattern.BMW;
import AbstractFactoryPattern.Mercedes;
import AbstractFactoryPattern.Vehicle;

public class LuxuryFactory implements VehicleFactory{

    @Override
    public Vehicle getVehicle(String carName) {
        switch (carName){
            case "Mercedes":
                return new Mercedes();
            case "BMW":
                return new BMW();
            default:
                return null;
        }
    }
}
