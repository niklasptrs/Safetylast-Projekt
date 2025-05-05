
    
public class Kunde {

    String kvorname, knachname;
    char kundenkategorie;
    
    public Kunde(String pkvorname, String pknachname, char pKategorie){
        
        pkvorname = kvorname;
        pknachname = knachname;
        pKategorie = kundenkategorie;
        
    }
    
    public char getKat(){
        return kundenkategorie;
    }
}


