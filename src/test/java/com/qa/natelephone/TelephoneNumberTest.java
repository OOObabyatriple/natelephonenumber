package com.qa.natelephone;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;


public class TelephoneNumberTest {

    public TelephoneNumberTest(){

    }

    @Test
    public void right_number_starts_with_plus_one(){

        //arrange
        String initialnumber = "+1 (608) 555-1212";
        TelephoneNumber telephoneNumber=new TelephoneNumber(initialnumber);
        String expectedfirsttwoints="+1";

        //act
        String result=telephoneNumber.getTelno().substring(0,2);

        //assert
        assertEquals(result,expectedfirsttwoints);

    }
    @Test
    public void right_number_is_12_characters_long(){
        //arrange
        String initialnumber = "+16085551212";
        TelephoneNumber telephoneNumber=new TelephoneNumber(initialnumber);
        int expectedLength=12;

        //act
        int result=telephoneNumber.getTelno().length();

        //assert
        assertEquals(result,expectedLength);
    }


    @Test
    public void wrong_number_is_12_characters_long(){
        //arrange
        String initialnumber = "+1 (608) 555-1212";
        TelephoneNumber telephoneNumber=new TelephoneNumber(initialnumber);
        String expectedNumber="+16085551212";

        //act
        String result=telephoneNumber.getTelno();

        //assert
        assertEquals(result,expectedNumber);
    }

}
