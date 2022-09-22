package Practice;

public class BankAccount {
    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private int phoneNumber;

    public BankAccount(){
        this(87489,545,"Tejas", "tjspatil2@gmail.com",87989);
        System.out.println("Empty constructor is called  ");
    }
    public BankAccount(int accountNumber, double balance, String customerName, String email, int phoneNumber){
        System.out.println("Constructor Called");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;

    }
    public int getAccountNumber(){
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }

    public double getBalance(){
        return balance;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public String getCustomerName(){
        return customerName;
    }

    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public int getPhoneNumber(){
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(double deposit){
        this.balance += deposit;
        System.out.println("Deposit of " +deposit+ "made. New balance is " +this.balance);
    }

    public void withdrawFunds(double withdraw){
    if(this.balance - withdraw <=0){
        System.out.println("Only" +this.balance+ " is available. Withdrawal not processed.");
    }
    else{
        this.balance -= withdraw;
        System.out.println("Withdrawal for amount " +withdraw+ "is processed. Your available funds is " +this.balance);
    }
    }
}
