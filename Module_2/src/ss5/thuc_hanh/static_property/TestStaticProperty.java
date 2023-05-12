package ss5.thuc_hanh.static_property;

public class TestStaticProperty {
    public static void main(String[] args) {
        Car car1 = new Car("Mazda 3","Skyactiv G");
        System.out.println(Car.numberOfCars);
        Car car2 = new Car("Mazda 5","Skyactiv 5");
        System.out.println(Car.numberOfCars);
        System.out.println(car1.toString());
        System.out.println(car2);
    }
}
