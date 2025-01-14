package WithStrategyPattern;

public class Main {
    public static void main(String[] args) {

        Vehicle offRoad = new OffRoadVehicle();
        Vehicle passenger = new PassengerVehicle();
        Vehicle sporty = new SportyVehicle();

        /**Code duplicacy is reduced in offroad and sporty, now we are not using same code in both classes
         * instead we are using the interface and using their child class to pass as constructor injection
         * in constructor of the parent classes*/
        offRoad.drive(); //output => Special Drive capability
        sporty.drive();//output => Special Drive capability
        passenger.drive(); //output => Normal Drive capability

    }
}
