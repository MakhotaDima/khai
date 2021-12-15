import java.util.Scanner;

import static java.lang.Math.*;

public class CreditCalculator {
    public static void main (String[] args){
        double month;
        double pay;
        double procent;
        System.out.println("Loan principal: 1000\n" +
                "Month 1: repaid 250\n" +
                "Month 2: repaid 250\n" +
                "Month 3: repaid 500\n" +
                "The loan has been repaid!");
        Scanner in = new Scanner(System.in);
        double allmoney;
        System.out.println("enter stage a/p/n/d");
        String stage = in.next();
        if (stage.equals("a")){
            System.out.println("enter all money");
            allmoney = in.nextDouble();
            System.out.println("Month: ");
            month = in.nextDouble();
            System.out.println("procent: ");
            procent = in.nextDouble()/1200;
            pay = allmoney * (procent * pow(1 + procent, month));
            System.out.println("You must pay per month: " + pay);
        }
        else if (stage.equals("p")){
            System.out.println("procent: ");
            procent = in.nextDouble()/1200;
            System.out.println("Month: ");
            month = in.nextDouble();
            System.out.println("pay per month: ");
            pay = in.nextDouble();

            allmoney = pay / ((procent * pow(1 + procent, month)) / (pow(1 + procent, month) - 1));
            System.out.println("All money: " + allmoney);
        }
        else if (stage.equals("n")){
            System.out.println("pay per month: ");
            pay = in.nextDouble();
            System.out.println("enter all money");
            allmoney = in.nextDouble();
            System.out.println("procent: ");
            procent = in.nextDouble()/1200;

            month = log(pay / (pay - procent * allmoney)) / log(1 + procent);
            System.out.println(month);
            month = round(month);
            System.out.println(month);
            if (month%12 == 0){
                System.out.println("Years: " + month/12);
            }
            else {
                System.out.println("Years: " + month/12 + " + Month " + (month-(month/12*12)));
            }
        }
        else if (stage.equals("d")){
            System.out.println("enter all money");
            allmoney = in.nextDouble();
            System.out.println("Month: ");
            month = in.nextDouble();
            System.out.println("procent: ");
            procent = in.nextDouble()/1200;
            double dopzp = 0;

            for ( int i = 1; i <= month; i++){
                double d = round(allmoney / month + procent * (allmoney - (allmoney * (i - 1)) / month));
                dopzp = dopzp + (d - (allmoney/month));
                System.out.println("Difference pay: " + d);
            }
            System.out.println("All dop pay: " + dopzp);
        }
        else {
            System.out.println("Incorrect");
        }
    }
}
