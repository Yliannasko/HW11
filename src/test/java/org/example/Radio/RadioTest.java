package org.example.Radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    // Radio radio = new Radio(89);
    @Test
    public void shouldSetNumberNow0() {
        Radio radio1 = new Radio(10);
        Assertions.assertEquals(10, radio1.getAmountStation());

        Radio radio2 = new Radio(11);
        Assertions.assertEquals(11, radio2.getAmountStation());
    }

    @Test
    public void shouldMinMaxStation() {
        Radio radio3 = new Radio(15);
        Assertions.assertEquals(14, radio3.getMaxStation());
        Assertions.assertEquals(0, radio3.getMinStation());
    }

    @Test
    public void shouldSetNumberNow() {
        Radio radio = new Radio();
        radio.setNumberNow(12);
        radio.getNumberRadioStation();
        int expected = 0;
        int actual = radio.getNumberRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNumberNow2() {
        Radio radio = new Radio();
        radio.setNumberNow(5);
        radio.getNumberRadioStation();
        int expected = 5;
        int actual = radio.getNumberRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNumberNow3() {
        Radio radio = new Radio();
        radio.setNumberNow(-1);
        radio.getNumberRadioStation();
        int expected = 0;
        int actual = radio.getNumberRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setNumberNow5() {
        Radio radio = new Radio();
        radio.setNumberNow(0);
        radio.getNumberRadioStation();
        int expected = 0;
        int actual = radio.getNumberRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextNumber() {
        Radio radio = new Radio();
        radio.setNumberNow(2);
        radio.NextNumber();
        int expected = 3;
        int actual = radio.getNumberRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextNumber2() {
        Radio radio = new Radio();
        radio.setNumberNow(9);
        radio.NextNumber();
        int expected = 9;
        int actual = radio.getNumberRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextNumber3() {
        Radio radio = new Radio();
        radio.NextNumber();
        radio.setNumberNow(10);
        int expected = 0;
        int actual = radio.getNumberRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextNumber4() {
        Radio radio = new Radio();
        radio.NextNumber();
        radio.setNumberNow(-2);
        int expected = 0;
        int actual = radio.getNumberRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextNumber5() {
        Radio radio = new Radio();
        radio.NextNumber();
        radio.setNumberNow(0);
        int expected = 0;
        int actual = radio.getNumberRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevNumber() {
        Radio radio = new Radio();
        radio.setNumberNow(5);
        radio.PrevNumber();
        int expected = 4;
        int actual = radio.getNumberRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevNumber2() {
        Radio radio = new Radio();
        radio.PrevNumber();
        radio.setNumberNow(-1);
        int expected = 0;
        int actual = radio.getNumberRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevNumber3() {
        Radio radio = new Radio();
        radio.setNumberNow(0);
        radio.PrevNumber();
        int expected = 0;
        int actual = radio.getNumberRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevNumber4() {
        Radio radio = new Radio();
        radio.setNumberNow(11);
        radio.PrevNumber();
        int expected = 0;
        int actual = radio.getNumberRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevNumber5() {
        Radio radio = new Radio();
        radio.setNumberNow(9);
        radio.PrevNumber();
        int expected = 8;
        int actual = radio.getNumberRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetChangeVolume() {
        Radio radio = new Radio();
        radio.setChangeVolume(99);
        radio.getVolume();
        int expected = 99;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetChangeVolume2() {
        Radio radio = new Radio();
        radio.setChangeVolume(101);
        radio.getVolume();
        int expected = 100;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetChangeVolume3() {
        Radio radio = new Radio();
        radio.setChangeVolume(-2);
        radio.getVolume();
        int expected = 0;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextVolume() {
        Radio radio = new Radio();
        radio.setChangeVolume(99);
        radio.NextVolume();
        int expected = 100;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextVolume2() {
        Radio radio = new Radio();
        radio.NextVolume();
        radio.setChangeVolume(102);
        int expected = 100;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextVolume3() {
        Radio radio = new Radio();
        radio.NextVolume();
        radio.setChangeVolume(-1);
        int expected = 0;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextVolume4() {
        Radio radio = new Radio();
        radio.NextVolume();
        radio.setChangeVolume(100);
        int expected = 100;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextVolume5() {
        Radio radio = new Radio();
        radio.NextVolume();
        radio.setChangeVolume(0);
        int expected = 0;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevVolume() {
        Radio radio = new Radio();
        radio.setChangeVolume(99);
        radio.PrevVolume();
        int expected = 98;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevVolume2() {
        Radio radio = new Radio();
        radio.PrevVolume();
        radio.setChangeVolume(101);
        int expected = 100;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevVolume3() {
        Radio radio = new Radio();
        radio.PrevVolume();
        radio.setChangeVolume(0);
        int expected = 0;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevVolume4() {
        Radio radio = new Radio();
        radio.PrevVolume();
        radio.setChangeVolume(-2);
        int expected = 0;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevVolume5() {
        Radio radio = new Radio();
        radio.setChangeVolume(100);
        radio.PrevVolume();
        int expected = 99;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

}
