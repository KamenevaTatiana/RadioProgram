package ru.netology.services;

public class Radio {
    private int currentRadioStation;
    private int currentVolume;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < 0) {
            return;
        }
        if (newCurrentRadioStation > 9) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            newCurrentVolume = 0;
        }
        if (newCurrentVolume > 100) {
            newCurrentVolume = 100;
        }
        currentVolume = newCurrentVolume;
    }

    public void next() {
        if (currentRadioStation >= 9) {
            currentRadioStation = 0;
            return;
        }
        currentRadioStation = currentRadioStation + 1;
    }

    public void prev() {
        if (currentRadioStation <= 0) {
            currentRadioStation = 9;
            return;
        }
        currentRadioStation = currentRadioStation - 1;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}
