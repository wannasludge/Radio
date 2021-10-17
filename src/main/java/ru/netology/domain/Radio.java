package ru.netology.domain;

public class Radio {
    private int currentVol;
    private int currentStation;

    public int getVol() {
        return currentVol;
    }

    public int getStation() {
        return currentStation;
    }

    public void setVol(int currentVol) {
        if (currentVol > 10) {
            this.currentVol = 10;
            return;
        }
        if (currentVol < 0) {
            this.currentVol = 0;
            return;
        }
        this.currentVol = currentVol;
    }

    public void plusVol() {
        if (currentVol < 10) {
            int newVol = currentVol + 1;
            setVol(newVol);
        }
    }

    public void minusVol() {
        if (currentVol > 0) {
            int newVol = currentVol - 1;
            setVol(newVol);
        }
    }


    public void setStation(int currentStation) {
        if (currentStation > 9) {
            this.currentStation = 0;
            return;
        }
        if (currentStation < 0) {
            this.currentStation = 9;
            return;
        }
        this.currentStation = currentStation;
    }

    public void plusStation() {
        if (currentStation == 9) {
            currentStation = 0;
            return;
        }
        int newStation = currentStation + 1;
        setStation(newStation);
    }

    public void minusStation() {
        if (currentStation == 0) {
            currentStation = 9;
            return;
        }
        int newStation = currentStation - 1;
        setStation(newStation);
    }

}
