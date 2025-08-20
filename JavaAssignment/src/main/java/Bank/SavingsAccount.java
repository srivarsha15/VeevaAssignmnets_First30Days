package Bank;

public class SavingsAccount extends BankAccount{
    public static void main(String[] args) {
        SavingsAccount bc=new SavingsAccount();
        System.out.println("Holder Name:"+bc.accountHolderName);
        System.out.println("Account type:"+bc.accountType);
        System.out.println(bc.getBalance());
        System.out.println("Account Masked Number:"+bc.getMaskedAccountNumber());
        bc.deposit(100);
        bc.withdraw(50);

//        System.out.println(bo.balance);

    }

}
