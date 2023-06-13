public class Feldgruppe {

       private int nr;
        private Feld [] felder ;
        public Feldgruppe (){
                felder=new Feld [9];

        }

        public void setNr (int neueNr){nr=neueNr;}
        public int getNr(){
            return nr;
        }
        public Feld getFeld(int index){
               return felder[index];
        }
        public void setFelder(int index, Feld feld){
                felder[index]=feld;


        }
        public boolean istVorhanden(int wert){
                for (int i =0;i<=8;i++){
                       if (felder[i].getWert()==wert && felder[i].getWert()>0 &&felder[i].getWert()<9)
                           return true;
                }
         return false;
        }

    }

