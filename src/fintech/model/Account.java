package fintech.model;

/**
 * @author 12S23008 Ranty Pakpahan
 * @author 12S23048 Grace Caldera
 */
public class Account {
    private final String owner;
    private final String accountName;
    private final double balance;

    public Account(String owner, String accountName) {
        this.owner = owner;
        this.accountName = accountName;
        this.balance = 0.0;
    }

    public String getOwner() {
        return owner;
    }

    public String getAccountName() {
        return accountName;
    }

    public double getBalance() {
        return balance;
    }

    public void displayAccountInfo() {
        System.out.println(accountName + "|" + owner + "|" + balance);
    }
}