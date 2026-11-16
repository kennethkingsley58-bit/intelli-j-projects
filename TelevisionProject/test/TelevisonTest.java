import org.junit.Test;

import static org.junit.Assert.*;

public class TelevisonTest {

    @Test
    public void televisionIsOffWhenBought() {
        Television tv = new Television();

        assertFalse(tv.isOn());
    }

    @Test

    public void testThatTelevisionTurnOn() {
        Television tv = new Television();

        tv.turnOn();

        assertTrue(tv.isOn());

    }

    @Test

    public void testThatTelevisionTurnOff() {
        Television tv = new Television();

        tv.turnOn();
        tv.turnOff();

        assertFalse(tv.isOn());
    }

    @Test

    public void testThatTelevisionCanIncreaseVolume() {
        Television tv = new Television();

        tv.turnOn();
        tv.increaseVolume();

        assertEquals(11, tv.getVolume());
    }

    @Test

    public void testThatTelevisionDecreaseVolume() {
        Television tv = new Television();

        tv.turnOn();
        tv.increaseVolume();
        tv.decreaseVolume();

        assertEquals(10, tv.getVolume());
    }

    @Test

    public void testThatTelevisionCanChangeChannel() {
        Television tv = new Television();

        tv.turnOn();
        tv.changeChannel(5);

        assertEquals(5, tv.getChannel());
    }


    @Test

    public void testThatTelevisionCanMute() {
        Television tv = new Television();

        tv.turnOn();
        tv.mute();

        assertTrue(tv.isMuted());
    }

    @Test

    public void testThatTelevisionCanUnmute() {
        Television tv = new Television();

        tv.turnOn();
        tv.mute();
        tv.unmute();

        assertFalse(tv.isMuted());
    }

    @Test

    public void testThatTelevisionCanConnectToWifi() {
        Television tv = new Television();

        tv.turnOn();
        tv.connectToWifi("semicolon wifi");

        assertTrue(tv.isWifiConnected());
    }

    @Test
    public void testThatTelevisionCanDisconnectWifi() {
        Television tv = new Television();

        tv.turnOn();
        tv.connectToWifi("semicolon wifi");
        tv.disconnectWifi();

        assertFalse(tv.isWifiConnected());
    }

    @Test
    public void testThatTheTelevisionCanOpenApp() {
        Television tv = new Television();

        tv.turnOn();
        tv.openApp("PrimeTv");

        assertTrue(tv.isAppOpen());
    }

    @Test
    public void testThatTheTelevisionCanCloseApp() {
        Television tv = new Television();

        tv.turnOn();
        tv.openApp("PrimeTv");
        tv.closeApp();

        assertFalse(tv.isAppOpen());
    }

    @Test
    public void testThatTheTelevisionCanPlayMovie() {
        Television tv = new Television();

        tv.turnOn();
        tv.playMovie("Money Heist");

        assertTrue(tv.isPlaying());
        assertEquals("Money Heist", tv.getCurrentMovie());
    }

    @Test

    public void testThatTheTelevisionCanPauseMovie() {
        Television tv = new Television();

        tv.turnOn();
        tv.playMovie("Money Heist");
        tv.pauseMovie();

        assertFalse(tv.isPlaying());
    }

    @Test

    public void testThatTheTelevisionVolumeCannotExceed100() {
        Television tv = new Television();

        tv.turnOn();

        for (int index = 0; index < 150; index++) {
            tv.increaseVolume();
        }

        assertEquals(100, tv.getVolume());
    }

    @Test

    public void testTheTheTelevisionVolumeCannotGoBelowZero() {
        Television tv = new Television();

        tv.turnOn();

        for (int index = 0; index < 150; index++) {
            tv.decreaseVolume();
        }

        assertEquals(0, tv.getVolume());
    }

    @Test

    public void testTheTheTelevisionInvalidChannel() {
        Television tv = new Television();

        tv.turnOn();
        tv.changeChannel(-5);

        assertEquals(1, tv.getChannel());
    }

    @Test

    public void testTheTheTelevisionVolumeCannotChangeWhenTvIsOff() {
        Television tv = new Television();

        tv.increaseVolume();

        assertEquals(1, tv.getChannel());
    }

    @Test

    public void testTheTheTelevisionAppCannotOpenWhenTvIsOff(){
        Television tv = new Television();

        tv.openApp("primeTv");

        assertFalse(tv.isAppOpen());
    }

    @Test

    public void testThatMovieCannotPlayWhenTvIsOff() {
        Television tv = new Television();

        tv.playMovie("Money Heist");

        assertFalse(tv.isPlaying());
    }

}