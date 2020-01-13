package com.qa.natelephone;

import java.util.Objects;

public class TelephoneNumber {
    private String telno;

    public TelephoneNumber(String telno) throws BadNumberException {
        this.telno = telno;
    }

    public String getTelno(){
        if (telno.startsWith("+1")){
            return telno;
        }
        else return telno.substring(0,2);
    }
    public void setTelno(String telno) {
        this.telno = telno;
    }
}