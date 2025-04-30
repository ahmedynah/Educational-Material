package adapter;

public class MediaAdapter implements MediaPlayer {

    private AdvancedMediaPlayer advancedPlayer = new AdvancedMediaPlayer();

    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("mp4")) {
            advancedPlayer.playMp4(fileName);
        } else if(audioType.equalsIgnoreCase("vlc")) {
            advancedPlayer.playVlc(fileName);
        }
    }
}
