package ai.ecma.appeticketserver.service;

import ai.ecma.appeticketserver.exception.RestException;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


/**
 * @author Murtazayev Muhammad
 * @since 21.12.2021
 */
@Component
public class SmsService {

    @Value("${twilio.account_sid}")
    private String ACCOUNT_SID;

    @Value("${twilio.auth_token}")
    private String AUTH_TOKEN;

    @Value("${twilio.phone_number}")
    private String myPhoneNumber;

    public void sendMessage(String phoneNumber, String verificationCode) {
        System.out.println(verificationCode);
//        try {
//            Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
//            Message.creator(
//                    new PhoneNumber(phoneNumber),
//                    new PhoneNumber(myPhoneNumber),
//                    "Sizning tasdiqlash kodingiz: " + verificationCode + "\nBuni hech kimga bermang!!!"
//            ).create();
//        } catch (Exception e) {
//            throw RestException.serverError();
//        }
    }
}
