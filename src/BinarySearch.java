//this is a use case of recursion
//in binary search we use a sorted array in ascending order to find the index of the element passed
//here we will use an array which is already in ascending order
//in binary search we find mid-point and check if the element is at the mid-point or not
//if not we check if the number is greater than or less than the mid-point if its greater we ignore the lower numbers and call the method again passing new keys and vice versa
//this continues until we find the index of the element or till the lower index and the higher index becomes equal
//if that's the case we check if the element is present at either lower or higher index doesn't matter as they are th same
//if the element is not present then we return -1 as it is not present in the array
//also if lower > higher we return -1

public class BinarySearch {
    static int binarySearch (int[] array , int lower, int higher,int key) {
        if (lower == higher) {
            if (array[lower] == key) {
                return lower;
            } else {
                return -1; //element not in array
            }
        } else if (lower > higher) {
            return -1;
        }

        int mid = (lower+higher)/2;

        if (array[mid] == key) {
            return mid;
        } else if (key > array[mid]) {
            return binarySearch(array,mid+1,higher,key);
        } else {
            return binarySearch(array,lower,mid-1,key);
        }
    }

    public static void main(String[] args) {
        int[] array = {12,19,24,34,55,65,71,83,91};
        int index = binarySearch(array,0,8,65);
        System.out.println("Index: " + index);
    }
}
