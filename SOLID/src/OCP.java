/*
Classes should be open for extension, but closed for modification
 */

//public class PaymentProcessor {
//    public void processPayment(Payment payment) {
//        if (payment.getType().equals("credit")) {
//            // Process credit card payment
//        } else if (payment.getType().equals("debit")) {
//            // Process debit card payment
//        } else if (payment.getType().equals("paypal")) {
//            // Process PayPal payment
//        }
//        // Adding a new payment type requires modifying this class
//    }
//}

//=====================================
/*
Adding new payment methods requires modifying existing code
Risk of breaking existing functionality when adding new features
Complex conditional logic that will grow over time
===================================================
 */

/*
public interface PaymentMethod {
    void processPayment(Payment payment);
}

public class CreditCardPayment implements PaymentMethod {
    @Override
    public void processPayment(Payment payment) {
        // Process credit card payment
    }
}

public class DebitCardPayment implements PaymentMethod {
    @Override
    public void processPayment(Payment payment) {
        // Process debit card payment
    }
}

public class PayPalPayment implements PaymentMethod {
    @Override
    public void processPayment(Payment payment) {
        // Process PayPal payment
    }
}

public class PaymentProcessor {
    private Map<String, PaymentMethod> paymentMethods;

    public PaymentProcessor() {
        paymentMethods = new HashMap<>();
        paymentMethods.put("credit", new CreditCardPayment());
        paymentMethods.put("debit", new DebitCardPayment());
        paymentMethods.put("paypal", new PayPalPayment());
    }

    public void processPayment(Payment payment) {
        PaymentMethod paymentMethod = paymentMethods.get(payment.getType());
        paymentMethod.processPayment(payment);
    }
}

===================
New payment methods can be added without modifying existing code
Each payment method can be tested independently
The PaymentProcessor is simpler and more focused
 */


public class OCP {}