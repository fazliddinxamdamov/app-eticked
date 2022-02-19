package ai.ecma.appeticketserver.service;

import com.stripe.Stripe;
import com.stripe.model.Charge;
import com.stripe.param.ChargeCreateParams;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class PaymentServiceImpl implements PaymentService {
    @Value(value = "${stripe.secret-key}")
    private String secretKey;

    @Override
    @SneakyThrows
    public Charge payWithStripe(double amount, String token) {
        Stripe.apiKey = secretKey;

        ChargeCreateParams createParams = ChargeCreateParams.builder()
                .setAmount((long) (amount * 100))
                .setCurrency("uzs")
                .setSource(token)
                .build();

        Charge charge = Charge.create(createParams);
        return charge;
    }
}
