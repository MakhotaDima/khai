import java.util.Scanner;

public class hangman {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("The game will be available soon.");
        String java = "java";
        System.out.println("Guess the word: ");
        String java_correct = in.nextLine();
        if (java_correct.equals(java)){
            System.out.println("You survived");
        }
        else {
            System.out.println("You died");
        }
    }
}
