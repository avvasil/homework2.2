package pro.sky;

public class Main {

    public static void main(String[] args) {

        Bicycle[] bicycles = {
                new Bicycle("bicycle1", 2),
                new Bicycle("bicycle2", 2)
        };

        Car[] cars = {
                new Car("car1", 4),
                new Car("car2", 4)
        };

        Truck[] trucks = {
                new Truck("truck1", 6),
                new Truck("truck2", 8)
        };


        Vehicle[] vehicles = new Vehicle[bicycles.length + cars.length + trucks.length];
        for (int i = 0; i < bicycles.length; i++) {
            vehicles[i] = bicycles[i];
        }
        for (int i = 0; i < cars.length; i++) {
            vehicles[i + bicycles.length] = cars[i];
        }
        for (int i = 0; i < trucks.length; i++) {
            vehicles[i + bicycles.length + cars.length] = trucks[i];
        }

        ServiceStation serviceStation = new ServiceStation();

        serviceReport(serviceStation, bicycles, cars, trucks);


    }

    private static void serviceReport(ServiceStation serviceStation, Bicycle[] bicycles, Car[] cars, Truck[] trucks) {
        serviceStation.check(bicycles);
        serviceStation.check(cars);
        serviceStation.check(trucks);
    }
}
