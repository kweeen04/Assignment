import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class TransactionAnalyzer {
    public Transaction transaction;
    public User user;


    public TransactionAnalyzer(Transaction transaction, User user) {
        this.transaction = transaction;
        this.user = user;
    }

    Random random = new Random();
    ArrayList<Transaction> transactions = new ArrayList<>();
    for (int i = 0; i < 50; i++) {
        String date = new Date().toString();
        float amount = random.nextFloat() * 20000 - 10000;
        Type type = random.nextBoolean() ? Type.deposit : Type.withdraw;

        Transaction transaction = new Transaction(date, amount, type);
        transactions.add(transaction);
    }


    public List<Float> calculateBalanceHistory() {
        float balance = 0;
        List<Float> res = new ArrayList<>();
        Transaction node = this.transaction;

        while (node != null) {
            balance += node.getAmount();
            res.add(balance);
            node = node.next;
        }

        return res;
    }

    
}
