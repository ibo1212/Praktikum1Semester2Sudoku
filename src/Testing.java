public class Testing {
    public static void main(String  agrs[]){
        // Annahme: Das Sudokufeld ist als 2D-Array mit 9 Zeilen und 9 Spalten definiert
       int[][] sudokufeld ;
       sudokufeld = new int[9][9];
// Durchlaufen und Ausgeben der Sudokufelder
        for (int i = 0; i < 9; i++) {
            if (i % 3 == 0 && i != 0) {
                System.out.println("---------------------"); // Zeilenumbruch nach jedem dritten Zeilenblock
            }
            for (int j = 0; j < 9; j++) {
                if (j % 3 == 0 && j != 0) {
                    System.out.print("| "); // Trennzeichen für die Spaltenblöcke
                }
                if (sudokufeld[i][j] == 0) {
                    System.out.print("  "); // Leeres Feld
                } else {
                    System.out.print(sudokufeld[i][j] + " "); // Wert des Feldes
                }
            }
            System.out.println(); // Zeilenumbruch am Ende jeder Zeile
        }




    }
}
