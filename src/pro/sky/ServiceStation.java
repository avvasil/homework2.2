package pro.sky;

public class ServiceStation implements CheckVehicle {

    @Override
    public void check(Bicycle[] bicycles) {
        for (int i = 0; i < bicycles.length; i++) {
            System.out.println("Обслуживаем " + bicycles[i].getModelName());
            ServiceStation.updateTyre(bicycles[i].getWheelsCount());
        }

    }

    @Override
    public void check(Car[] cars) {
        for (int i = 0; i < cars.length; i++) {
            System.out.println("Обслуживаем " + cars[i].getModelName());
            ServiceStation.updateTyre(cars[i].getWheelsCount());
            ServiceStation.checkEngine();
        }

    }

    @Override
    public void check(Truck[] trucks) {
        for (int i = 0; i < trucks.length; i++) {
            System.out.println("Обслуживаем " + trucks[i].getModelName());
            ServiceStation.updateTyre(trucks[i].getWheelsCount());
            ServiceStation.checkEngine();
            ServiceStation.checkTrailer();
        }

    }

    private static void updateTyre(int wheelCount) {
        for (int i = 0; i < wheelCount; i++) {
            System.out.println("Меняем покрышку");
        }
    }

    private static void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    private static void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}



