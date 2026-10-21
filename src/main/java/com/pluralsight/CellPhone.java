package com.pluralsight;

public class CellPhone {

    private int serialNumber;   // a whole number, ex: 1000000 - 9999999
    private String model;       // ex: iPhone X
    private String carrier;     // ex: AT&T
    private String phoneNumber; // a String, not a number: it contains dashes, ex: 800-555-5555
    private String owner;       // ex: Dana Wyatt

    public CellPhone() {
        serialNumber = 0;
        model = "";
        carrier = "";
        phoneNumber = "";
        owner = "";
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void cellPhone1(String dial) {
    this.cellPhone1("888-555-2222");
    }
}
