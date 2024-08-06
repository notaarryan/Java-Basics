//a method invoking itself to accomplish a task is known as recursion
//such a method is referred to as a recursive method and such invocation is known as recursive invocation
//When jvm loads it gets a chunk of memory from the system some part of this memory is allocated to stack
//whenever a method is invoked it gets stored in the chunk
//if there is no end point to recursion the stack will get fully occupied and a stackoverflow error is thrown
//this is very basics of stack
//to avoid this problem we must have an endpoint to a recursive method
//recursion is less efficient as it takes up more time and space in memory
//but it is necessary in some cases such as binary search

public class Recursion {
    static int factorialNonRecursive(int n) {
        if (n ==1 || n==0) {
            return 1;
        }

        int factorial = n;

        while (n>=2) {
            factorial = factorial*(n-1);
            n--;
        }
        return factorial;
    }

    //this will recurse infinitely and throw stackoverflowerror
    static int stackOverflow(int n) {
        return n*stackOverflow(n-1);
    }

    static int factorial(int n) {
        if (n == 1) {
            return 1;
        }

        return n*factorial(n-1);
    }
}
