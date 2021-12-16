import java.util.Scanner;

public class MatrixProcessing {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        int Matrix[][];
        int Matrix2[][];
        int n = in.nextInt();
        int m = in.nextInt();
        Matrix = new int[n][m];
        for ( int i = 0; i < n; i++){
            for (int i1 = 0; i1 < m; i1++){
                Matrix[i][i1] = in.nextInt();
            }
        }
        int n1 = in.nextInt();
        int m1 = in.nextInt();
        if (n != n1 || m != m1) {
            Matrix2 = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int i1 = 0; i1 < m; i1++) {
                    Matrix2[i][i1] = in.nextInt() + Matrix[i][i1];
                    System.out.print(Matrix2[i][i1]);
                }
                System.out.println();
            }
        }
        else {
            System.out.println("ERROR");
        }
    }
}
