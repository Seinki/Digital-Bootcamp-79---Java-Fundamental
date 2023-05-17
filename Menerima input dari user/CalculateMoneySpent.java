import java.util.Scanner;

public class CalculateMoneySpent {
    public static void main(String[] args) {
        String name;
        int moneySpent, total, totalDay = 7;
        double average;
        
        Scanner input = new Scanner(System.in);

        System.out.println("Calculate your money!!!");
        System.out.println("Hey, whats your name: ");
        name = input.nextLine();

        System.out.println("How much money did you spent at the club on Monday: ");
        moneySpent = input.nextInt();
        total = moneySpent;

        System.out.println("How much money did you spent at the club on Tuesday: ");
        moneySpent = input.nextInt();
        total = total + moneySpent;

        System.out.println("How much money did you spent at the club on Wednesday: ");
        moneySpent = input.nextInt();
        total = total + moneySpent;

        System.out.println("How much money did you spent at the club on Thursday: ");
        moneySpent = input.nextInt();
        total = total + moneySpent;
        
        System.out.println("How much money did you spent at the club on Friday: ");
        moneySpent = input.nextInt();
        total = total + moneySpent;

        System.out.println("How much money did you spent at the club on Saturday: ");
        moneySpent = input.nextInt();
        total = total + moneySpent;

        System.out.println("How much money did you spent at the club on Sunday: ");
        moneySpent = input.nextInt();
        total = total + moneySpent;

        average = (double) total/totalDay;

        System.out.println("The Calculation result: ");

        System.out.println("Hi, " + name);
        System.out.println("Your total expenditure at the club at this week is $ " + total);
        System.out.println("With an average daily expenditure of $ " + average);
    }
}
