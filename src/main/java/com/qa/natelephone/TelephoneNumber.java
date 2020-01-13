package com.qa.natelephone;

public class TelephoneNumber {
    private String telno;

    public TelephoneNumber(String telno){
        this.telno=telno;
    }
    public String getTelno() {
        return telno.replaceAll("[\\s()-]","");
    }

    public void setTelno(String telno) {
        this.telno = telno;
    }
}
