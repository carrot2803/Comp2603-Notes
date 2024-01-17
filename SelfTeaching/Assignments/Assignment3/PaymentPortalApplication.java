public class PaymentPortalApplication {
    public static void main(String[] args) {
        PaymentSystem v1 = new PaymentSystem();
        PaymentPortal lennysPaymentPortal = new PaymentPortal(v1);
        lennysPaymentPortal.setVisible(true);
    }
}
