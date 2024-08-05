//a for-each loop is also known as enhanced for-loop
//for-each loop is used to iterate through each values of a data structure like an array

public class EnhancedFor {
    static void printArray(int[] array) {
        //here each element of array is assigned to the variable i --> the variable i has to be of the same data type as the values stored in the array
        for(int i:array) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4};
        printArray(array);
    }
}
