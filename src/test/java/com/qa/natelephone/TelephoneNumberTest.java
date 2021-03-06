package com.qa.natelephone;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;


public class TelephoneNumberTest {

    public TelephoneNumberTest(){

    }

    @Test
    public void right_number_starts_with_plus_one() throws BadNumberException {

        //arrange
        String initialnumber = "+1 (608) 555-1212";
        TelephoneNumber telephoneNumber=new TelephoneNumber(initialnumber);
        String expectedfirsttwoints="+1";

        //act
        String result=telephoneNumber.getTelno().substring(0,2);

        //assert
        assertEquals(expectedfirsttwoints,result);

    }

    @Test
    public void wrong_number_without_plus_one_rejected() throws BadNumberException {

        //arrange
        String initialnumber = "01 (608) 555-1212";
        TelephoneNumber telephoneNumber=new TelephoneNumber(initialnumber);
        String expectedreturn="01";

        //act
        String result=telephoneNumber.getTelno().substring(0,2);

        //assert
        assertEquals(expectedreturn,result);

    }
    @Test
    public void right_number_is_12_characters_long() throws BadNumberException {
        //arrange
        String initialnumber = "+16085551212";
        TelephoneNumber telephoneNumber=new TelephoneNumber(initialnumber);
        int expectedLength=12;

        //act
        int result=telephoneNumber.getTelno().length();

        //assert
        assertEquals(expectedLength,result);
    }


    @Test
    public void wrong_number_is_12_characters_long() throws BadNumberException {
        //arrange
        String initialnumber = "+1 (608) 555-1212";
        TelephoneNumber telephoneNumber=new TelephoneNumber(initialnumber);
        String expectedNumber="+16085551212";

        //act
        String result=telephoneNumber.getTelno();

        //assert
        assertEquals(expectedNumber,result);
    }

}
