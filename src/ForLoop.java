//this file contains the basic syntax for for-loop
//the initialization expression can initialize more than one variable but they have to be of the same type
//also there can be multiple increment or decrement expressions

public class ForLoop {
    public static void main(String[] args) {
        int[] array = {0,1,2,3,4,5,6,7,8,9};
        for (int i = 0 ; i<array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
