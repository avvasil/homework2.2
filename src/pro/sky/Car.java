package pro.sky;

public class Car extends Vehicle {

    String vehicleType;

    public Car(String modelName,int wheelsCount, String vehicleType) {
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