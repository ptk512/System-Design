package building;

import button.ExternalButton;
import elevatorCar.Direction;

public class Floor {
    int floorId;
    ExternalButton externalButton;

    public Floor(int floorId, ExternalButton externalButton){
        this.floorId = floorId;
        this.externalButton = externalButton;
    }

    public void pressExternalButton(Direction direction){
        externalButton.pressButton(floorId, direction);
    }

}
