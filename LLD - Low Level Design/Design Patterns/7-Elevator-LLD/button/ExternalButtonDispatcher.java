package button;

import controller.ElevatorController;
import elevatorCar.Direction;

import java.util.List;

public class ExternalButtonDispatcher {
    List<ElevatorController> elevatorControllerList;

    public ExternalButtonDispatcher(List<ElevatorController> elevatorControllers){
        this.elevatorControllerList = elevatorControllers;
    }

    public void submitReq(int floor, Direction direction){

    }
}
