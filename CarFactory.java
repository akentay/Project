public class CarFactory {
    public Car createCar(String type) {
        switch (type.toLowerCase()) {
            case "sedan": return new Sedan();
            case "suv": return new SUV();
            default: throw new IllegalArgumentException("Unknown car type: " + type);
        }
    }
}
