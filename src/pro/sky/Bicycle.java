package pro.sky;

public class Bicycle extends Vehicle {

    private String vehicleType;

    public Bicycle(String modelName,int wheelsCount, String vehicleType) {
        super (modelName, wheelsCount);
        this.vehicleType = vehicleType;
    }

    public String getVehicleType() {
        return vehicleType;
    }
    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }
}