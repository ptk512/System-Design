package WithStrategyPattern;

import WithStrategyPattern.StrategyPattern.SpecialDrive;

public class OffRoadVehicle extends Vehicle{

    public OffRoadVehicle(){
        super(new SpecialDrive());
    }
}
