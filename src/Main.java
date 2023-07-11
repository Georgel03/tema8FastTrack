import org.fasttrackit.tema8.Student.Student;
import org.fasttrackit.tema8.advertise.EmailAds;
import org.fasttrackit.tema8.advertise.FacebookAds;
import org.fasttrackit.tema8.advertise.PrinterAds;

public class Main {

    public static void main(String[] args) {
        Student student = new Student("George", 8);
        Student studentOne = new Student("Emi", 9);
        Student studentSecond = new Student("Ionel", 10);
        System.out.println("The average of all student is " + Student.avgStudents());

        System.out.println("----------------------------------------");
        FacebookAds facebookAds = new FacebookAds();
        EmailAds emailAds = new EmailAds();
        PrinterAds printerAds = new PrinterAds();

        facebookAds.publishAds("tema 8");
        emailAds.publishAds("tema 8");
        printerAds.publishAds("tema8");
    }
}