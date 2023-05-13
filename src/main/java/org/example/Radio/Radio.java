package org.example.Radio;

public class Radio {
    private int numberRadioStation;
    private int amountStation = 10;
    private int minStation = 0;
    private int maxStation = 9;
    private int minVolume = 0;
    private int maxVolume = 100;
    private int volume;

    public Radio() {
    }

    public Radio(int amountStation) {
        this.amountStation = amountStation;
        this.maxStation = this.amountStation - 1;
    }


    public int getAmountStation() {
        return amountStation;
    }

    public int getMinStation() {
        return minStation;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public int getNumberRadioStation() {
        return numberRadioStation;
    }

    public int getVolume() {
        return volume;
    }


    public void setNumberNow(int newNumberNow) {
        if (newNumberNow < 0) {
            newNumberNow = 0;
        }
        if (newNumberNow > 9) {
            newNumberNow = 0;
        }
        numberRadioStation = newNumberNow;
    }

    public void NextNumber() {
        if (numberRadioStation < 9) {
            numberRadioStation = numberRadioStation + 1;
        }
    }

    public void PrevNumber() {
        if (numberRadioStation > 0) {
            numberRadioStation = numberRadioStation - 1;
        }
    }

    public void setChangeVolume(int newChangeVolume) {
        if (newChangeVolume > 100) {
            newChangeVolume = 100;
        }
        if (newChangeVolume < 0) {
            newChangeVolume = 0;
        }
        volume = newChangeVolume;
    }

    public void NextVolume() {
        int target = volume + 1;
        setChangeVolume(target);
    }

    public void PrevVolume() {
        int target2 = volume - 1;
        setChangeVolume(target2);
    }
}
