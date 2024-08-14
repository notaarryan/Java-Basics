//a variable declared final implies that its value is constant
//for primitives ~ value is constant
//for reference variables ~ reference is constant
//final variables do not get default values

//Final Instance Variable
//constant for the life of the object
//must be initialized in:
//1.declaration statement
//2.constructor
//3.Instance Initializer

//Local Instance Variable
//constant for the rest of the block

//Static Instance Variable
//constant for all instances of the class

//constant variables are final variables whose values are known at compile time
//all constant variables are final variables but not all final variables are constant variables
//for a final variable to be a constant variable:
//1.It must be a primitive or a String
//2.It must be initialized in declaration statement with a constant expression

public class FinalVariables {
    //this is a static final variable
    static final int id;
    static {
        id = 20;
    }

    //this is an instance final variable
    final int id1;

    FinalVariables() {
        this.id1 = 123;
    }

    //this is a constant variable
    final int id2 = 123;

    public static void main(String[] args) {
        for (int i = 10;i>0;i--) {
            //this is a final local variable
            final int id = 100;
        }
    }
}
