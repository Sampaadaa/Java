import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {
//Encapsulation is done in Account class

    private int customerNumber;
    private int pinNumber;
    private double checkingBalance = 0;
    private double savingBalance = 0;

    Scanner input = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0,00");

    //set the customer number
    public int setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
        return customerNumber;
    }

    //get the customer number
    public int getCustomerNumber() {
        return customerNumber;

    }

    //set the pinNUmber
    public int setPinNumber(int pinNumber) {
        this.pinNumber = pinNumber;
        return pinNumber;
    }

    //get the pin number
    public int getPinNumber() {
        return pinNumber;
    }

    //get checking account balance
    public double getCheckingBalance() {
        return checkingBalance;
    }


    //get saving account balance
    public double getSavingBalance() {
        return savingBalance;
    }

    //calculate checking account withdraw
    public double calcCheckingWithdraw(double amount) {
        checkingBalance = (checkingBalance - amount);
        return checkingBalance;
    }

    //calculating saving account withdraw
    public double calcSavingWithdraw(double amount) {
        savingBalance = (savingBalance - amount);
        return savingBalance;
    }

    //calculating checking account deposit
    public double calcCheckingDeposit(double amount) {
        checkingBalance = (checkingBalance + amount);
        return checkingBalance;
    }

    //calculating saving account deposit
    public double calcSavingDeposit(double amount) {
        savingBalance = (savingBalance + amount);
        return savingBalance;
    }

    //customer checking account withdraw input
    public void getCheckingWithdrawInput() {
        System.out.println("checking account balance : " + moneyFormat.format(checkingBalance));
        System.out.println("Amount you want to withdraw from checking account:");
        double amount = input.nextDouble();

        if ((checkingBalance - amount) >= 0) {
            calcCheckingWithdraw(amount);
            System.out.println("New checking account balance:" + moneyFormat.format(checkingBalance));


        } else {
            System.out.println("Balance cannot be negative:" + "\n");
        }
    }

    //customer saving account withdraw input
    public void getSavingWithdrawInput() {
        System.out.println("saving account balance : " + moneyFormat.format(savingBalance));
        System.out.println("Amount you want to withdraw from saving account:");
        double amount = input.nextDouble();

        if ((savingBalance - amount) >= 0) {
            calcSavingWithdraw(amount);
            System.out.println("New Saving account balance:" + moneyFormat.format(savingBalance) + "\n");


        } else {
            System.out.println("Balance cannot be negative:" + "\n");
        }
    }

    public void getCheckingDepositInput() {
        System.out.println("checking account balance : " + moneyFormat.format(checkingBalance));
        System.out.println("Amount you want to deposit to checking account:");
        double amount = input.nextDouble();

        if ((checkingBalance + amount) >= 0) {
            calcCheckingDeposit(amount);
            System.out.println("New checking account balance:" + moneyFormat.format(checkingBalance));


        } else {
            System.out.println("Balance cannot be negative:" + "\n");
        }

    }

    public void getSavingDepositInput() {
        System.out.println("saving account balance : " + moneyFormat.format(savingBalance));
        System.out.println("Amount you want to deposit to saving account:");
        double amount = input.nextDouble();

        if ((savingBalance + amount) >= 0) {
            calcSavingDeposit(amount);
            System.out.println("New Saving account balance:" + moneyFormat.format(savingBalance));


        } else {
            System.out.println("Balance cannot be negative:" + "\n");
        }
    }

}


