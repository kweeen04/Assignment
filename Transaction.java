enum type {
    deposit,
    withdrawal
}

public class Transaction {
    private String date;
    private float amount;
    private type type;

    public Transaction(String date, float amount, type type) {
        this.date = date;
        this.amount = amount;
        this.type = type;
    }

    public String getDate() {
        return this.date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public float getAmount() {
        return this.amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public type getType() {
        return this.type;
    }

    public void setType(type type) {
        this.type = type;
    }

}
