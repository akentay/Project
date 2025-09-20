public class BMWFactory implements CarFactoryAbstract {
    @Override
    public Car createSedan() {
        return new Sedan() {
            @Override
            public void drive() {
                System.out.println("Driving a BMW Sedan.");
            }
        };
    }

    @Override
    public Car createSUV() {
        return new SUV() {
            @Override
            public void drive() {
                System.out.println("Driving a BMW SUV.");
            }
        };
    }
}
