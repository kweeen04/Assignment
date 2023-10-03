public class User {
    private String name;
    private String account_num;
    private float balance;

    public User(String name, String account_num, float balance) {
        this.name = name;
        this.account_num = account_num;
        this.balance = balance;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccount_num() {
        return this.account_num;
    }

    public void setAccount_num(String account_num) {
        this.account_num = account_num;
    }

    public float getBalance() {
        return this.balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "{" +
            " User= '" + getName() + "'" +
            ", account_Number= '" + getAccount_num() + "'" +
            ", balance= '" + getBalance() + "'" +
            "}";
    }
}