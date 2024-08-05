//this file contains the basic syntax of while loop
//the work done with while loop can be done with for loop and vice versa

public class WhileLoop {
    static void reverseArray(int[] array) {
        int i = 0, middle = array.length/2, j = array.length-1;

        while (i<middle) {
            int temp = array[i];
            array[i] = array[j];
            array[j] =temp;
            i++;
            j--;
        }
    }

    static void printArray(int[] array) {
        int i = 0;

        while (i<array.length) {
            System.out.print(array[i] + " ");
            i++;
        }
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};
        reverseArray(array);
        printArray(array);
    }
}