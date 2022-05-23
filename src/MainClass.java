public class MainClass {
    public static void main(String[] args) {
        CreditCard belarusbank = new CreditCard("BYN46624246", 1000);
        CreditCard tinkoffbank = new CreditCard("BYN2356889", 2000);
        CreditCard belgazprombank = new CreditCard("BYN986523", 500);

        belarusbank.addMoney(200);
        tinkoffbank.addMoney(500);
        belgazprombank.payMoneyFromCart(250);

        belarusbank.printBalance();
        tinkoffbank.printBalance();
        belgazprombank.printBalance();
    }
}
