import java.util.Scanner;

public class MatrixProcessing {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        int Matrix[][];
        int Matrix2[][];
        do {
            System.out.println("Menu: 1 - sum, 2 - const, 3 - muls, 4 - exit");
            int menu = in.nextInt();
            System.out.println("Size matrix: ");
            int n = in.nextInt();
            int m = in.nextInt();
            Matrix = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int i1 = 0; i1 < m; i1++) {
                    Matrix[i][i1] = in.nextInt();
                }
            }
            if (menu == 1) {
                int n1 = in.nextInt();
                int m1 = in.nextInt();
                if (n == n1 && m == m1) {
                    Matrix2 = new int[n][m];
                    for (int i = 0; i < n; i++) {
                        for (int i1 = 0; i1 < m; i1++) {
                            Matrix2[i][i1] = in.nextInt() + Matrix[i][i1];
                            System.out.print(Matrix2[i][i1]);
                        }
                        System.out.println();
                    }
                } else {
                    System.out.println("ERROR");
                }
            }
            if (menu == 2){
                System.out.println("Constant: ");
                int c = in.nextInt();
                for (int i = 0; i < n; i++) {
                    for (int i1 = 0; i1 < m; i1++) {
                        Matrix[i][i1] = c * Matrix[i][i1];
                        System.out.print(Matrix[i][i1]);
                    }
                    System.out.println();
                }
            }
            if (menu == 3){
                int n1 = in.nextInt();
                int m1 = in.nextInt();
                    Matrix2 = new int[n1][m1];
                for (int i = 0; i < n1; i++) {
                    for (int i1 = 0; i1 < m1; i1++) {
                        Matrix2[i][i1] = in.nextInt();
                    }
                }
                    int[][] Matrix3 = new int[n][m1];
                    for (int i = 0; i < n; i++){
                        for (int i1 = 0; i1 < m1; i1++){
                            Matrix3[i][i1] = 0;
                        }
                    }
                    if (n1 == m) {
                        for (int i = 0; i < n; i++) {
                            for (int i1 = 0; i1 < m1; i1++) {
                                for (int i2 = 0; i2 < n1; i2++) {
                                    Matrix3[i][i1] = Matrix3[i][i1] + Matrix[i][i2] * Matrix2[i2][i1];

                                }
                                System.out.print(" " + Matrix3[i][i1]);
                            }
                            System.out.println();
                        }
                    }
                    else {
                        System.out.println("ERROR");
                    }
            }
            if (menu == 4){
                System.exit(0);
            }
        }while (true);
    }
}
