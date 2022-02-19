package ai.ecma.appeticketserver.service;

import com.stripe.model.Charge;

public interface PaymentService {
    Charge payWithStripe(double amount, String token);
}
