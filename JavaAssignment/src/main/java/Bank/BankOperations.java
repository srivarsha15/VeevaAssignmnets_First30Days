package Bank;

public class BankOperations{
    public static void main(String[] args) {
        BankAccount bo=new BankAccount();
        System.out.println("----Bank Operations---");
        System.out.println(bo.getMaskedAccountNumber());
        System.out.println(bo.getBalance());
        System.out.println(bo.accountType);
        bo.deposit(500);
        bo.withdraw(200);
    }
}
