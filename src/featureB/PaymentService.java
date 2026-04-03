package featureB;

public class PaymentService {

    public String processPayment(double amount) {
        if (amount > 0) {
            return "Payment Successful";
        }
        return "Payment Failed";
    }
}