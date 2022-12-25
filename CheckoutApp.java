package checkout;

public class CheckoutApp {
    public static void main(String[] args) {
        Checkout user1 = new Checkout();

        user1.prompts();
        user1.invoice();
    }
}
