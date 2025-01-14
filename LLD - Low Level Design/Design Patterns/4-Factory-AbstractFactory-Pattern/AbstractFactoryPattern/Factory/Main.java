package AbstractFactoryPattern.Factory;

import AbstractFactoryPattern.Factory.VehicleFactory;
import AbstractFactoryPattern.Factory.VehicleFactoryAbstract;

public class Main {
    public static void main(String[] args) {
        VehicleFactoryAbstract factoryAbstractObj = new VehicleFactoryAbstract(); //factory of factory (factory of vehicle factory)

        /**Jo bhi aaega uska object return kr dega. eg Luxury aaega to uska object luxuryFactory de dega and Ordinary aaega to uska object de dega*/
        VehicleFactory vehicleFactoryLux = factoryAbstractObj.getVehicleFactory("Luxury"); //return the object of LuxuryFactory
        VehicleFactory vehicleFactoryOrdinary = factoryAbstractObj.getVehicleFactory("Ordinary"); //returns the object of ordinary factory

        vehicleFactoryLux.getVehicle("Mercedes").price();
        vehicleFactoryOrdinary.getVehicle("Swift").price();

    }
}
