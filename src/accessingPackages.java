//to access classes form different packages we have to ways
//1.import
//2.fully qualified class name
//import statement has to written at the start before the class
//while fully qualified class name can be written within a statement
//there are also two type of imports
//first is explicit import or single type import it imports a single class from the package
//second is * import it imports all the classes within the package
//there can be multiple import statement
//importing classes does not affect runtime
//if two packages have same class name then the class which is imported using explicit import gets precedence

//this is a star import
import java.io.*;

//this is an explicit import
import java.util.ArrayList;

public class accessingPackages {
    public static void main(String[] args) {
        //this is a fully qualified class name
        //always prefer import statement over fully qualified class name until necessary
        java.sql.Date date = new java.sql.Date(2007,12,25);
    }
}
