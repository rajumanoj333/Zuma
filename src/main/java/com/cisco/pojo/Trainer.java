package com.cisco.pojo;
import java.util.Date;

public class Trainer {
    private int tid;
    private String tName;
    private String tPassword;
    private Date slotdate;
    private int slots;
    private String tEmail;
    private String tGender;

    // Getters and Setters

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName;
    }

    public String gettPassword() {
        return tPassword;
    }

    public void settPassword(String tPassword) {
        this.tPassword = tPassword;
    }

    public Date getSlotdate() {
        return slotdate;
    }

    public void setSlotdate(Date slotdate) {
        this.slotdate = slotdate;
    }

    public int getSlots() {
        return slots;
    }

    public void setSlots(int slots) {
        this.slots = slots;
    }

    public String gettEmail() {
        return tEmail;
    }

    public void settEmail(String tEmail) {
        this.tEmail = tEmail;
    }

    public String gettGender() {
        return tGender;
    }

    public void settGender(String tGender) {
        this.tGender = tGender;
    }
}
