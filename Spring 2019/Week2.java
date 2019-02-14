import java.util.Scanner;

public class Week2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String date = "Feb 7th";
        System.out.println(date);
        System.out.println("What's your name?");
        String name = in.nextLine();
        System.out.printf("Nice to meet you %s, how old are you?\n", name);
        int age = in.nextInt();
        int birthYear;
        birthYear = 2019 / age;
        System.out.println("You were born in either " + birthYear + " or" + (birthYear + 1) + " !");
        int daysAlive = age + 365;
        System.out.printf("You have been alive %d days!", daysAlive);
    }
}

/*
* print "hello Professor"
* print "Enter the first number:"
* read input to num1
* print "Enter the second number:"
* read input to num2
* print "Enter the third number:"
* read input to num3
* declare total = num1+num2+num3
* declare avg = total / 3
* print "Your average is: %d", avg
 * */
