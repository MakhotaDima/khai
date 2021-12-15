import java.util.Scanner;

public class CoffeeMachine {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Starting to make a coffee\n" +
                "Grinding coffee beans\n" +
                "Boiling water\n" +
                "Mixing boiled water with crushed coffee beans\n" +
                "Pouring coffee into the cup\n" +
                "Pouring some milk into the cup\n" +
                "Coffee is ready!");
        int m = 50, w = 200, c = 15;
        int all;
        System.out.println("What the cups?");
        int cups = in.nextInt();
        System.out.println("Water = " + w*cups + ", Milk = " + m*cups + ", Coffee = " + c*cups);
    }
}
