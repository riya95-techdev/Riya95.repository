public class BankAccount {

    //properties
    private String accountNumber;
    private String accountHolderName;
    private double balance = 0;
    private String accountType; // savings/current/fixedDeposite

    //non-argument constructor
    public BankAccount() {}

    //all argument constructor
    public BankAccount(String accountNumber, String accountHolderName, String accountType) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.accountType = accountType;
    }

    // getter methods
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountType() {
        return accountType;
    }

    //setters methods
    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    // Working methods
    public double deposite(double ammount)
    {
        if(ammount > 0){
//            double balance = balance+ammount;
            return balance;
        }
        else {
            System.out.println("Error : something went wrong");
            return balance;
        }

    }

    public double withdraw(double amount){
        if(balance >= amount){
            return this.balance - amount;
        }
        else{
            System.out.println("Error: something went wrong");
            return amount;
        }
    }

    public double checkBalance(){
        return balance;
    }


    //toString() method
    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", accountHolderName='" + accountHolderName + '\'' +
                ", balance=" + balance +
                ", accountType='" + accountType + '\'' +
                '}';
    }

}
