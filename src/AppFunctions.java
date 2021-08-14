import java.text.DecimalFormat;
import java.util.Scanner;

public class AppFunctions extends AccountCreation {

    private double cash = 0;
    private double AddCash;
    private double WithdrawCash;
    private double IR;

    Scanner sc = new Scanner(System.in);

    public double getCash() {
        return cash;
    }

    public void setCash(double cash) {
        this.cash = cash;
    }

    public void Cash_Deposit() {
        System.out.println("\nCASH DEPOSIT\n");
        System.out.println("Current Balance : " + getCash());
        System.out.println("Enter Amount you want to Deposit : ");
        AddCash = sc.nextDouble();
        if (AddCash >= 0) {
            this.cash += AddCash;
            System.out.println("Amount Deposited : " + AddCash);
        } else
            System.out.println("Invalid Entry!");

        System.out.println("New Balance : " + getCash() + " Rs.");
    }

    public void Cash_Withdrawal() {
        System.out.println("\nCASH WITHDRAWAL\n");
        System.out.println("Current Balance : " + getCash());
        if (getCash() > 0) {
            System.out.println("Enter Withdrawal Amount : ");
            WithdrawCash = sc.nextDouble();
            if (WithdrawCash >= 0) {
                System.out.println("Cash Withdrawal Request : " + WithdrawCash + " Rs.");
                if (WithdrawCash <= cash) {
                    this.cash -= WithdrawCash;
                    System.out.println("Withdraw Successful");
                    System.out.println("Remaining Balance : " + getCash() + " Rs.");
                } else
                    System.out.println("You don't have enough Balance.");
                System.out.println("Account Balance : " + getCash() + " Rs.");
            } else
                System.out.println("Invalid Entry!");
        } else
            System.out.println("You have 0 Balance. Please deposit some cash first.");
    }

    public void Balance_Check() {
        System.out.println("\nBALANCE CHECK\n");
        System.out.println("Your Account Balance is : " + getCash() + " Rs.");
    }

    public void Interest_Calculations(double IR) {
        System.out.println("\nINTEREST CALCULATIONS\n");
        double interest = getCash() * (IR / 100);
        System.out.println("Monthly Interest On " + cash + " Rs. is : " + interest + " Rs.");
        this.cash += interest;
        System.out.println("Balance after adding monthly interest : " + getCash() + " Rs.");
    }

    public void Account_details() {
        System.out.println("\nACCOUNT DETAILS\n");
        System.out.println("Account Username : " + getUserName());
        System.out.println("Account Password : " + getPassword());
        System.out.println("Registered Phone Number : " + getPhoneNumber());
        System.out.println("Registered Email Address : " + getEmailAddress());
        System.out.println("Registered CNIC Number : " + getCNIC());
    }
}
