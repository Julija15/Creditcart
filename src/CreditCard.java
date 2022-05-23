public class CreditCard {

    String number;
    int balance;

    public CreditCard(String number, int balance) {
        this.number = number;
        this.balance = balance;
    }

    public void addMoney(int sum) {
        balance = balance + sum;
    }

    public void payMoneyFromCart(int sum) {
        balance = balance - sum;
    }

    public void printBalance() {
        System.out.println("card: " + number + ", balance: " + balance);
    }
}
