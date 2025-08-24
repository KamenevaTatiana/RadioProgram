package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetPreMaxRadioStation() {
        Radio station = new Radio();

        station.setCurrentRadioStation(8);

        int expected = 8;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPreMaxVolume() {
        Radio volume = new Radio();

        volume.setCurrentVolume(99);

        int expected = 99;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationAboveMax() {
        Radio station = new Radio();

        station.setCurrentRadioStation(10);

        int expected = 0;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMaxRadioStation() {
        Radio station = new Radio();

        station.setCurrentRadioStation(9);

        int expected = 9;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationBelowMin() {
        Radio station = new Radio();

        station.setCurrentRadioStation(-1);

        int expected = 0;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMinRadioStation() {
        Radio station = new Radio();

        station.setCurrentRadioStation(0);

        int expected = 0;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPostMinRadioStation() {
        Radio station = new Radio();

        station.setCurrentRadioStation(1);

        int expected = 1;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeAboveMax() {
        Radio volume = new Radio();

        volume.setCurrentVolume(101);

        int expected = 100;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMaxVolume() {
        Radio volume = new Radio();

        volume.setCurrentVolume(100);

        int expected = 100;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMinVolume() {
        Radio volume = new Radio();

        volume.setCurrentVolume(0);

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeBelowMin() {
        Radio volume = new Radio();

        volume.setCurrentVolume(-1);

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPostMinVolume() {
        Radio volume = new Radio();

        volume.setCurrentVolume(1);

        int expected = 1;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextStationAboveMax() {
        Radio station = new Radio();
        station.setCurrentRadioStation(9);

        station.next();

        int expected = 0;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextStation() {
        Radio station = new Radio();
        station.setCurrentRadioStation(8);

        station.next();

        int expected = 9;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevStationBelowMin() {
        Radio station = new Radio();
        station.setCurrentRadioStation(0);

        station.prev();

        int expected = 9;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevStation() {
        Radio station = new Radio();
        station.setCurrentRadioStation(1);

        station.prev();

        int expected = 0;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotIncreaseVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(100);

        volume.increaseVolume();

        int expected = 100;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(99);

        volume.increaseVolume();

        int expected = 100;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotDecreaseVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(0);

        volume.decreaseVolume();

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(1);

        volume.decreaseVolume();

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}
