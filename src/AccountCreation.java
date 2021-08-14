import java.util.Scanner;

public class AccountCreation {
    private String UserName;
    private String PhoneNumber;
    private String CNIC;
    private int Password;
    private String EmailAddress;

    Scanner sc = new Scanner(System.in);
    Scanner er = new Scanner(System.in);

    public String getEmailAddress() {
        return EmailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        EmailAddress = emailAddress;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public double getPassword() {
        return Password;
    }

    public void setPassword(int password) {
        Password = password;
    }


    public String getCNIC() {
        return CNIC;
    }

    public void setCNIC(String CNIC) {
        this.CNIC = CNIC;
    }

    public void Username() {
        System.out.println("Enter your User Name : ");
        this.UserName = sc.nextLine();
    }

    public void Password() {
        int x = 1;
        while (x > 0) {
            System.out.println("Enter your Password : ");
            int i = sc.nextInt();
            if (i > 1000 && i < 9999) {
                this.Password = i;
                x = 0;
            } else {
                System.out.println("Invalid Password! Please enter 4 digits only.");
                x = 1;
            }
        }
    }

    public void PhoneNo() {
        System.out.println("Enter your Phone number : ");
        this.PhoneNumber = er.nextLine();
    }

    public void Email_Address() {
        System.out.println("Enter your Email Address : ");
        this.EmailAddress = er.nextLine();
    }

    public void CNIC_No() {
        System.out.println("Enter your CNIC number : ");
        this.CNIC = er.nextLine();
    }
}
