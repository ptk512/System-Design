package WithoutStrategyPattern;

public class SportyVehicle extends Vehicle{

    /**Needs to have the special drive capability so override the parent Vehicle's drive method*/

    @Override
    public void drive() {
        System.out.println("Special drive capability");
    }
}
