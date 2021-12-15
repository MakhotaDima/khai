import java.util.Scanner;

import static java.lang.Math.random;

public class hangman {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("The game will be available soon.");
        String[] word = {"java", "python", "kotlin", "javascript"};
        int check = 0 + (int) (random() * 4);
        String cor_word = word[check];
        for (int i = 0; i < 2; i++){
            System.out.print(cor_word.charAt(i));
        }
        for (int i = 2; i < cor_word.length(); i++){
            System.out.print("-");
        }
        System.out.println("\nGuess the word: ");
        String java_correct = in.nextLine();
        if (java_correct.equals(cor_word)){
            System.out.println("You survived");
        }
        else {
            System.out.println("You died");
        }
    }
}
