//this file contains the basic syntax of while loop
//the work done with while loop can be done with for loop and vice versa
//prefer a for loop over while loop because the variable initialized for while loop in the block of method will have a scope till the end of the method
//while in for-loop the scope variable used for initializing for loop has a local scope within the loop
//for(initialization;condition;increment/decrement/other expressions);


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
