package com.example.androidass.mar8;

public class Contacts {
    private final int contactImageId;
    private final String contactName;
    private final String contactNumber;

    public Contacts(int contactImageId, String contactName, String contactNumber) {
        this.contactImageId = contactImageId;
        this.contactName = contactName;
        this.contactNumber = contactNumber;
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

}