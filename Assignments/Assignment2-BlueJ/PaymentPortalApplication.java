// 816035591 Dmitri Lezama
public class PaymentPortalApplication {
    public static void main(String[] args) {
        PaymentSystem paymentSystem = new PaymentSystem();
        PaymentPortal lennysPaymentPortal = new PaymentPortal(paymentSystem);
        lennysPaymentPortal.setVisible(true);
    }
}
