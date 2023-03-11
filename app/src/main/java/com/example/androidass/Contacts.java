package com.example.androidass;

public class Contacts {
    private int contactImageId;
    private String contactName;
    private String contactNumber;

    private String contactQuirk;

    public Contacts(int contactImageId, String contactName, String contactNumber, String contactQuirk) {
        this.contactImageId = contactImageId;
        this.contactName = contactName;
        this.contactNumber = contactNumber;
        this.contactQuirk = contactQuirk;
    }

    public int getContactImageId() {
        return contactImageId;
    }

    public String getContactName() {
        return contactName;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public String getContactQuirk() {
        return contactQuirk;
    }
}
