/**
 * This contains a syntax guide for several topics covered in class up to week n.
 *
 * @version Week 5
 */
public class SyntaxCheatSheet {
    /*Class template*/
    public class REPLACE_NAME {
        /*
         * For now don't worry about the main method's signature
         * just copy and paste it
         */
        public static void main(String[] args) {
            /******************************/

            // Place your code here

            /******************************/
        } // CLOSES MAIN
    } // CLOSES CLASS


    public static void main(String[] args) {

        /*Variable declaration Type name = value; OR Type name;*/
        String str = "test";
        String str2;
        str2 = "test";

        /*To update the value of a variable you don't need to redeclare the variable*/
        int age = 21;
        age = 22;

        /*Evaluators and logical operators*/
        boolean a = 1 == 1; // equality for non strings
        boolean b = 10 > 5; // or >=
        boolean c = 5 < 6; // or <=
        boolean d = str.equals(str2);
        boolean e = true && true; // both must be true to evaluate to true
        boolean f = true || false; // either must be true to evaluate to true
        boolean g = !false; // inverts the value


        /*if statements can have unlimited else if's if needed*/
        if (/*condition*/) {
            // Do something if true
        } else if (/*condition*/) {
            // Do something if true
        } else { /*something outside of the scope of your previous conditions*/
            // Do something
        }

        /*Switches can have unlimited cases if needed*/
        switch (/*variable*/) {
            case /*value to be compared*/:
            // Do something if true
            break;
            default:
                // Do something outside of the scope of your previous checks
                break;
        }

        /*Loops*/
        while (/*condition*/) {
            // Do something
            /*REMEMBER TO UPDATE THE VALUE BEING CHECKED IN CONDITION*/
        }

        do {
            // Do something
            /*REMEMBER TO UPDATE THE VALUE BEING CHECKED IN CONDITION*/
        } while (/*condition*/);

        /*if you do not plan to use i outside the for loop */
        for (int i = /*value*/; /*condition*/ ; /*update value of i (i++, i--, etc.)*/) {
            // Do something
        }

        /*if you want to use i outside the loop. Remember that i will have the value it had
         * before it exited the for loop, not the initial value*/
        int i;
        for (i = /*value*/; /*condition*/ ; /*update value of i (i++, i--, etc.)*/) {
            // Do something
        }

        /*Different ways to declare arrays*/
        int[] array = {1, 2, 3, 4};
        double[] array1 = new double[n]; //where n >= 0

        /*DIffernt ways to declare 2D arrays*/
        String[][] strings = {
                {"va1", "val2"},
                {"val3", "val4"}
        };
        boolean[][] booleans = new boolean[n][m]; // where n and m are >= 0

        /*General Structure for accessing elements in 2D arrays AKA matrix*/
        /*Always use the length property*/
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                /*The innermost loop iterates trough the columns
                 * in row i
                 * */
            }
        }
    }

    /*method Declarations*/
    public static /*return type*/ /*name*/(/*parameters (DataType name, ...)*/) {
        // code goes here
        return /*might not be needed if using void type*/;
    }
}

