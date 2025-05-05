

public class VersicherungsAnw
{
    Kunde kunde1;
    
    private Kunde [] kunden;
    
   int gesBeitrag;
    
    public VersicherungsAnw()
    {
        kunden = new Kunde [4];
        kunden[0]= new Kunde("Felix","Porcynski", 'C');
        kunden[1]= new Kunde("David","Schulz", 'A');
        kunden[2]= new Kunde("Fritz","Müller",'B');
        kunden[3]= new Kunde("Ben","Meier",'B');
    }

    public void berechneKundenbeiträge(){
        gesBeitrag = 0;
        for(int i = 0; i < kunden.length;i++){
            char kat = kunden[i].getKat();
            
            if(kat == 'A'){
                System.out.println(kunden[i].kvorname+" "+kunden[i].knachname+" + 50 €");
                gesBeitrag +=50;
            }
            if(kat == 'B'){
                System.out.println(kunden[i].kvorname+" "+kunden[i].knachname+" + 30 €");
                gesBeitrag +=30;
            }
            if(kat == 'C'){
                System.out.println(kunden[i].kvorname+" "+kunden[i].knachname+" + 10 €");
                gesBeitrag +=10;
            }
        }
        System.out.println("»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»");
        System.out.println("Insgesamt: "+gesBeitrag+" €");
    }
}
