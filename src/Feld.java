public class Feld {
    private int wert;


    private   Feldgruppe spallte;
    private Feldgruppe quadrant;
    private Feldgruppe zeile ;

    public void init (Feldgruppe neueZeile,Feldgruppe neueSpalte,Feldgruppe neuerQuadrat){
        spallte = neueSpalte ;
        zeile =neueZeile;
        quadrant=neuerQuadrat;

    }
    public int getWert () { return wert;}
    public boolean setWert(int wert ){

        if(wert>0&&wert<=9&& !zeile.istVorhanden(wert)&&!spallte.istVorhanden(wert)&&!quadrant.istVorhanden(wert)){

            this.wert= wert;
            return true;
        }
        System.out.println(" Der Wert ist belegt ");
        return false;

    }

}



