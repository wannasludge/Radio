package ru.netology.domain;

public class Radio {
    private int numberOfStations = 10;
    private int maxVol = 100;
    private int minVol = 0;
    private int maxStation;
    private int minStation = 0;
    private int currentVol = calculateCurrentVolume();
    private int currentStation;

    public Radio(int numberOfStations) {
        this.numberOfStations = numberOfStations;
        maxStation = calculateMaxStation();
        currentStation = calculateCurrentStation();
    }


    public Radio() {
        maxStation = calculateMaxStation();
        currentStation = calculateCurrentStation();
    }

    public int calculateMaxStation() {
        return numberOfStations - 1;
    }

    public int calculateCurrentStation() {
        return (minStation + maxStation) / 2;
    }

    public int calculateCurrentVolume() {
        return (minVol + maxVol) / 2;
    }

    public int getVol() {
        return currentVol;
    }

    public int getStation() {
        return currentStation;
    }

    public void setVol(int currentVol) {
        if (currentVol > maxVol) {
            this.currentVol = maxVol;
            return;
        }
        if (currentVol < minVol) {
            this.currentVol = 0;
            return;
        }
        this.currentVol = currentVol;
    }

    public void plusVol() {
        if (currentVol < maxVol) {
            int newVol = currentVol + 1;
            setVol(newVol);
        }
    }

    public void minusVol() {
        if (currentVol > minVol) {
            int newVol = currentVol - 1;
            setVol(newVol);
        }
    }


    public void setStation(int currentStation) {
        if (currentStation > maxStation) {
            this.currentStation = minStation;
            return;
        }
        if (currentStation < minStation) {
            this.currentStation = maxStation;
            return;
        }
        this.currentStation = currentStation;
    }

    public void plusStation() {
        if (currentStation == maxStation) {
            currentStation = minStation;
            return;
        }
        int newStation = currentStation + 1;
        setStation(newStation);
    }

    public void minusStation() {
        if (currentStation == minStation) {
            currentStation = maxStation;
            return;
        }
        int newStation = currentStation - 1;
        setStation(newStation);
    }

}
