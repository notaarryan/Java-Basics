//Understanding how Java stores values in methods

import java.util.Arrays;

public class UpdateValue {

//    creating an int id and storing 1000 in it
    int id = 1000;

//    creating an array of integers
    int[] ids = {1000,10001};


//    method to update integer using variable
    void updateInt(int newId) {
        newId = 1001;
    }

//    method to update integer by using object reference
    void updateIntByObjectReference(UpdateValue uv) {
        uv.id = 1001;
    }

//    method to update array
    void updatingArray(int[] ids) {
        ids[0] = 10001;
    }

    public static void main(String[] args) {
        UpdateValue uv = new UpdateValue();

//        invoking updateInt
        uv.updateInt(uv.id);

//        System.out.println prints 1000 not 1001
        System.out.println("id = " + uv.id);

//        invoking updateIntByObjectReference
        uv.updateIntByObjectReference(uv);

//        System.out.println prints 1000
        System.out.println("id = " + uv.id);

//        invoking updatingArray
        uv.updatingArray(uv.ids);

//        System.out.println prints 10001
        System.out.println("Array = " + Arrays.toString(uv.ids));
    }
}
