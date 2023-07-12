package de.neueFische;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void startRadioCheck(){
        //given
        Smartphone smartPhone1 = new Smartphone();

        //when
        boolean actual = smartPhone1.startRadio();

        //then
        assertTrue(actual);
    }

    @Test
    void stopRadioCheck(){
        //given
        Smartphone smartPhone1 = new Smartphone();

        //when
        boolean actual = smartPhone1.stopRadio();

        //then
        assertFalse(actual);
    }

    @Test
    void getPositionCheck(){
        //given
        Smartphone smartPhone1 = new Smartphone();
        String expected = "Köln";

        //when
        String actual = smartPhone1.getPosition();

        //then
        assertEquals(expected, actual);
    }


}