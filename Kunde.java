
public class Kunde {
    String kvorname, knachname;
    char kundenkategorie;

    public Kunde(String pkvorname, String pknachname, char pKategorie){

        kvorname = pkvorname;
        knachname = pknachname;
        kundenkategorie = pKategorie;

    }

    public char getKat(){
        return kundenkategorie;
    }
}

