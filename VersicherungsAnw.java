

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
        for(int i = 0; i < kunden.length;i++){
            char kat = kunden[i].getKat();
            gesBeitrag = 0;
            if(kat == 'A'){
                gesBeitrag = +50;
            }
            if(kat == 'B'){
                gesBeitrag = +30;
            }
            if(kat == 'C'){
                gesBeitrag = +10;
            }
        }
        
        System.out.println(gesBeitrag);
    }
}
