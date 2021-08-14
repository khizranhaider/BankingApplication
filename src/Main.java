import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i, x = 1;
        Scanner sc = new Scanner(System.in);
        AppFunctions A = new AppFunctions();
        MenuPrint menu = new MenuPrint();

        do {
            menu.PrintMenu();
            System.out.println("\nEnter any of the above options : ");
            i = sc.nextInt();
            switch (i) {
                case 1:
                    A.Username();
                    A.Password();
                    A.PhoneNo();
                    A.Email_Address();
                    A.CNIC_No();
                    System.out.println("\nAccount Created Successfully");
                    break;
                case 2:
                    A.Cash_Deposit();
                    break;
                case 3:
                    A.Cash_Withdrawal();
                    break;
                case 4:
                    A.Balance_Check();
                    break;
                case 5:
                    A.Interest_Calculations(4);
                    break;
                case 6:
                    A.Account_details();
                    break;
                default:
                    System.out.println("Invalid Entry");
            }
            System.out.println("\nTo exit enter 0. To return to main menu, enter any digit : ");
            x = sc.nextInt();
        }
        while (x != 0);
        System.out.println("\nThank you for using our app!");
    }
}
