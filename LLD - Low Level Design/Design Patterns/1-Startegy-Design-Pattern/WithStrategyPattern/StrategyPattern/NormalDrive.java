package WithStrategyPattern.StrategyPattern;

public class NormalDrive implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("Normal Drive capability");
    }
}
