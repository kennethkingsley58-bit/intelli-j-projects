public class Television {

    private boolean isOn = false;
    private int volume = 10;
    private int channel = 1;
    private boolean isMuted = false;
    private boolean wifiConnected = false;
    private String wifiName;
    private String currentApp;
    private String currentMovie;
    private boolean isPlaying = false;


    public boolean isOn(){
        return isOn;
    }

    public void turnOn(){
        isOn = true;

    }

    public void turnOff() {
        isOn = false;

    }

    public void increaseVolume(){
        if(isOn && volume < 100){
            volume++;
        }
    }

    public void decreaseVolume(){
        if(isOn && volume > 0){
            volume--;
        }
    }

    public int getVolume(){
        return volume;
    }

    public void changeChannel(int newChannel){
        if(isOn && newChannel > 0){
            channel = newChannel;
        }
    }

    public int getChannel(){
        return channel;
    }

    public void mute(){
        if(isOn){
            isMuted = true;
        }
    }

    public void unmute(){
        if (isOn){
            isMuted = false;
        }
    }

    public boolean isMuted(){
        return isMuted;
    }

    public void connectToWifi(String networkName){
        if(isOn && networkName  != null && !networkName.isEmpty()){
            wifiName = networkName;
            wifiConnected = true;
        }
    }

    public void disconnectWifi(){
        wifiConnected = false;
        wifiName = null;
    }

    public boolean isWifiConnected(){
        return wifiConnected;
    }

    public void openApp(String appName){
        if(isOn && appName != null && !appName.isEmpty()){
            currentApp = appName;
        }
    }

    public void closeApp(){
        currentApp = null;
    }

    public boolean isAppOpen(){
        return currentApp != null;
    }

    public void playMovie(String movie){
        if(isOn && movie != null && !movie.isEmpty()){
            currentMovie = movie;
            isPlaying = true;
        }
    }

    public void pauseMovie(){
        if(isOn && isPlaying){
            isPlaying = false;
        }
    }

    public boolean isPlaying(){
        return isPlaying;
    }

    public String getCurrentMovie(){
        return currentMovie;
    }






}
