//Method overloading

public class MethodOverloading {
    void print(int i) {
        System.out.println("method: print(int i)");
    }

    void print(short s) {
        System.out.println("method: print(short s)");
    }

    void print(boolean b) {
        System.out.println("method: print(boolean b)");
    }

    public static void main(String[] args) {
        MethodOverloading mo = new MethodOverloading();

        int i = 1000;
        mo.print(i);

        byte by = 22;
        mo.print(by);

        boolean b = true;
        mo.print(b);
    }
}
