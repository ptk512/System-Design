package parkingLot.parkingSpot;

import parkingLot.vehicle.VehicleType;

import java.util.ArrayList;
import java.util.List;

public class ParkingSpotFactory {

    List<ParkingSpot> twoWheelerSpotList;
    List<ParkingSpot> fourWheelerSpotList;

    public ParkingSpotFactory(){
        twoWheelerSpotList = new ArrayList<>();
        fourWheelerSpotList = new ArrayList<>();
        for(int i=1; i<=100; i++){
            //id 1 to 40 2-wheeler spot
            //id 41 to 100 4-wheeler spot
            if(i <= 40){
                ParkingSpot ps2wheeler = new ParkingSpot(i, true, VehicleType.TWO_WHEELER);
                twoWheelerSpotList.add(ps2wheeler);
            }
            else{
                ParkingSpot ps4wheeler = new ParkingSpot(i, true, VehicleType.FOUR_WHEELER);
                fourWheelerSpotList.add(ps4wheeler);
            }
        }
    }
    public ParkingSpotManager getPSManager(VehicleType vehicleType){


        switch (vehicleType){
            case TWO_WHEELER:
                return new TwoWheelerPSManager(twoWheelerSpotList);
            case FOUR_WHEELER:
                return new FourWheelerPSManager(fourWheelerSpotList);
            default:
                return null;
        }
    }

}
