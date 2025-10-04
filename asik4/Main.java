package asik4;

public class Main {
    public static void main(String[] args) {
        PaymentMethod creditCard = new CreditCardPayment();
        PaymentMethod paypal = new PayPalPayment();

        Product phone1 = new Smartphone("iPhone 15", 1200.0, creditCard);
        Product phone2 = new Smartphone("Samsung Galaxy S24", 999.0, paypal);

        phone1.buyProduct();
        phone2.buyProduct();
    }
}
