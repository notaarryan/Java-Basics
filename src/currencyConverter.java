public class currencyConverter {
    static double[] exchangeRates = {63.0,3.0,3.0,595.5,18.0,107.0,2.0};

    void setExchangeRates(double[] rates) {
        exchangeRates = rates;
    }

    void updateExchangeRates(int index,double rate) {
        exchangeRates[index] = rate;
    }

    double getExchangeRate(int index) {
        return exchangeRates[index];
    }

    double computeExchangeRate(int index,double amount) {
        return  amount* getExchangeRate(index);
    }

    static void printCurrencies() {
        System.out.println("\nRupees: " + exchangeRates[0]);
        System.out.println("Dirham: "+ exchangeRates[1]);
        System.out.println("Real: " + exchangeRates[2]);
        System.out.println("Chilean Peso: "+ exchangeRates[3]);
        System.out.println("Mexican Peso: "+ exchangeRates[4]);
        System.out.println("Yen: "+ exchangeRates[5]);
        System.out.println("Australian Dollar: " + exchangeRates[6]);
    }

    public static void main(String[] args) {
        currencyConverter cc = new currencyConverter();

        //Jan 1st

        double[] rates = {63.0,3.0,3.0,595.5,18.0,107.0,2.0};
        cc.setExchangeRates(rates);
        printCurrencies();

        //Jan 2nd

        rates = new double[] {63.0,3.0,3.0,595.5,18.0,107.0,2.0};
        cc.setExchangeRates(rates);
        printCurrencies();

//        Jan 3rd
        rates = new double[] {63.0,3.0,3.0,595.5,18.0,107.0,2.0};
        cc.setExchangeRates(rates);
        printCurrencies();

        cc.updateExchangeRates(0,66.0);
        printCurrencies();
        double amount = cc.computeExchangeRate(0,60000);
        System.out.println(amount);
    }
}
