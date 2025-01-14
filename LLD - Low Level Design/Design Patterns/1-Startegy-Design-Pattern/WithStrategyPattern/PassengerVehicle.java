package WithStrategyPattern;

import WithStrategyPattern.StrategyPattern.NormalDrive;

public class PassengerVehicle extends Vehicle{

    public PassengerVehicle(){
        super(new NormalDrive());
    }
}
