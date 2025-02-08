package fintech.model;

/**
 * @author 12S23008 Ranty Pakpahan
 * @author 12S23048 Grace Caldera
 */
public class Transaction {
    private String id;
    private double amount;
    private String date;
    private String note;

    public Transaction(String id, double amount, String date, String note) {
        this.id = id;
        this.amount = amount;
        this.date = date;
        this.note = note;
    }

    @Override
    public String toString() {
        return "Transaction{id='" + id + "', amount=" + amount + ", date='" + date + "', note='" + note + "'}";
    }
}