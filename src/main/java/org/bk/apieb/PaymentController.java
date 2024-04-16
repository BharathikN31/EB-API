package org.bk.apieb;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.crypto.Data;
import java.util.Random;

@RestController
public class PaymentController {

    @GetMapping("/paymentData")
    public DataModel getPaymentData() {
        // Mocked data - ideally, this would come from a service or database
        Random random = new Random();
        int voltage = random.nextInt(900) + 100;
        int current = random.nextInt(900) + 100;
        DataModel paymentData = new DataModel(String.valueOf(current), String.valueOf(voltage));
        // You can add logic here to fetch payment data based on userId and paymentId
        paymentData.setPrice();
        return paymentData;
    }
}
