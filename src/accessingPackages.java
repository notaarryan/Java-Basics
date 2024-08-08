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

//accessing our own package in java
import javapackage.Package;


//to access a package created in a directory form other directory
//1. compile the package class
//2. copy the path reference to the file that contains package
//3. open terminal in the directory you want to access package in
//4. set path using respective commands
//for mac: export CLASSPATH = path to src file containing the package
//for windows: set CLASSPATH = path to src file containing the package
//5. run the file in terminal

public class accessingPackages {
    public static void main(String[] args) {
        //this is a fully qualified class name
        //always prefer import statement over fully qualified class name until necessary
        java.sql.Date date = new java.sql.Date(2007,12,25);

        Package p = new Package();
        p.print();
    }
}
