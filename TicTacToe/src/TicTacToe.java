import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String[][] pole = new String[3][3];
        System.out.println("Enter pole: ");
        int t = 0;
        for (int i = 0; i < 3; i++){
            for (int i1 = 0; i1 < 3; i1++){
                pole[i][i1] = in.next();
            }
        }
        for (int i = 0; i < 3; i++){
            System.out.println("\n----------");
            for (int i1 = 0; i1 < 3; i1++){
                System.out.print("|");
                System.out.print(pole[i][i1]);
                System.out.print("|");
            }
        }
        System.out.print("\n----------");

        for (int i = 0; i < 3; i++){
            if ((pole[i][0].equals("O") && pole[i][1].equals("O") && pole[i][2].equals("O")) ||
                    (pole[0][i].equals("O") && pole[1][i].equals("O") && pole[2][i].equals("O")) ||
                    (pole[0][0].equals("O") && pole[1][1].equals("O") && pole[2][2].equals("O")) ||
                    (pole[2][0].equals("O") && pole[1][1].equals("O") && pole[0][2].equals("O"))){
                System.out.println("O Win");
                System.exit(0);
            }
            else if ((pole[i][0].equals("X") && pole[i][1].equals("X") && pole[i][2].equals("X")) ||
                    (pole[0][i].equals("X") && pole[1][i].equals("X") && pole[2][i].equals("X")) ||
                    (pole[0][0].equals("X") && pole[1][1].equals("X") && pole[2][2].equals("X")) ||
                    (pole[2][0].equals("X") && pole[1][1].equals("X") && pole[0][2].equals("X"))){
                System.out.println("X Win");
                System.exit(0);
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int i1 = 0; i1 < 3; i1++) {
                if (pole[i][i1].equals("_")) {
                    t++;
                }
            }
        }
            if (t > 0){
                System.out.println("\nContinue");
            }
            else {
                System.out.println("\nDraw");
                System.exit(0);
            }

    }
}
