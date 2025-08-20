package InfoBank;
import Bank.BankAccount;

public class ExternlAudit {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        System.out.println("----External Audit----");
        System.out.println("Account Holder Name:"+acc.accountHolderName);

    }
}
