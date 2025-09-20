public class Main {
    public static void main(String[] args) {
        // Factory
        CarFactory simpleFactory = new CarFactory();
        Car car1 = simpleFactory.createCar("sedan");
        car1.drive();

        Car car2 = simpleFactory.createCar("suv");
        car2.drive();

        // Abstract Factory
        CarFactoryAbstract toyotaFactory = new ToyotaFactory();
        Car toyotaSedan = toyotaFactory.createSedan();
        toyotaSedan.drive();

        Car toyotaSUV = toyotaFactory.createSUV();
        toyotaSUV.drive();

        CarFactoryAbstract bmwFactory = new BMWFactory();
        Car bmwSedan = bmwFactory.createSedan();
        bmwSedan.drive();

        Car bmwSUV = bmwFactory.createSUV();
        bmwSUV.drive();
    }
}
