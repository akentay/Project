package asik4;

public abstract class Product {
    protected PaymentMethod paymentMethod;

    public Product(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public abstract void buyProduct();
}
