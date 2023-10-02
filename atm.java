import java.util.Scanner;

public class atm {
    public static void main(String[] args) {
        int balance = 10000, w, d;
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.println("    ATM    ");
            System.out.println("Choose 1 for Deposit");
            System.out.println("Choose 2 for Withdraw");
            System.out.println("Choose 3 for Check Balance");
            System.out.println("Choose 4 for Exit");
            int c = s.nextInt();
            switch (c) {
                case 1:
                    System.out.println("Enter How much amount do you want to Deposit:");
                    d = s.nextInt();
                    balance += d;
                    System.out.println("Successfully Deposited");
                    break;
                case 2:
                    System.out.println("Enter How much amount do you want to Withdrawn:");
                    w = s.nextInt();
                    if (w <= balance) {
                        balance -= w;
                        System.out.println("Successfully Withdrawn");
                    } else
                        System.out.println("Insufficient Balance");
                    break;
                case 3:
                    System.out.println("Your Balance Amount is " + balance);
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Invalid Choice");
                    break;
            }
        }
    }
}
