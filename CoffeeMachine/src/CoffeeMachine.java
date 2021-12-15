import java.util.Scanner;

public class CoffeeMachine {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter Water, Milk, Coffee!");
        int w = in.nextInt(), m = in.nextInt(), c = in.nextInt();
        int all;
        System.out.println("What the cups?");
        int cups = in.nextInt();
        if ((m-(cups*50)) < 0 || (w-(cups*200))<0 || (c-(cups*15)) < 0 ){
            System.out.println("No, i can take Only " + (Math.min((m/50), Math.min((w/200), (c/15)))));
        }
        else if ((Math.min(m/50, Math.min(w/200, c/15))-cups) == 0){
            System.out.println("Yes, i can doing " + cups + " cups");
        }
        else {
            System.out.println("Yes, i can doing " + cups + " cups and " + (Math.min(m/50, Math.min(w/200, c/15))-cups) + " more");
        }
    }
}
