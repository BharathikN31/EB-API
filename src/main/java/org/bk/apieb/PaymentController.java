package org.bk.apieb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Random;

@RestController
public class PaymentController {
    private static String currentView="0";
    private static String voltageView ="0";
    private String priceView = "0";

    HashMap<String, UserData> data = new HashMap<>();

    // Initialize user data
    UserData userData = new UserData();

    {
        userData.setName("Bharathi K");
        userData.setConsumerNo("283111102003");
        userData.setMeterNo("0401");
        userData.setAddress("7,DLF IT Park,TN-98");
        data.put("bharathi@pw.org", userData);
    }

    @GetMapping("/paymentData")
    public DataModel getPaymentData() {
        // Mocked data - ideally, this would come from a service or database
        System.out.println("Data Requested By PW");
        Random random = new Random();
//        int voltage = random.nextInt(900) + 100;
//        int voltage = Integer.parseInt(voltageView);
//        int current = random.nextInt(900) + 100;
//        int current =  Integer.parseInt(currentView);
        DataModel paymentData = new DataModel(String.valueOf(12), String.valueOf(12));
        System.out.println("!!!!PowerWise App is requesting Data!!!! @ " + System.currentTimeMillis());
        System.out.println("Current : " + paymentData.getCurrent());
        System.out.println("Voltage : " + paymentData.getVoltage());
        // You can add logic here to fetch payment data based on userId and paymentId
        paymentData.setPrice(String.valueOf(Double.parseDouble(priceView )+10));
        System.out.println("Price : " + paymentData.getPrice());
        System.out.println("Data Sent To PowerWise User @" + System.currentTimeMillis());
        return paymentData;
    }

    @GetMapping("/user")
    public UserData getUser(@RequestParam String email) {
        return data.get(email);
    }

    public void UpdateData(DataModel data){
            currentView=data.getCurrent();
            voltageView=data.getVoltage();
            priceView=data.getPrice();
            System.out.println("Data Updated");
    }
}
