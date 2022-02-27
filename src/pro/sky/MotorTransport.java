package pro.sky;

public class MotorTransport extends WheeledTransport {

    public MotorTransport(String modelName, int wheelCount) {
        super(modelName, wheelCount);
    }
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    public void service() {
        super.service();
        checkEngine();
    }
}
