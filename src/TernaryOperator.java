//ternary operator can be used in place of if-else statements
//if there is only one expression in the if-else block
//as ternary operator increases readability

public class TernaryOperator {

    static int min(int x, int y) {
        return (x<y)?x:y;
    }

    public static void main(String[] args) {
        int min = min(7,8);
        System.out.println(min);
    }
}
