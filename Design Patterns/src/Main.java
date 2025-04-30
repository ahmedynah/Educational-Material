import factorymethod.Dialog;
import factorymethod.MacOSDialog;
import factorymethod.WindowsDialog;
import singleton.Singleton;
import adapter.AudioPlayer;
import observer.EmailSubscriber;
import observer.NewsAgency;
import observer.Observer;
import observer.SMSSubscriber;

public class Main {
    public static void main(String[] args) {
        // Singleton.Singleton usage
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        System.out.println(s1 == s2); // true, both are same instance

        // Factory Method
        Dialog dialog;

        String os = System.getProperty("os.name").toLowerCase();

        if (os.contains("mac")) {
            dialog = new MacOSDialog();
        } else {
            dialog = new WindowsDialog();
        }

        dialog.show();

        // Adapter
        AudioPlayer player = new AudioPlayer();
        player.play("mp3", "song.mp3");
        player.play("mp4", "movie.mp4");
        player.play("vlc", "music.vlc");
        player.play("avi", "trailer.avi");

        // Observer
        NewsAgency agency = new NewsAgency();

        Observer emailUser = new EmailSubscriber("Alice");
        Observer smsUser = new SMSSubscriber("Bob");

        agency.attach(emailUser);
        agency.attach(smsUser);

        agency.setNews("Java 21 is released!");
        agency.setNews("Local team wins the championship!");

    }
}