package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void setVolume() {
        Radio vol = new Radio();
        vol.setVol(5);
        int actual = vol.getVol();
        assertEquals(5, actual);
    }

    @Test
    public void setVolumeOverLimit() {
        Radio vol = new Radio();
        vol.setVol(15);
        int actual = vol.getVol();
        assertEquals(10, actual);
    }

    @Test
    public void setStation() {
        Radio station = new Radio();
        station.setStation(5);
        int actual = station.getStation();
        assertEquals(5, actual);
    }

    @Test
    public void setStationOverLimitPlus() {
        Radio station = new Radio();
        station.setStation(10);
        int actual = station.getStation();
        assertEquals(0, actual);
    }

    @Test
    public void setStationOverLimitMinus() {
        Radio station = new Radio();
        station.setStation(-1);
        int actual = station.getStation();
        assertEquals(9, actual);
    }

    @Test
    public void volPlus() {
        Radio vol = new Radio();
        vol.setVol(5);
        vol.plusVol();
        int actual = vol.getVol();
        assertEquals(6, actual);
    }

    @Test
    public void volPlusMax() {
        Radio vol = new Radio();
        vol.setVol(10);
        vol.plusVol();
        int actual = vol.getVol();
        assertEquals(10, actual);
    }

    @Test
    public void volMinus() {
        Radio vol = new Radio();
        vol.setVol(4);
        vol.minusVol();
        int actual = vol.getVol();
        assertEquals(3, actual);
    }

    @Test
    public void volMinusMin() {
        Radio vol = new Radio();
        vol.setVol(0);
        vol.minusVol();
        int actual = vol.getVol();
        assertEquals(0, actual);
    }

    @Test
    public void volMinusFor100() {
        Radio vol = new Radio();
        vol.setVol(-1);
        vol.minusVol();
        int actual = vol.getVol();
        assertEquals(0, actual);
    }

    @Test
    public void stationPlus() {
        Radio station = new Radio();
        station.setStation(5);
        station.plusStation();
        int actual = station.getStation();
        assertEquals(6, actual);
    }

    @Test
    public void stationPlusMax() {
        Radio station = new Radio();
        station.setStation(9);
        station.plusStation();
        int actual = station.getStation();
        assertEquals(0, actual);
    }

    @Test
    public void stationMinus() {
        Radio station = new Radio();
        station.setStation(5);
        station.minusStation();
        int actual = station.getStation();
        assertEquals(4, actual);
    }

    @Test
    public void stationMinusMin() {
        Radio station = new Radio();
        station.setStation(0);
        station.minusStation();
        int actual = station.getStation();
        assertEquals(9, actual);
    }
}
//comment for pushing and trying actions