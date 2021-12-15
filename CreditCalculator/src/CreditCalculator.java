import java.util.Scanner;

public class CreditCalculator {
    public static void main (String[] args){
        int month;
        int pay;
        System.out.println("Loan principal: 1000\n" +
                "Month 1: repaid 250\n" +
                "Month 2: repaid 250\n" +
                "Month 3: repaid 500\n" +
                "The loan has been repaid!");
        Scanner in = new Scanner(System.in);
        System.out.println("enter all money");
        int allmoney = in.nextInt();
        System.out.println("enter stage m/p");
        String stage = in.next();
        if (stage.equals("m")){
            System.out.println("pay per month: ");
            pay = in.nextInt();
            if (allmoney%pay == 0) {
                month = allmoney / pay;
            }
            else {
                month = allmoney/pay+1;
            }
            System.out.println(month);
        }
        else if (stage.equals("p")){
            System.out.println("Month: ");
            month = in.nextInt();
            if (allmoney%month == 0){
                pay = allmoney/month;
            }
            else {
                pay = allmoney/month+1;
            }
            if (pay%month == 0){
                System.out.println("You must paying " + pay + " per month");
            }
            else {
                System.out.println("You must pay " + pay + " per month, but last month you need only " + (allmoney-(pay*(month-1))));
            }
        }
        else {
            System.out.println("Incorrect");
        }
    }
}
