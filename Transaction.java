public class Transaction {
    private String date;
    private float amount;
    private Type type;
    public Transaction next;

    public Transaction(String date, float amount, Type type) {
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

    public Type getType() {
        return this.type;
    }

    public void setType(Type type) {
        this.type = type;
    }

}
