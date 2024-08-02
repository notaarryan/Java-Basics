//If the control flow statement is a if else or if-else if-else statement and all the blocks have a return statement the statement following the if-else if-else block becomes unreachable
//The above does not apply to if statement
//Also if within a block the statements after the return statement become unreachable


public class IfStatement {
    boolean approved = false;
    int age = 20;
    double salary = 90000;
    boolean hasBadCredit = false;
    boolean approve() {
        IfStatement n = new IfStatement();
        if (n.age>=18 && n.age<25 && n.salary>50000) {
            return true;
        } else if (n.age>=25 && n.age<50 && n.salary>60000) {
            return true;
        } else {
            return false;
        }

        //here as all the blocks have a return statement
        //if any other statements were to be written here the would become unreachable
    }

    public int exampleMethod(int x) {
        if (x > 0) {
            return x; // Method exits if x > 0
        }
        System.out.println("x is not greater than 0");
        return -1;
    }

    public static void main(String[] args) {
        IfStatement n = new IfStatement();
        n.approve();
    }
}
