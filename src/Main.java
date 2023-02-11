import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name and initial balance");
        String name=sc.next();
        String password=sc.next();
        int balance = sc.nextInt();

        SBIAccount shivamAcc = new SBIAccount(name , balance , password);
        System.out.println("Your account has been created with account number:" +shivamAcc.getAccountNo());

        // getBalance
        System.out.println("Your current balance is: " +shivamAcc.getBalance());

        // deposit
        System.out.println(shivamAcc.depositMoney(500));
        System.out.println("New balance is:" +shivamAcc.getBalance());

        // withdraw
        System.out.println("Enter amount to be withdrawn:");
        int amount=sc.nextInt();
        System.out.println("Enter your Password");
        String enteredpassword =sc.next();

        System.out.println(shivamAcc.withdraw(amount,enteredpassword));
        System.out.println("curr balance is "+shivamAcc.getBalance());

        //Interest
        System.out.println("Interest on current balance: " +shivamAcc.getBalance()+ " is " +shivamAcc.calculateInterest(4));

    }
}