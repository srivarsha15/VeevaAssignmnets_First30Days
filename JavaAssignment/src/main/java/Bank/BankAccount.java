package Bank;

public class BankAccount {
    private String accountNumber="101";
    private double balance=1000;
    protected String accountType="savings";
    public String accountHolderName="varsha";
    public void deposit(double amount){
            balance+=amount;
    }
    public void withdraw(double amount){
        if(amount<=balance){
            balance-=amount;
        }
        else{
            System.out.println("Insufficient Amount");
        }
    }
    private void logTransaction(String type, double amount){
        System.out.println(type+":"+amount);
    }
    protected double getBalance()
    {
        return balance;
    }
    String getMaskedAccountNumber(){
        return accountNumber;
    }
}
