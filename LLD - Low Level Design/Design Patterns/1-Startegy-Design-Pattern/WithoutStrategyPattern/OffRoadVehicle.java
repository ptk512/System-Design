package WithoutStrategyPattern;

public class OffRoadVehicle extends Vehicle{

    /**Needs to have the special drive capability so override the parent Vehicle's drive method*/
    @Override
    public void drive() {
        System.out.println("Special drive capability");
    }

    //we can see same drive code also in sporty vehicle so it causes code duplicacy, Not an scalable solution
    //because if we have 100s of function which child class uses same but these 100 are different in parent
}
