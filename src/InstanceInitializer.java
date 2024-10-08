//instance initializers are used to initialize instance variables
//why use instance initializers if we have constructors?
//Instance initializers are copied to the beginning of all constructor
//so if we want to share code among all constructors we use instance initializers
//if a constructor has this() invocation the Instance Initializer is not copied there


public class InstanceInitializer {
    InstanceInitializer() {
        System.out.println("Inside no-args constructor\n");
    }

     InstanceInitializer(String name) {
        System.out.println("Inside constructor with parameter\n");
    }

    {
        System.out.println("Inside initializer");
    }

    public static void main(String[] args) {
        new InstanceInitializer();
        new InstanceInitializer("aryan");
    }
}
