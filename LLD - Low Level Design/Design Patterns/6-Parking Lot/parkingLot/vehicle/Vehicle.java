package parkingLot.vehicle;

public class Vehicle {
    String vehicleNo;
    VehicleType vehicleType;

    public String getVehicleNo() {
        return vehicleNo;
    }

    public Vehicle setVehicleNo(String vehicleNo) {
        this.vehicleNo = vehicleNo;
        return this;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public Vehicle setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
        return this;
    }
}
