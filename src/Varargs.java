//varargs in java

public class Varargs {

    static void varargs(boolean b, int i ,int k ,int j) {
        System.out.println("In overload without varargs");
    }

    static void varargs(boolean b , int... items) {
        System.out.println("In overload with varargs");
        System.out.println("Length: " + items.length);
    }

    public static void main(String[] args) {
        varargs(true,1,2,3);
        varargs(true,1,2,3,4,5);
        varargs(true);
    }
}
