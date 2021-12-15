import java.util.Scanner;

public class CoffeeMachine {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter Water, Milk, Coffee!");
        int w = 400, m = 100, c = 12, grn = 550, stakan = 9;
        int all;
        for(;;) {
            System.out.println("What are you doing? buy/fill/take/remaining/exit ");
            String whatwedoing = in.next();
            if (whatwedoing.equals("buy")){
                System.out.println("What you buy? 1 - espresso, 2 - Latte, 3 - cappucino");
                all = in.nextInt();
                if(all == 1){
                    if ((w - 250) <0 || (m - 0) < 0 || (c - 16) < 0|| (stakan -1) < 0){
                        System.out.println("No resurce");
                    }
                    else {
                        w -=250; m-=0; c-=16; stakan-=1; grn+=4;
                    }
                }
                else if (all == 2){
                    if ((w - 350) <0 || (m - 75) < 0 || (c - 20) < 0|| (stakan -1) < 0){
                        System.out.println("No resurce");
                    }
                    else {
                        w -=350; m-=75; c-=20; stakan-=1; grn+=7;
                    }
                }

                else if(all == 3){
                    if ((w - 200) <0 || (m - 100) < 0 || (c - 12) < 0|| (stakan -1) < 0){
                        System.out.println("No resurce");
                    }
                    else {
                        w -=200; m-=100; c-=12; stakan-=1; grn+=6;
                    }
                }
                else {
                    System.out.println("Incorrect");
                }
            }
            else if (whatwedoing.equals("fill")){
                System.out.println("Water: ");
                w = w + in.nextInt();
                System.out.println("Milk: ");
                m = m + in.nextInt();
                System.out.println("Coffee: ");
                c = c + in.nextInt();
                System.out.println("Stakan: ");
                stakan =stakan + in.nextInt();

            }
            else if (whatwedoing.equals("take")){
                grn = 0;
            }
            else if (whatwedoing.equals("remaining")){
                System.out.println("The coffee machine has: " + w + "  Water, " + m + " Milk, " + c + " Coffee, " + grn + " grn, " + stakan + " stakan");
            }
            else if (whatwedoing.equals("exit")){
                System.exit(0);
            }
            else {
                System.out.println("Incorrect");
            }
        }
    }
}
