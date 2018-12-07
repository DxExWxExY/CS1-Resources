/**
 * Based on the class's response I got on the google form,
 * I will make a super practice problem tha will contain
 * The hardest topics for the class. These problems will
 * have some guard rails to help you and links to help you
 * if you get stuck.
 * */

public class FinalReview {
    /* READ CAREFULLY, PLEASE*/
    /* https://goo.gl/CmsUGQ For classes info */
    /*Create a constructor for the class FinalReview that
    * initializes all the fields found
    * */
    private int numProblems;
    private String difficultly;
    private boolean hasBeenCompleted;

    /*CONSTRUCTOR
    * NOTE: Constructors have to use the this keyword in most
    * cases, but it is a good practice to use it all the time
    * */

    public FinalReview(int numProblems, String difficultly, boolean hasBeenCompleted) {
        this.numProblems = numProblems;
        this.difficultly = difficultly;
        this.hasBeenCompleted = hasBeenCompleted;
    }
    /*Since the fields are private, we need to make getters and
    * setters for them bellow.
    * NOTE: The naming convention for setters and getters is usually
    * get<fieldName> and set<fieldName>
    * */

    public int getNumProblems() {
        return numProblems;
    }

    public String getDifficultly() {
        return difficultly;
    }

    public boolean isHasBeenCompleted() {
        return hasBeenCompleted;
    }

    public void setNumProblems(int numProblems) {
        this.numProblems = numProblems;
    }

    public void setDifficultly(String difficultly) {
        this.difficultly = difficultly;
    }

    public void setHasBeenCompleted(boolean hasBeenCompleted) {
        this.hasBeenCompleted = hasBeenCompleted;
    }

    /* https://goo.gl/K4C4qe For Exceptions info */
    /*Create a class method that does that calculates the 2^n
    * recursively.
    * NOTE: Recursion has 3 main parts to it - base case, recursive call
    * and code/logic. Don't forget to update the value accordingly to
    * your logic.
    * */
    public int powOf2(int n) {
        if (n == 0) {
            return 1;
        } else {
            return 2 * powOf2(n - 1);
        }
    }
    /*Create a class method that performs a division of 2 numbers
    * and returns a double. Keep in mind that there is only one type
    * of division that can't be done.
    * NOTE: in the case of performing a problematic operation java
    * will throw an ArithmeticException. Given this, how can we prevent
    * the program from ending 🤔🤔🤔
    * */
    public double divide(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            System.out.println("Tried to divide by 0");
        } finally {
            return -1;
        }
    }
    /*Now create a static method that takes an int and a string
    * as parameters and will perform the following arithmetic:
    * if the string equals "easy", then multiply n by 1;
    * if the string equals "moderate", then multiply n by 2;
    * if the string equals "hard", then multiply by 3;
    * For this problem you can use either if/else or switches.
    * NOTE: Static methods cannot use the this keyword, thus using
    * parameters.
    * */
    /* https://goo.gl/QqFX3c For switches info */

    public static int calculateTotalProblems(int n, String difficulty) {
        /* This returns an int, don't forget */
        switch (difficulty.toLowerCase()) {
            case "easy":
                return 1 * n;
            case "moderate":
                return 2 * n;
            case "hard":
                return 3 * n;
            default:
                return -1;
        }
         // OR ===============================
        if (difficulty.toLowerCase().equals("easy")) {
            return 1 * n;
        } else if (difficulty.toLowerCase().equals("moderate")) {
            return 2 * n;
        } else if (difficulty.toLowerCase().equals("hard")) {
            return 3 * n;
        } else {
            return -1;
        }
    }

    /* Make a test case for our method powOf2(), make sure that it returns
    * the desired values accordingly.
    * */
    public static void testPowOf2(int actual, int expected) {
        if (actual == expected) {
            System.out.println("test passed");
        } else {
            System.out.printf("test failed, got %d instead of %d", actual, expected);
        }
    }

    public static void main(String[] args) {
        int prob = 5;
        String diff = "moderate";
        /* Create an int variable called totalProblems and use the
        * static method calculateTotalProblems to assign it a value.
        * Use the variables above for the parameters.
        * */
        int totalProblems = FinalReview.calculateTotalProblems(prob, diff);
        /*Declare an object of type FinalReview named review and use the
        * totalProblems, diff, and some boolean value to initialize it
        * */
        FinalReview review = new FinalReview(totalProblems, diff, false);
        /*Now call divide() with the parameters of 7 and 0 in that order*/
        review.divide(7, 0);
        /*Now test powOf2() with some parameters of your preference
        * NOTE: the powers of 2 are 1 2 4 8 16 32 64 128 256 512 1024, so
        * test multiple times
        * */
        FinalReview.testPowOf2(review.powOf2(5), (int) Math.pow(2,5));
    }
}
