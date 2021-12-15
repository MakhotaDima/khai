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
        for(;;) {
            for (int i = 0; i < 3; i++) {
                System.out.println("\n----------");
                for (int i1 = 0; i1 < 3; i1++) {
                    System.out.print("|");
                    System.out.print(pole[i][i1]);
                    System.out.print("|");
                }
            }
            System.out.println("\n----------");

            int coord1 = in.nextInt();
            int coord2 = in.nextInt();
            if (coord1 > 3 || coord1 < 0 || coord2 > 3 || coord2 < 0) {
                System.out.println("1 to 3");
            } else if (pole[coord1 - 1][coord2 - 1].equals("X") || pole[coord1 - 1][coord2 - 1].equals("O")) {
                System.out.println("Occupied");
            } else {
                pole[coord1 - 1][coord2 - 1] = "X";
            }

            for (int i = 0; i < 3; i++) {
                if ((pole[i][0].equals("O") && pole[i][1].equals("O") && pole[i][2].equals("O")) ||
                        (pole[0][i].equals("O") && pole[1][i].equals("O") && pole[2][i].equals("O")) ||
                        (pole[0][0].equals("O") && pole[1][1].equals("O") && pole[2][2].equals("O")) ||
                        (pole[2][0].equals("O") && pole[1][1].equals("O") && pole[0][2].equals("O"))) {
                    System.out.println("O Win");
                    System.exit(0);
                } else if ((pole[i][0].equals("X") && pole[i][1].equals("X") && pole[i][2].equals("X")) ||
                        (pole[0][i].equals("X") && pole[1][i].equals("X") && pole[2][i].equals("X")) ||
                        (pole[0][0].equals("X") && pole[1][1].equals("X") && pole[2][2].equals("X")) ||
                        (pole[2][0].equals("X") && pole[1][1].equals("X") && pole[0][2].equals("X"))) {
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
            if (t > 0) {
                System.out.println("\nContinue");
            } else {
                System.out.println("\nDraw");
                System.exit(0);
            }
        }
    }
}
