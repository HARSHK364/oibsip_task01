import java.util.Scanner;
public class newatm {
    public static void main(String[] args) {
        {
            int balance = 100000, withdraw, deposite;
            Scanner sc = new Scanner(System.in);
            while (true) {
                System.out.println("Atm");
                System.out.println("choose 1 for withdraw");
                System.out.println("choose 2 for deposite");
                System.out.println("choose 3 for check balance");
                System.out.println("choose 4 for exit");
                System.out.println("choose operation you want to perform ");

                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("enter money to be withdraw");
                        withdraw = sc.nextInt();

                        if (balance >= withdraw) {
                            balance = balance - withdraw;
                            System.out.println("please collect your money");

                        } else {
                            System.out.println("insufficient balance");
                        }
                        System.out.println("");
                        break;
                    case 2:
                        System.out.println("enter money to be deposited ");
                        deposite = sc.nextInt();
                        balance = balance + deposite;
                        System.out.println("your money has been sucessfully deposited ");
                        System.out.println("");
                        break;
                    case 3:
                        System.out.println("balance" + balance);
                        System.out.println("");
                        break;
                    case 4:
                        System.exit(0);
                        System.out.println(" ");
                }
            }
        }
    }
}