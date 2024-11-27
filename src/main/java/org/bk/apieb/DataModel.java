package org.bk.apieb;

import java.util.Locale;

public class DataModel {
    private String current = "0.0435";
    private String voltage= "240";

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {

//        this.price =  String.format(Locale.US, "%.2f", Integer.parseInt(current)*Integer.parseInt(voltage)*0.1);
        this.price =  price;
    }

    private String price = "0";

    public String getCurrent() {
        // return current;
        double currentValue = Double.parseDouble(current);

    // Add 0.0001
    currentValue += 0.0001;

    // Convert the result back to a string
    current = String.format("%.4f", currentValue);
        return current;
    }

    public void setCurrent(String current) {
        // this.current = current;
        

    // Convert the string to a double
    double currentValue = Double.parseDouble(current);

    // Add 0.0001
    currentValue += 0.0001;

    // Convert the result back to a string
    current = String.format("%.4f", currentValue);
        
    }

    public String getVoltage() {
        return voltage;
    }

    public void setVoltage(String voltage) {
        // this.voltage = voltage;
        this.voltage = "240";
    }

    public DataModel(String current, String voltage) {
        this.current = current;
        this.voltage = voltage;
    }
}
