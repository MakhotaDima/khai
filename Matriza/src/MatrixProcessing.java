import java.util.Scanner;

public class MatrixProcessing {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        int Matrix[][];
        int Matrix2[][];
        double dsum =0;
        do {
            System.out.println("Menu: 1 - sum, 2 - const, 3 - muls, 4 - transportirovka, 5 - determinate, 6 - exit");
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
            if (menu ==4){
                    System.out.println("Take transp: Main(1), Side(2),  Vertical(3), Horizontal(4) ");
                    int menu2 = in.nextInt();

                    if (menu2 == 1){
                        Matrix2 = new int[m][n];
                        for (int i = 0; i < m; i++) {
                            for (int i1 = 0; i1 < n; i1++) {
                                Matrix2[i][i1] = Matrix[i1][i];
                                System.out.print(Matrix2[i][i1] +" ");
                            }
                            System.out.println();
                        }

                    }else if (menu2 == 2){
                        Matrix2 = new int[m][n];
                        for (int i = 0; i < m; i++) {
                            for (int i1 = 0; i1 < n; i1++) {
                                Matrix2[i][i1] = Matrix[m-1-i][n-1-i1];
                                System.out.print(Matrix2[i][i1] + " ");
                            }
                            System.out.println();
                        }

                    }else if (menu2 == 3){
                        Matrix2 = new int[n][m];
                        for (int i = 0; i < n; i++) {
                            for (int i1 = 0; i1 < m; i1++) {
                                Matrix2[i][i1] = Matrix[i][m-1-i1];
                                System.out.print(Matrix2[i][i1] + " ");
                            }
                            System.out.println();
                        }

                    }else if(menu2 == 4){
                        Matrix2 = new int[n][m];
                        for (int i = 0; i < n; i++) {
                            for (int i1 = 0; i1 < m; i1++) {
                                Matrix2[i][i1] = Matrix[m-1-i][i1];
                                System.out.print(Matrix2[i][i1] + " ");
                            }
                            System.out.println();
                        }

                    }else System.out.println("ERROR");

            }
            if (menu == 5){
                double d = 1;
                boolean end =true;
                if (m == n){
                    do {
                        if (Matrix.length > 1){
                            double[][] Matrix3 = new double[Matrix.length-1][Matrix[0].length-1];
                            for (int i = 0; i < Matrix[0].length;i++){
                                for (int i1 = 1; i1 < Matrix.length; i1++){
                                    for (int i2 = 0; i2 < Matrix[0].length; i2++){
                                        if (i2 < i){
                                            Matrix3[i1-1][i2] = Matrix[i1][i2];
                                        }else if(i2 > i){
                                            Matrix3[i1-1][i2-1] = Matrix[i1][i2];
                                        }
                                    }
                                }
                                d = Math.pow(-1, i + 2) * Matrix[0][i] * d;
                            }
                        }
                        else {
                            dsum += d* Matrix[0][0];
                            end = false;
                        }
                        System.out.println("determinate = " + dsum);
                    }while (end == true);
                }
                else {
                    System.out.println("ERROR");
                }
            }
            if (menu == 6){
                System.exit(0);
            }
        }while (true);
    }
}
