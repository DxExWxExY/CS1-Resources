package Tests;

import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        System.out.println("Passing control from main to powOf2...");
        System.out.println(Arrays.toString(Thread.currentThread().getStackTrace()));
        int x = powOf2(5);
        System.out.println(Arrays.toString(Thread.currentThread().getStackTrace()));
        System.out.println("Main gained control back from powOf2, the result is : " + x);
    }
    /**
     * Remember that recursion is sequential, meaning that it executes line by line.
     * So if there is a method call, it will jump to the code where the methods is and
     * will continue to execute the code of the method, and after it reached, it will
     * jump back to the line that called the method and continue to execute the rest
     * of the code.
     * */
    public static int powOf2(int n) {
        System.out.println(Arrays.toString(Thread.currentThread().getStackTrace()));
        System.out.println("powOf2 Gained control from a all! Value of n: " + n);
        if (n == 0) {
            // this is the base case that will cause recursion to stop
            System.out.println("Reached base case, returning control to previous call. Value of n: " + n);
            System.out.println(Arrays.toString(Thread.currentThread().getStackTrace()));
            return 1;
        } else {
            // this means that the base case hasn't been reached
            int x = 2;
            System.out.println("Passing Control to Next Call with the value of (n-1): " + (n-1));
            // making a call with a decremented value
            x *= powOf2(n - 1);
            System.out.println("Control gained back from n-1 call: " + (n-1) + "\nReturning Value and Control to Previous Call...");
            System.out.println(Arrays.toString(Thread.currentThread().getStackTrace()));
            return x;
        }
    }
}
