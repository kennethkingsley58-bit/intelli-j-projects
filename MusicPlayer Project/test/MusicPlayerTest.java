import org.junit.Test;

import static org.junit.Assert.*;

public class MusicPlayerTest {

    @Test

    public void testThatTheMusicPlayerCanTurnOn(){
        MusicPlayer mp = new MusicPlayer();

        assertFalse(mp.isOn());
    }

    @Test
    public void testThatTheMusicPlayerCanTurnOff(){
        MusicPlayer mp = new MusicPlayer();

        mp.turnOn();
        mp.turnOff();

        assertFalse(mp.isOn());
    }

    @Test
    public void testThatMusicPlayerCanConnectBluetooth(){
        MusicPlayer mp = new MusicPlayer();

        mp.turnOn();
        mp.connectBluetooth();

        assertTrue(mp.isBluetoothConnected());
    }

    @Test
    public void testThatTheMusicPlayerCanDisconnectBluetooth(){
        MusicPlayer mp = new MusicPlayer();

        mp.turnOn();;
        mp.connectBluetooth();
        mp.disconnectBluetooth();

        assertFalse(mp.isBluetoothConnected());
    }

    @Test

    public void testThatTheMusicPlayerCanTurnOnFmRadio(){
        MusicPlayer mp = new MusicPlayer();

        mp.turnOn();
        mp.turnOnFmRadio();

        assertTrue(mp.isFmRadioOn());
    }

    @Test

    public void testThatTheMusicPlayerCanTurnOffFmRadio(){
        MusicPlayer mp = new MusicPlayer();

        mp.turnOn();
        mp.turnOnFmRadio();
        mp.turnOffFmRadio();

        assertFalse(mp.isFmRadioOn());
    }

    @Test

    public void testThatTheMusicPlayerCanSwitchFromFmRadioToBluetooth(){
        MusicPlayer mp = new MusicPlayer();

        mp.turnOn();
        mp.turnOnFmRadio();
        mp.connectBluetooth();

        assertTrue(mp.isBluetoothConnected());
        assertFalse(mp.isFmRadioOn());
    }

    @Test

    public void testThatTheMusicPlayerCanSwitchFromBluetoothToFmRadio(){
        MusicPlayer mp = new MusicPlayer();

        mp.turnOn();
        mp.connectBluetooth();
        mp.turnOnFmRadio();

        assertTrue(mp.isFmRadioOn());
        assertFalse(mp.isBluetoothConnected());
    }


    @Test

    public void testThatTheMusicPlayerPlaySong(){
        MusicPlayer mp = new MusicPlayer();

        mp.turnOn();
        mp.addSong("song 1");
        mp.playSong();

        assertTrue(mp.isPlaying());
    }

    @Test

    public void testThatTheMusicPlayerCanPauseSong(){
        MusicPlayer mp = new MusicPlayer();

        mp.turnOn();
        mp.playSong();
        mp.pauseSong();

        assertFalse(mp.isPlaying());
    }

    @Test

    public void testThatTheMusicPlayerCanResumeSong(){
        MusicPlayer mp = new MusicPlayer();

        mp.turnOn();
        mp.playSong();
        mp.pauseSong();
        mp.resumeSong();

        assertTrue(mp.isPlaying());
    }

    @Test

    public void testThatTheMusicPlayerCanStopSong(){
        MusicPlayer mp = new MusicPlayer();

        mp.turnOn();
        mp.playSong();
        mp.stopSong();

        assertFalse(mp.isPlaying());
    }

    @Test
    public void testThatTheMusicPlayerCanGoToNextSong(){
        MusicPlayer mp = new MusicPlayer();

        mp.turnOn();
        mp.addSong("song 1");
        mp.addSong("song 2");
        mp.addSong("song 3");

        mp.playSong();
        mp.nextSong();

        assertEquals("song 2", mp.getCurrentSong());
    }

    @Test

    public void testThatTheMusicPlayerCanGoBackToPreviousSong(){
        MusicPlayer mp = new MusicPlayer();

        mp.turnOn();
        mp.addSong("song 1");
        mp.addSong("song 2");
        mp.addSong("song 3");

        mp.playSong();
        mp.nextSong();
        mp.previousSong();

        assertEquals("song 1", mp.getCurrentSong());
    }

    @Test

    public void testInvalidSongIndex(){
        MusicPlayer mp = new MusicPlayer();

        mp.turnOn();
        mp.addSong("song 1");
        mp.addSong("song 2");

        mp.playSong();
        mp.nextSong();
        mp.nextSong();

        assertEquals("song 2", mp.getCurrentSong());
    }

    @Test

    public void testThatTheMusicPlayerPlaysEmptyPlayList(){
        MusicPlayer mp = new MusicPlayer();

        mp.turnOn();
        mp.playSong();

        assertFalse(mp.isPlaying());
    }

    @Test

    public void testTheMaximumVolumeOfTheMusicPlayer(){
        MusicPlayer mp = new MusicPlayer();

        mp.increaseVolume();

        for(int index = 0; index < 100; index++){
            mp.increaseVolume();
        }
        assertEquals(null, mp.getCurrentSong());
    }

    @Test

    public void testTheMinimumVolumeOfTheMusicPlayer(){
        MusicPlayer mp = new MusicPlayer();

        mp.decreaseVolume();
        for(int index = 0; index < 100; index++){
            mp.decreaseVolume();
        }
        assertEquals(0, mp.getVolume());
    }

    @Test
    public void testThatTheMusicPlayerCanMutePlayer() {
        MusicPlayer mp = new MusicPlayer();

        mp.mute();

        assertTrue(mp.isMuted());
    }

    @Test
    public void testThatTheMusicPlayerCanUnmutePlayer() {
        MusicPlayer mp = new MusicPlayer();

        mp.mute();
        mp.unmute();

        assertFalse(mp.isMuted());
    }

    @Test
    public void testBluetoothCannotConnectWhenPlayerIsOff() {
        MusicPlayer mp = new MusicPlayer();

        mp.connectBluetooth();

        assertFalse(mp.isBluetoothConnected());
    }

    @Test
    public void testBluetoothDisconnectsWhenPlayerIsOff() {
        MusicPlayer mp = new MusicPlayer();

        mp.turnOn();
        mp.connectBluetooth();
        mp.turnOff();

        assertFalse(mp.isBluetoothConnected());
    }

    @Test
    public void testFMRadioCannotTurnOnWhenPlayerIsOff() {
        MusicPlayer mp = new MusicPlayer();

        mp.turnOnFmRadio();

        assertFalse(mp.isFmRadioOn());
    }

    @Test
    public void testFMRadioTurnsOffWithMusicPlayer() {
        MusicPlayer mp = new MusicPlayer();

        mp.turnOn();
        mp.turnOnFmRadio();
        mp.turnOff();

        assertFalse(mp.isFmRadioOn());
    }
}
