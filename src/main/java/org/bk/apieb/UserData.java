package org.bk.apieb;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UserData {
    public void setName(String name) {
        Name = name;
    }

    public String getConsumerNo() {
        return ConsumerNo;
    }

    public void setConsumerNo(String consumerNo) {
        ConsumerNo = consumerNo;
    }

    public String getMeterNo() {
        return MeterNo;
    }

    public void setMeterNo(String meterNo) {
        MeterNo = meterNo;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }
    public String Name;
    public String ConsumerNo;
    public String MeterNo;
    public String Address;
    public String Term;
    public String getTerm() {
        setTerm();
        return Term;}
    public void setTerm() {
        LocalDate today = null;

        today = LocalDate.now();


        // Subtract 2 months from today's date
        LocalDate twoMonthsBefore = today.minusMonths(2);

        // Format the date
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        Term =today+" to "+ twoMonthsBefore.format(formatter);

    }
    public String getName() {
        return Name;
    }

    public void Address(String s) {
        Address = s;
    }
}
