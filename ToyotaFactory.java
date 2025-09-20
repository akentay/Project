public class ToyotaFactory implements CarFactoryAbstract {
    @Override
    public Car createSedan() {
        return new Sedan() {
            @Override
            public void drive() {
                System.out.println("Driving a Toyota Sedan.");
            }
        };
    }

    @Override
    public Car createSUV() {
        return new SUV() {
            @Override
            public void drive() {
                System.out.println("Driving a Toyota SUV.");
            }
        };
    }
}
