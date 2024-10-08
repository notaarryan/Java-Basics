//Strings in java are an object of class java.lang.String
//Strings are immutable sequence of unicode characters
//String class uses character array to store strings
//there are 2 ways to initialize strings
//1.using new keyword (not recommended)
//        String s = new String("Hello");
//2.using a string literal (recommended)
//        String s = "Hello";
//here in both cases s is an object reference
//strings created using string literals are stored in string pool
//if two strings created using literals have same value they will point to the same location in memory
//they will not be stored in different locations
//but if two strings created using new keyword have same value are stored in different memory locations


public class string {
    static void initialization() {
        String s = new String("Hello");

        char[] cArray = {'h','e','l','l','o'};
        s = new String(cArray);

        s = "Hello";
    }

    static void stringMethods() {
        String s = "hello world";

        //returns length of string
        System.out.println("s.length(): " + s.length()+"\n");

        //returns true if string is empty and false if not
        System.out.println("s.isEmpty(): " + s.isEmpty()+"\n");

        //returns true if string passed in as argument is equal to the string
        System.out.println("s.equals(\"hello world!\": " + s.equals("Hello world")+"\n");

        //same as equals() but ignores case sensitivity
        System.out.println("s.equals(\"hello world!\": "+s.equalsIgnoreCase("HELLO WORLD")+"\n");

        //returns true if the string contains the string passed in as argument
        System.out.println("s.contains(\"hello\": " + s.contains("hello")+"\n");

        //returns true if the string starts with the string passed in as argument
        System.out.println("s.startsWith(\"hello\": " + s.startsWith("hello")+"\n");

        //returns true if the string ends with the string passed in as argument
        System.out.println("s.endsWith(\"hello\": " + s.endsWith("rld")+"\n");

        //returns index of the string passed in as argument at its first occurrence
        System.out.println("s.indexOf(\"o\": " + s.indexOf("o")+"\n");

        //returns index of the string passed in as argument at its last occurrence
        System.out.println("s.lastIndexOf(\"o\": " + s.lastIndexOf("o")+"\n");

        //returns character at the specified index in of the string
        System.out.println("s.charAt(4): "+ s.charAt(4)+"\n");

        //returns a substring from the string according to the starting and ending indexes passed
        //if end index is not given it returns everything till end of the string
        //end index is not included if specified
        System.out.println("s.substring(4): "+s.substring(4)+"\n");
        System.out.println("s.substring(4,9): "+s.substring(4,9)+"\n");

        //returns a copy of string converted to uppercase or lowercase
        System.out.println("s.toLowerCase: "+s.toLowerCase()+"\n");
        System.out.println("s.toUpperCase: "+s.toUpperCase()+"\n");

        //returns a copy of string with leading and trailing whitespaces removed
        String s1 = "    hello    ";
        System.out.println("s.trim(): "+s.trim()+"\n");

        //returns a copy of string with all instances of target replaced with replacement
        //replace(target,replacement)
        System.out.println(s.replace("o","r")+"\n");

        //returns an array of strings split at all instances of the string passed in as argument
        String[] sArray = s.split("o");
        for (String i : sArray) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        stringMethods();
    }
}
