// Account.java
public abstract class Account {
    private int accountNumber;
    private double balance;

    public Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
}

// SavingsAccount.java
public class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(int accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void deposit(double amount) {
        super.setBalance(super.getBalance() + amount);
        super.setBalance(super.getBalance() + (super.getBalance() * (interestRate / 100)));
    }

    @Override
    public void withdraw(double amount) {
        if (super.getBalance() - amount >= 0) {
            super.setBalance(super.getBalance() - amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }
}

// CurrentAccount.java
public class CurrentAccount extends Account {
    private double overdraftLimit;

    public CurrentAccount(int accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void deposit(double amount) {
        super.setBalance(super.getBalance() + amount);
    }

    @Override
    public void withdraw(double amount) {
        if (super.getBalance() - amount >= -overdraftLimit) {
            super.setBalance(super.getBalance() - amount);
        } else {
            System.out.println("Overdraft limit exceeded");
        }
    }
}

// BankingApplication.java
public class BankingApplication {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(12345, 1000, 5);
        CurrentAccount currentAccount = new CurrentAccount(67890, 2000, 1000);

        System.out.println("Savings Account Details:");
        System.out.println("Account Number: " + savingsAccount.getAccountNumber());
        System.out.println("Balance: " + savingsAccount.getBalance());
        savingsAccount.deposit(500);
        savingsAccount.withdraw(200);
        System.out.println("Balance after deposit and withdrawal: " + savingsAccount.getBalance());
        System.out.println();

        System.out.println("Current Account Details:");
        System.out.println("Account Number: " + currentAccount.getAccountNumber());
        System.out.println("Balance: " + currentAccount.getBalance());
        currentAccount.deposit(1000);
        currentAccount.withdraw(3000);
        System.out.println("Balance after deposit and withdrawal: " + currentAccount.getBalance());
        System.out.println();
    }
}