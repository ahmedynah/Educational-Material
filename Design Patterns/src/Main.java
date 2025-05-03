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

        // Simple Factory
        Coffee coffee1 = CoffeeFactory.getCoffee("espresso");
        coffee1.prepare();  // Output: Preparing a strong Espresso.

        Coffee coffee2 = CoffeeFactory.getCoffee("cappuccino");
        coffee2.prepare();  // Output: Preparing a creamy Cappuccino.

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
        OldPrinter oldPrinter = new OldPrinter();
        Printer adapter = new PrinterAdapter(oldPrinter);
        adapter.print("Hello, Adapter Pattern!");

        List<Printer> list = new List<Printer>();
        list.add(new PrinterHPNew());
        list.add(new PrinterDellNew());
        list.add(new PrinterAdapter(new OldPrinter()));

        for(Printer p: lsit){
            p.print();
        }

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