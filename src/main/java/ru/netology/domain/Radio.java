package ru.netology.domain;

public class Radio {
    public int vol;
    public int station;

    public int getVol(){
        return vol;
    }

    public int getStation(){
        return station;
    }

    public  void setVol(int newVol){
        if (newVol > 10) {
            vol = 10;
            return;
        }
        if (newVol < 0){
            vol = 0;
        }
        vol = newVol;
    }

    public int volPlus1() {
        if (vol < 10) {
            vol = vol + 1;
        }
        return vol;
    }

    public int volMinus1() {
        if (vol > 0) {
            vol = vol - 1;
        }
        return vol;
    }


    public void setStation(int newStation) {
        if (newStation > 10) {
            station = 0;
            return;
        }
        station = newStation;
    }
}
