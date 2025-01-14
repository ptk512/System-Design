package WithoutStrategyPattern;

public class Main {
    public static void main(String[] args) {
        Vehicle offRoad = new OffRoadVehicle();
        Vehicle sporty = new SportyVehicle();
        Vehicle passenger = new PassengerVehicle();

        offRoad.drive(); //output => Special drive capability
        sporty.drive(); //output => Special drive capability
        passenger.drive(); //output => Normal drive capability
    }
}
