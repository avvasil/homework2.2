package pro.sky;

public class Truck extends MotorTransport {

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
    public void service() {
        super.service();
        checkTrailer();
    }
}