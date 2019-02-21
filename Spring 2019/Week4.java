import java.util.Scanner;
public class LoopProblems {
    public static void main(String[] args) {
/**
 * Problem 1. Make a while loop that iterates from 20 to 1000 in increments 0f 1
 * and prints each number including the last one. Ex ... 998 999 1000
 */
        int start = 20;
        int end = 1000;
        while (start <= end){
            System.out.print(start + " ");
            start++;
        }
/**
 * Problem 2. Make a for loop that uses var i to iterate, and starts from 1000 to 900 and only
 prints
 * numbers that are multiples of 10. Ex 10 20 30 40 ...
 */
        for (int i = 1000; i >= 900 ; i-=10) {
            System.out.print(i + " ");
        }
/**
 * Problem 3. Make a while loop where it uses a variable whose value is updated with user input
 and exits
 * when the user inputs "good night" in any casing.
 * */
        Scanner sc0 = new Scanner(System.in);
        System.out.println("Please enter your name");
        String name = sc.nextLine();
        while (!name.equals("good night")) {
            System.out.println("Nice meeting you " + name + "!");
            System.out.println("Please allow another person to enter their name.");
            System.out.println("Hello there new user, what's your name?");
            name = sc.nextLine();
        }
        System.out.println("Process killed, exiting...");
        System.exit(0);
/**
 * Problem 4. Make a for loop that will iterate and tell if a number is odd or even.
 * The starting index, increments, and last value are inputted by the user.
 * Ex. 10 is even, 15 is odd, 20 is even, ...
 * */
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter starting value");
        int a = sc1.nextInt();
        System.out.println("Enter ending value");
        int b = sc1.nextInt();
        System.out.println("Enter increment values");
        int c = sc1.nextInt();
        for (int i = s; i < e ; i+=inc) {
            if (i % 2 == 0) {
                System.out.println(i + "is even.");
            } else if (i % 2 != 0) {
                System.out.println(i + "is odd.");
            }
        }
    }
}