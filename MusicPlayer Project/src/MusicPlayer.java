import java.util.ArrayList;

public class MusicPlayer {

    private boolean isOn = false;
    private boolean bluetoothConnected = false;
    private boolean radioIsOn = false;
    private boolean isPlaying = false;
    private ArrayList<String> songs = new ArrayList<>();
    private int currentSongIndex = 0;
    private int volume = 50;
    private boolean isMuted = false;

    public void turnOn(){
        isOn = true;
    }

    public void turnOff(){
        isOn = false;
        isPlaying = false;
        bluetoothConnected = false;
        radioIsOn = false;

    }

    public boolean isOn(){
        return isOn;
    }

    public void connectBluetooth(){
        if(isOn){
            bluetoothConnected = true;
            radioIsOn = false;
        }
    }

    public void disconnectBluetooth(){
        bluetoothConnected = false;
    }

    public boolean  isBluetoothConnected(){
        return bluetoothConnected;
    }


    public void turnOnFmRadio(){
        if(isOn){
            radioIsOn = true;
            bluetoothConnected = false;
        }
    }

    public boolean isFmRadioOn(){
       return radioIsOn;
    }

    public void turnOffFmRadio(){
        radioIsOn = false;
    }

    public void playSong(){
        if(!isOn){
            System.out.println("Music player is Off");
        }else if(songs.isEmpty()){
            System.out.println("No songs available, please Add songs");
        }else {
            isPlaying = true;
            System.out.println("playing: " + getCurrentSong());
        }
    }

    public boolean isPlaying(){
        return isPlaying;
    }

    public void pauseSong(){
        if(isPlaying){
            isPlaying = false;
        }
    }

    public void resumeSong(){
        if(isOn){
            isPlaying = true;
        }
    }

    public void stopSong(){
        isPlaying = false;
    }

    public void nextSong(){
        if(isOn && currentSongIndex < songs.size() -1){
            currentSongIndex++;
        }
    }
    public void previousSong(){
        if(isOn && currentSongIndex > 0){
            currentSongIndex--;
        }
    }

    public void addSong(String song){
       songs.add(song);
    }

    public String getCurrentSong(){
        if(!songs.isEmpty()){
            return songs.get(currentSongIndex);
        }
        return null;
    }

    public void increaseVolume(){
        if(volume < 100){
            volume++;
        }
    }

    public void decreaseVolume(){
        if(volume > 0){
            volume--;
        }
    }

    public int getVolume(){
        return volume;
    }

    public void mute() {
        isMuted = true;
    }

    public boolean isMuted() {
        return isMuted;
    }

    public void unmute() {
        isMuted = false;
    }




}
