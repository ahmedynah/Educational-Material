package adapter;

public class AudioPlayer implements MediaPlayer {

    private MediaAdapter adapter;

    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing mp3: " + fileName);
        } else if(audioType.equalsIgnoreCase("mp4") || audioType.equalsIgnoreCase("vlc")) {
            adapter = new MediaAdapter();
            adapter.play(audioType, fileName);
        } else {
            System.out.println("Invalid format: " + audioType);
        }
    }
}
