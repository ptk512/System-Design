package parkingLot.parkingSpot;

import parkingLot.vehicle.Vehicle;
import parkingLot.vehicle.VehicleType;

import java.util.List;

public class ParkingSpotManager {
    List<ParkingSpot> parkingSpotList;

    public ParkingSpotManager(List<ParkingSpot> psList){
        this.parkingSpotList = psList;
    }

    public ParkingSpot findParkingSpace(){
        for(ParkingSpot spot : parkingSpotList){
            if(spot.isEmpty()){
                return spot;
            }
        }
        return null;
    }

    public List<ParkingSpot> addParkingSpace(){

        return null;
    }

    public void removeParkingSpace(){

    }

    public void parkVehicle(ParkingSpot parkingSpot){

    }

    public Vehicle removeVehicle(){
        return null;
    }

}
