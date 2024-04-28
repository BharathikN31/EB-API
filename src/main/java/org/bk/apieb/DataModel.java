package org.bk.apieb;

public class DataModel {
    private String current;
    private String voltage;

    public String getPrice() {
        return price;
    }

    public void setPrice() {

        this.price =  String.format(Locale.US, "%.2f", Integer.parseInt(current)*Integer.parseInt(voltage)*0.1);
    }

    private String price;

    public String getCurrent() {
        return current;
    }

    public void setCurrent(String current) {
        this.current = current;
    }

    public String getVoltage() {
        return voltage;
    }

    public void setVoltage(String voltage) {
        this.voltage = voltage;
    }

    public DataModel(String current, String voltage) {
        this.current = current;
        this.voltage = voltage;
    }
}
