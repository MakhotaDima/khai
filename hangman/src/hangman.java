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
        String[] lost_letter = new String[256];
        String letter;
        int test = cor_word.length();
        int chapt = 0;
        int t = 0;
        int c = 0;
        for (int i = 0; i < 8; i++) {
            test = cor_word.length();
            t = 0;
            letter = in.next();
            if (letter.length() >1){
                System.out.println("You should input a single letter.");
                i--;
            }
            else {
                for (int i1 = 0; i1 < cor_word.length(); i1++) {
                    if (letter.charAt(0) == cor_word.charAt(i1)) {
                        word2[i1] = letter;
                        t++;
                    }
                }
                for (int i1 = 0; i1 < cor_word.length(); i1++) {
                    System.out.print(word2[i1]);
                }
                for (int i1 = 0; i1 < cor_word.length(); i1++) {
                    if (!word2[i1].equals("-")) {
                        test--;
                    }
                    if (test == 0) {
                        System.out.println("YOU Survived!");
                        System.exit(0);
                    }
                }
                System.out.println();
                for (int i1 = 0; i1 < chapt; i1++) {
                    if (lost_letter[i1].charAt(0) == letter.charAt(0)) {
                        c++;
                    }
                }
                if (t != 0) {
                    i--;
                } else {
                    if (c != 0) {
                        System.out.println("No improvements");
                        i--;
                    } else {
                        System.out.println("That letter doesnt appear in the word");
                    }
                }

                lost_letter[chapt] = letter;

                chapt++;
            }


        }
        System.out.println("You Died");

    }
}
