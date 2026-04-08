interface PaymentUtility {
    int refNo = 0; 

    static int genRef(int current) {
        return current++;
    }
}

abstract class Payment {
    public static int counter = 0;
    public int transactId;
    protected double amount;
    final double platformFee = 10;

    Payment(double amount) {
        this.amount = amount;
        counter = PaymentUtility.genRef(counter);
        transactId = counter;
    }

    abstract void processPayment();
}

class CreditCardPayment extends Payment {
    private String cardNo;
    private int cvv;

    CreditCardPayment(String cardNo, int cvv, double amount) {
        super(amount);
        this.cardNo = cardNo;
        this.cvv = cvv;
    }

    @Override
    void processPayment() {
        System.out.println("-----Credit Card Payment-----");
        System.out.println("Transaction ID: " + transactId);
        System.out.println("Amount: " + amount);
        System.out.println("Fee: " + platformFee);
        System.out.println("Card: "+ cardNo);
    }
}

class UPIPayment extends Payment {
    private String upiId;

    UPIPayment(String upiId, double amount) {
        super(amount);
        this.upiId = upiId;
    }

    @Override
    void processPayment() {
        System.out.println("-----UPI Payment-----");
        System.out.println("Transaction ID: " + transactId);
        System.out.println("Amount: " + amount);
        System.out.println("Fee: " + platformFee);
        System.out.println("UPI ID: " + upiId);
    }
}

public class Main {
    public static void main(String[] args) {
        CreditCardPayment c = new CreditCardPayment("1234567812345678", 111, 500);
        UPIPayment u = new UPIPayment("hello@okhdfc", 300);

        c.processPayment();
        u.processPayment();
    }
}