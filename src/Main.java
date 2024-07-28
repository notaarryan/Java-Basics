public class Main {
    double sum(double num1,double num2) {
        return num1+num2;
    }

    public static void main(String[] args) {
        Main main = new Main();
        double sum = main.sum(4,6);
        System.out.println(main.sum(4,6));
    }
}