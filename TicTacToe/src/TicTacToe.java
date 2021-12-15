import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String[][] pole = new String[3][3];
        System.out.println("Enter pole: ");
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
    }
}
