import java.util.Scanner;

import static java.lang.Math.random;

public class hangman {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("The game will be available soon.");
        String[] word = {"java", "python", "kotlin", "javascript"};
        int check = 0 + (int) (random() * 4);
        String cor_word = word[check];
        String[] word2;
        word2 = new String[cor_word.length()];
        for (int i = 0; i<cor_word.length(); i++){
            word2[i] = "-";
        }
        String letter;
        for (int i = 0; i < 8; i++) {
            letter = in.next();
            for (int i1 = 0; i1 < cor_word.length(); i1++){
                if (letter.equals(cor_word.charAt(i1))){
                    word2[i1] = letter;
                }
            }

        }
        System.out.println("You Died");

    }
}
