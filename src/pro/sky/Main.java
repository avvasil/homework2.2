package pro.sky;

public class Main {

    public static void main(String[] args) {
        Car car = new Car("car1", 4, "car");
        Car car2 = new Car("car2", 4, "car");

        Truck truck = new Truck("truck1", 6, "truck");
        Truck truck2 = new Truck("truck2", 8, "truck");

        Bicycle bicycle = new Bicycle("bicycle1", 2, "bicycle");
        Bicycle bicycle2 = new Bicycle("bicycle2", 2, "bicycle");

        ServiceStation station = new ServiceStation();
        station.check(car, null, null);
        station.check(car2, null, null);
        station.check(null, bicycle, null);
        station.check(null, bicycle2, null);
        station.check(null, null, truck);
        station.check(null, null, truck2);
    }
}
