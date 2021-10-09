package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    public void setVolume() {
        Radio vol = new Radio();
        vol.setVol(5);
        int actual = vol.getVol();
        assertEquals(10, actual);
    }

    @Test
    public void setStation() {
        Radio station = new Radio();
        station.setStation(15);
        int actual = station.getStation();
        assertEquals(0, actual);
    }

    @Test
    public void volPlus(){
        Radio vol = new Radio();
        vol.setVol(5);
        int actual = vol.volPlus1();
        assertEquals(6, actual);
    }

    @Test
    public void volPlusMax(){
        Radio vol = new Radio();
        vol.setVol(10);
        int actual = vol.volPlus1();
        assertEquals(10, actual);
    }

    @Test
    public void volMinus(){
        Radio vol = new Radio();
        vol.setVol(4);
        int actual = vol.volMinus1();
        assertEquals(3, actual);
    }

    @Test
    public void volMinusMin(){
        Radio vol = new Radio();
        vol.setVol(0);
        int actual = vol.volMinus1();
        assertEquals(0, actual);
    }
}