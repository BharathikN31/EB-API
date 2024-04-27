package org.bk.apieb;

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

    public String getName() {
        return Name;
    }

    public void Address(String s) {
        Address = s;
    }
}
