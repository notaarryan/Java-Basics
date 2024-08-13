//if the initialization of a static variable has multiple statements we can use static initializer
//there can be multiple initializers~executed in order
//they cannot access instance variables

public class StaticInitializer {
    static int id;

    static int setId(int id) {
        return id;
    }

    static {
        try {
            id = setId(123);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
