package fintech.model;

/**
 * @author 12S23008 Ranty Pakpahan
 * @author 12S23048 Grace Caldera
 */
public class Transaction {
    private String id;
    private double amount;
    private String date;

    public Transaction(String id, double amount, String date) {
        this.id = id;
        this.amount = amount;
        this.date = date;
    }

    @Override
    public String toString() {
        return "Transaction{id='" + id + "', amount=" + amount + ", date='" + date + "'}";
    }
} 