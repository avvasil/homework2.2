package pro.sky;

public class ServiceStation {

    public void check(Car car) {
        if (car != null) {
            System.out.println("Обслуживаем " + car.getModelName());
            for (int i = 0; i < car.getWheelsCount(); i++) {
                ServiceStation.updateTyre();
            }
            ServiceStation.checkEngine();
        }
    }

    public void check(Truck truck) {
        if (truck != null) {
            System.out.println("Обслуживаем " + truck.getModelName());
            for (int i = 0; i < truck.getWheelsCount(); i++) {
                ServiceStation.updateTyre();
            }
            ServiceStation.checkEngine();
            ServiceStation.checkTrailer();
        }
    }
    public void check(Bicycle bicycle) {
        if (bicycle != null) {
            System.out.println("Обслуживаем " + bicycle.getModelName());
            for (int i = 0; i < bicycle.getWheelsCount(); i++) {
                ServiceStation.updateTyre();
            }
        }
    }

    public static void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    public static void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    public static void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}