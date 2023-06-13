import java.util.Scanner;

public class SudokuApp {







    public static void main(String[] args) {


    Sudoku object = new Sudoku();
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Bitte geben Sie Sudoku ein ");
        int i = 0;
       String [] in= new String[9];

        while (i<9){
            in[i]=scanner.nextLine();
            i++;
            //System.out.printf(""+in[i]);  no need sout

        }


    object.init();

        object.setWert(0,1,3);
        object.setWert(1,3,1);
        object.setWert(1,4,9);
        object.setWert(1,5,5);
        object.setWert(2,2,8);
        object.setWert(2,7,6);
       // object.setWert(3,1,3);
        object.setWert(3,0,8);
        object.setWert(3,4,6);
        object.setWert(4,1,4);
        object.setWert(4,3,8);
        object.setWert(4,8,1);
        object.setWert(5,4,2);
        object.setWert(6,1,6);
        object.setWert(6,6,2);
        object.setWert(6,7,8);
        object.setWert(7,3,4);
        object.setWert(7,4,1);
        object.setWert(7,5,9);
        object.setWert(7,8,5);
        object.setWert(8,7,7);


        // extra the value
        object.setWert(0,0,1);

        // testing the existing value in the  row / column/  quarter
         object.setWert(0,7,1);

object.ausgeben();






    }




}
