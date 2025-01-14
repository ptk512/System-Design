package WithStrategyPattern;

import WithStrategyPattern.StrategyPattern.SpecialDrive;

public class SportyVehicle extends Vehicle{

    public SportyVehicle(){
        super(new SpecialDrive());
    }
}
