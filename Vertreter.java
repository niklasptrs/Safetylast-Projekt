import java.util.Random;
import java.util.Scanner;
public class Vertreter extends Mitarbeiter
{

    Kunde kunde1;
    
    VersicherungsAnw anw = new VersicherungsAnw();
    VersicherungsAnw versicherungsAnw1;
    String kundenansprache;
    
    

    
    public Vertreter(){
        kundenansprache = "Hallo ich bin " + vorname+" "+nachname+" Ihre Versicherung ist zu teuer, bei uns zahlen Sie weniger !";
    }
    
    public void t(){
        
    }

    /*
    public String überzeugeKunde(){
    return kundenansprache;

    }
     */

    public void überzeugeKunde(){
        System.out.println(kundenansprache);
        boolean erfolg = getRandomBoolean();
        if(erfolg){
            System.out.println("Platzhalter");
            
            Scanner scanner = new Scanner(System.in);
            
            System.out.println("Vorname: ");
            String kvorname = scanner.nextLine();
            
            System.out.println("Nachname: ");
            String knachname = scanner.nextLine();
            
            System.out.println("Kategorie (A, B, oder C): ");
            char kundenkategorie = scanner.nextLine().toUpperCase().charAt(0);
            
            
            
        }
        if(!erfolg){
            System.out.println("Schade, dass ich Sie nicht überzeugen konnte.");
            System.out.println("Falls Sie sich um entscheiden sollten gebe ich Ihnen meine Nummer.");
        }
    }

    public boolean getRandomBoolean() {
        Random random = new Random();
        return random.nextBoolean();
    }
}