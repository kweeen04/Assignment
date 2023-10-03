import java.util.ArrayList;
import java.util.List;

public class TransactionAnalyzer {
    public Transaction transaction;
    public User user;


    public TransactionAnalyzer(Transaction transaction, User user) {
        this.transaction = transaction;
        this.user = user;
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
