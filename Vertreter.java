
public class Vertreter extends Mitarbeiter
{

    String kundenansprache;
    
    
    
    
    
    public Vertreter(){
        kundenansprache = "Hallo ich bin " + vorname+" "+nachname+" Ihre Versicherung ist zu teuer, bei uns zahlen Sie weniger !";
    }
    
    
    public String überzeugeKunde(){
      
        return kundenansprache;
      
    }
}

