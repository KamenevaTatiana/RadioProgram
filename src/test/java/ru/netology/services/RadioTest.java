package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldNotSetStationAboveMax() {
        Radio station = new Radio(20);

        station.setCurrentRadioStation(20);

        Assertions.assertEquals(0, station.getCurrentRadioStation());
        Assertions.assertEquals(0, station.getMinRadioStation());
        Assertions.assertEquals(19, station.getMaxRadioStation());
    }

    @Test
    public void shouldNotSetStationBelowMin() {
        Radio station = new Radio();

        station.setCurrentRadioStation(-1);

        Assertions.assertEquals(0, station.getCurrentRadioStation());
        Assertions.assertEquals(0, station.getMinRadioStation());
        Assertions.assertEquals(9,station.getMaxRadioStation());
    }

    @Test
    public void shouldSetRadioStation() {
        Radio station = new Radio();

        station.setCurrentRadioStation(3);

        Assertions.assertEquals(3, station.getCurrentRadioStation());
        Assertions.assertEquals(0, station.getMinRadioStation());
        Assertions.assertEquals(9, station.getMaxRadioStation());
    }

    @Test
    public void shouldNotSetVolumeAboveMax() {
        Radio volume = new Radio();

        volume.setCurrentVolume(101);

        Assertions.assertEquals(100, volume.getCurrentVolume());
        Assertions.assertEquals(0, volume.getMinVolume());
        Assertions.assertEquals(100, volume.getMaxVolume());
    }

    @Test
    public void shouldSetVolume() {
        Radio volume = new Radio();

        volume.setCurrentVolume(45);

        Assertions.assertEquals(45, volume.getCurrentVolume());
        Assertions.assertEquals(0, volume.getMinVolume());
        Assertions.assertEquals(100, volume.getMaxVolume());
    }

    @Test
    public void shouldNotSetVolumeBelowMin() {
        Radio volume = new Radio();

        volume.setCurrentVolume(-1);

        Assertions.assertEquals(0, volume.getCurrentVolume());
        Assertions.assertEquals(0, volume.getMinVolume());
        Assertions.assertEquals(100, volume.getMaxVolume());
    }

    @Test
    public void shouldNextStationAboveMax() {
        Radio station = new Radio(16);
        station.setCurrentRadioStation(15);

        station.next();

        Assertions.assertEquals(0, station.getCurrentRadioStation());
        Assertions.assertEquals(0, station.getMinRadioStation());
        Assertions.assertEquals(15, station.getMaxRadioStation());
    }

    @Test
    public void shouldNextStation() {
        Radio station = new Radio();
        station.setCurrentRadioStation(3);

        station.next();

        Assertions.assertEquals(4, station.getCurrentRadioStation());
        Assertions.assertEquals(0, station.getMinRadioStation());
        Assertions.assertEquals(9, station.getMaxRadioStation());
    }

    @Test
    public void shouldPrevStationBelowMin() {
        Radio station = new Radio();
        station.setCurrentRadioStation(0);

        station.prev();

        Assertions.assertEquals(9, station.getCurrentRadioStation());
        Assertions.assertEquals(0, station.getMinRadioStation());
        Assertions.assertEquals(9, station.getMaxRadioStation());
    }

    @Test
    public void shouldPrevStation() {
        Radio station = new Radio();
        station.setCurrentRadioStation(1);

        station.prev();

        Assertions.assertEquals(0, station.getCurrentRadioStation());
        Assertions.assertEquals(0, station.getMinRadioStation());
        Assertions.assertEquals(9, station.getMaxRadioStation());
    }

    @Test
    public void shouldNotIncreaseVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(100);

        volume.increaseVolume();

        Assertions.assertEquals(100, volume.getCurrentVolume());
        Assertions.assertEquals(0, volume.getMinVolume());
        Assertions.assertEquals(100, volume.getMaxVolume());
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(99);

        volume.increaseVolume();

        Assertions.assertEquals(100, volume.getCurrentVolume());
        Assertions.assertEquals(0, volume.getMinVolume());
        Assertions.assertEquals(100, volume.getMaxVolume());
    }

    @Test
    public void shouldNotDecreaseVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(0);

        volume.decreaseVolume();

        Assertions.assertEquals(0, volume.getCurrentVolume());
        Assertions.assertEquals(0, volume.getMinVolume());
        Assertions.assertEquals(100, volume.getMaxVolume());
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(1);

        volume.decreaseVolume();

        Assertions.assertEquals(0, volume.getCurrentVolume());
        Assertions.assertEquals(0, volume.getMinVolume());
        Assertions.assertEquals(100, volume.getMaxVolume());
    }
}
