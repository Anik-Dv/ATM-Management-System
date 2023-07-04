import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

public class OptionMenu extends Account {
    Scanner ShowMenu = new Scanner(System.in);
    DecimalFormat MoneyFormat = new DecimalFormat(" '$'###,##0.00 ");

    HashMap<Integer, Integer> data = new HashMap<>();
    public void getLogin(){
        int x = 1;
        do{
            try{
                data.put(323211,112232);
                data.put(181920,212223);

                System.out.println("Welcome To E_ATM System");
                // User Inter Her/His Customer Id Here.
                System.out.println("Enter Your Customer Id: ");
                setCustomerNumber(ShowMenu.nextInt());

                // User Inter Her/His Account Password Here.
                System.out.println("Enter Your Password : ");
                setPinNumber(ShowMenu.nextInt());
            }
            catch (Exception e){
                System.out.println(e.getStackTrace());
                System.out.println("Invalid Character(s). Only Type Number.");
                x = 2;
            }
            // User Created With hard Coded also here.
            int cusNum = getCustomerNumber();
            int pinNum = getPinNumber();

            if(data.containsKey(cusNum) && data.get(cusNum) == pinNum){
                getAccountType();
            }
            else {
                System.out.println("Wrong Customer Number or Pin Number!");
            }

        } while (x==1);
    }
    // Create getAccountType and Show user to What is her/his Account Type and user can Select it har/his self.
    void getAccountType(){
        System.out.println("Select Your Account What You Want to Access: ");
        System.out.println("Type 1 - Checking Account ");
        System.out.println("Type 2 - Saving Account ");
        System.out.println("Type 3 - Exit Account ");
        System.out.println("Choice: ");

        int seleted = ShowMenu.nextInt();

        switch (seleted){
            case 1:
                getCheckingAccount();
                break;
            case 2:
                getSavingAccount();
                break;
            case 3:
                System.out.println("Thank-you For Using Our ATM Services.");
                break;

            default:
                System.out.println("\n Invalid Choice.");
        }
    }
    void getCheckingAccount(){
        System.out.println("Checking Account");
        System.out.println("Type 1 - View Balance");
        System.out.println("Type 2 - Withdraw Balance");
        System.out.println("Type 3 - Deposit Balance");
        System.out.println("Type 4 - Exit ");
        System.out.println("Choice: ");

        int selected = ShowMenu.nextInt();

        switch (selected){
            case 1:
                System.out.println("Checking Account Balance: " + MoneyFormat.format(getcheckingBalance()));
                break;
            case 2:
                getCheckingWithdrawInput();
                getCheckingAccount();
                break;
            case 3:
                getCheckingDepostInput();
                getCheckingAccount();
                break;
            case 4:
                System.out.println("Thank-You For using Our ATM Services");
                break;
            default:
                System.out.println("Invalid Choice!");
                getAccountType();
                break;
        }
    }

    // Create getSavingAccount method.
    void getSavingAccount(){
        System.out.println("Saving Account");
        System.out.println("Type 1 - View Balance");
        System.out.println("Type 2 - Withdraw Balance");
        System.out.println("Type 3 - Deposit Balance");
        System.out.println("Type 4 - Exit ");
        System.out.println("Choice: ");

        int selected = ShowMenu.nextInt();

        switch (selected){
            case 1:
                System.out.println("Saving Account Balance: " + MoneyFormat.format(getsavingBalance()));
                getSavingAccount();
                break;
            case 2:
                getSavingWithdrawInput();
                getSavingAccount();
                break;
            case 3:
                getSavingDepositInput();
                getSavingAccount();
                break;
            case 4:
                System.out.println("Thank-You For using Our ATM Services");
                break;
            default:
                System.out.println("Invalid Choice");
                getAccountType();
                break;
        }

    }


    public static void main(String[] args) {

    }
}