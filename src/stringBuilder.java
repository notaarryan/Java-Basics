//while string class is immutable
//StringBuilder is mutable
//it has methods like:append,length,delete,insert,reverse,replace
//There is a similar class to StringBuilder called StringBuffer,
//but it is out of date
//StringBuilder is non-Synchronised~faster while StringBuffer is Synchronised~slow

import java.lang.StringBuilder;

public class stringBuilder {
    static void builder1() {
        StringBuilder sb = new StringBuilder();
        sb.append("hello");
        sb.append(" world");
        String s = sb.toString();
        System.out.println(s);
    }

    static void builder2() {
        StringBuilder sb = new StringBuilder("Hello World!");
        sb.append(" Hello World!");
        String s = sb.toString();
        System.out.println(s);
    }

    static void builder3() {
        String s = "Hello";
        StringBuilder sb = new StringBuilder(s);
        sb.append(" world hello world");
        s = sb.toString();
        System.out.println(s);
        sb.delete(1,5);
        s = sb.toString();
        System.out.println(s);
        sb.insert(2,"HELLO");
        s = sb.toString();
        System.out.println(s);
        sb.reverse();
        s = sb.toString();
        System.out.println(s);
        sb.reverse();
        s = sb.toString();
        System.out.println(s);
        sb.replace(2,7," ");
        s = sb.toString();
        System.out.println(s);
        System.out.println(sb.length());
    }

    public static void main(String[] args) {
        builder1();
        builder2();
        builder3();
    }
}
