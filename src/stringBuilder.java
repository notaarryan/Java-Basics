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
    public static void main(String[] args) {
        builder1();
        builder2();
    }
}
