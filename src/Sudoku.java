public class Sudoku {
  //  private Feld[][]  felder;
    private Feldgruppe[] quadranten;
    private Feldgruppe[] zeilen;
    private Feldgruppe[] spallten;
// foo  and döner 
    private String name;

    public void init() {
        quadranten = new Feldgruppe[9];
        zeilen = new Feldgruppe[9];
        spallten = new Feldgruppe[9];
        for (int i = 0; i < 9; i++) {
            quadranten[i] = new Feldgruppe();
            zeilen[i] = new Feldgruppe();
            spallten[i] = new Feldgruppe();

        }
       // felder = new Feld[9][9];
        for (int x = 0; x < 9; x++) {
            for (int y = 0; y < 9; y++) {
              //  felder[x][y] = new Feld();
                Feld feld = new Feld();
                zeilen[y].setFelder(x,feld);
                spallten[x].setFelder(y,feld);
                int zeilequadranten= y/3;
                int  spalltequadtante = x/3;
                int indexquadrant = 3*zeilequadranten+spalltequadtante;
                int felderInQuadrantzeile= y%3;
                int felderInQuadrantSplate= x%3;
                int IndexInQuadrant = 3*felderInQuadrantzeile+felderInQuadrantSplate;
                quadranten[indexquadrant].setFelder(IndexInQuadrant,feld);






                 feld.init(zeilen[y],spallten[x],quadranten[indexquadrant]);
               // felder[x][y].setWert();

            }
        }
    }


    public boolean setWert(int zeile, int spalte, int wert) {
        if (istKoordinateGueltig( zeile,spalte) ) {

            boolean result = zeilen[zeile].getFeld(spalte).setWert(wert); //felder[zeile][spalte].setWert(wert);
            if(!result) System.out.println("Der Wert ist belegt: Zeile " + zeile + " Spalte " + spalte + " Wert " + wert);
            return result;

        } else {

            return false;
        }

    }

    public int getWert(int zeile, int spalte) {

        int wert = zeilen[zeile].getFeld(spalte).getWert();
        return wert;
    }

    public void ausgeben() {
        // Annahme: Das Sudokufeld ist als 2D-Array mit 9 Zeilen und 9 Spalten definiert
        //  int[][] sudokufeld ;
        // sudokufeld = new int[9][9];
// Durchlaufen und Ausgeben der Sudokufelder
        for (int i = 0; i < 9; i++) {
            if (i % 3 == 0 && i != 0) {
                System.out.println("---------------------"); // Zeilenumbruch nach jedem dritten Zeilenblock
            }
            for (int j = 0; j < 9; j++) {
                if (j % 3 == 0 && j != 0) {
                    System.out.print("| "); // Trennzeichen für die Spaltenblöcke
                }
                if (zeilen[i].getFeld(j).getWert() == 0) {
                    System.out.print("  "); // Leeres Feld
                } else {
                    System.out.print(zeilen[i].getFeld(j).getWert() + " "); // Wert des Feldes
                }
            }
            System.out.println(); // Zeilenumbruch am Ende jeder Zeile
        }


    }

    public boolean istKoordinateGueltig(int zeile, int spalte) {
        if (zeile < 9 && spalte < 9 && spalte >= 0 && zeile >= 0){
            return true;}


        else {return false ;}




}}


