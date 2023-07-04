import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {

    private int customerNumber;
    private int pinNumber;
    private double checkingBalance;
    private double savingBalance;

    Scanner ShowMenu = new Scanner(System.in);
    DecimalFormat MoneyFormat = new DecimalFormat(" '$'###,##0.00 ");

    public void setCustomerNumber(int customerNumber){
        this.customerNumber = customerNumber;
    }
    public void setPinNumber(int pinNumber){
        this.pinNumber = pinNumber;
    }
    public int getCustomerNumber(){
        return customerNumber;
    }
    public int getPinNumber(){
        return pinNumber;
    }
    public double getcheckingBalance(){
        return checkingBalance;
    }
    public double getsavingBalance(){
        return savingBalance;
    }

    public double sumCheckingWithdraw(double amount){
        checkingBalance = (checkingBalance - amount);
        return checkingBalance;
    }
    public double sumSavingWithdraw(double amount){
        savingBalance = (savingBalance - amount);
        return savingBalance;
    }
    public double sumCheckingDeposit(double amount){
        checkingBalance = (checkingBalance + amount);
        return checkingBalance;
    }
    public double sumSavingDeposit(double amount){
            savingBalance = (savingBalance + amount);
            return savingBalance;
    }
    public void getCheckingWithdrawInput(){
        System.out.println("Checking Account Balance: " + MoneyFormat.format(checkingBalance));
        System.out.println("Enter Amount You Want to Withdraw From Checking Account: ");
        //User Input Here Money amount To Withdraw.
        double amount = ShowMenu.nextDouble();

        if((checkingBalance - amount) >= 0){
            sumCheckingWithdraw(amount);
            System.out.println("Successfully Withdraw Balance is: " + amount);
            System.out.println("Your Checking Account New Balance is : " + MoneyFormat.format(checkingBalance));
        } else {
            System.out.println("Balance Can't be Negative!");
        }
    }
    public void getSavingWithdrawInput(){
        System.out.println("Saving Account Balance: " + MoneyFormat.format(savingBalance));
        System.out.println("Enter Amount You Want to Withdraw From Saving Account: ");
        //User Input Here Money amount To Withdraw.
        double amount = ShowMenu.nextDouble();

        if((savingBalance - amount) >= 0){
            sumSavingWithdraw(amount);
            System.out.println("Successfully Withdraw Balance is: " + amount);
            System.out.println("Your Saving Account New Balance is: " + MoneyFormat.format(savingBalance));
        } else {
            System.out.println("Balance Can't be Negative!");
        }

    }
    public void getCheckingDepostInput(){
        System.out.println("Checking Account Balance: " + MoneyFormat.format(checkingBalance));
        System.out.println("Enter Your Amount Want to Deposit From Checking Account: ");
        //User Input Here Money amount To Withdraw.
        double amount = ShowMenu.nextDouble();

        if((checkingBalance + amount) >= 0){
            sumCheckingWithdraw(amount);
            System.out.println("Successfully Deposit Balance is: " + amount);
            System.out.println("Your Checking Account New Balance is: " + MoneyFormat.format(checkingBalance));
        } else {
            System.out.println("Balance Can't be Negative!");
        }

    }
    public void getSavingDepositInput(){
        System.out.println("Saving Account Balance: " + MoneyFormat.format(savingBalance));
        System.out.println("Enter Amount You Want to Deposit From Saving Account: ");
        //User Input Here Money amount To Withdraw.
        double amount = ShowMenu.nextDouble();

        if((savingBalance + amount) >= 0){
            sumSavingWithdraw(amount);
            System.out.println("Successfully Deposit Balance is: " + amount);
            System.out.println("Your Saving Account New Balance is " + MoneyFormat.format(savingBalance));
        } else {
            System.out.println("Balance Can't be Negative!");
        }

    }

    public static void main(String[] args) {

    }
}
