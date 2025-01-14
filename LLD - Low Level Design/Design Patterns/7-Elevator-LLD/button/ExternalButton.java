package button;

import elevatorCar.Direction;

public class ExternalButton {

    ExternalButtonDispatcher externalButtonDispatcher;

    public void pressButton(int floor, Direction direction){
        externalButtonDispatcher.submitReq(floor, direction);
    }
}
