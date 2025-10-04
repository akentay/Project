package asik4;

public class Smartphone extends Product {
    private String model;
    private double price;

    public Smartphone(String model, double price, PaymentMethod paymentMethod) {
        super(paymentMethod);
        this.model = model;
        this.price = price;
    }

    @Override
    public void buyProduct() {
        System.out.println("Buying smartphone: " + model + " for $" + price);
        paymentMethod.pay(price);
    }
}
