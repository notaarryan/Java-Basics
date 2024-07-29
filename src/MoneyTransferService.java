public class MoneyTransferService {
    static currencyConverter cc = new currencyConverter();

    double computeTransferAmount(int index, double amount) {
        return cc.computeExchangeRate(index,amount);
    }

    double computeTransferFee(int index , double amount) {
        return (cc.computeExchangeRate(index,amount))*0.02;
    }

    public static void main(String[] args) {
        MoneyTransferService mts = new MoneyTransferService();
        double amount = mts.computeTransferAmount(0,1000);
        System.out.println("TransferAmount: " + amount);
        double transferFee = mts.computeTransferFee(0,1000);
        System.out.println("TransferFee: " + transferFee);
    }

}
