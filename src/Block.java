//this file contains why to use blocks in java

//blocks in java are the lines of code written within curly braces {}
//we use blocks in java to control flow
//we use blocks in java to group logic so that it increases the readability of the code
//blocks can be used to control the scope of a variable as the variables declared within ends with the end of the block


public class Block {

    static void block() {
        {
            int id = 100;
            double gpa = 4.0;
        }
        //here we can reuse the name of the variable as they were declared within a block
        //if they were declared outside the block they cannot be declared again
        {
            int id = 101;
            double gpa = 3.5;
        }


    }
}
