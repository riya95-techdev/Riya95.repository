public class BankRunner {
    public static void main(String[] args) {

        BankAccount myAccount = new BankAccount("123","riya","saving account");

        System.out.println(myAccount.toString());
        myAccount.deposite(8000);
        myAccount.withdraw(2000);
        myAccount.checkBalance();

    }
}
