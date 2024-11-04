// Andres Garcia
// 11/2/2024
// CPSC-39-10111
// Recursion problems with JUnit testing

public class Recursion {

    public static void main(String[] args) {
        //Test cases
        System.out.println(count8(8818));                  // Expected output: 4
        System.out.println(countHi("hixhixhix"));          // Expected output: 3
        System.out.println(countHi2("ahixhihi"));          // Expected output: 2
        System.out.println(strCount("cowcaw", "cow")); // Expected output: 1
        System.out.println(stringClean("abbcccdddd"));     // Expected output: abcd
    }//End main

    /*
     * Counts every 8 within a number, doubling
     * if there's another 8 to its left
    */
    public static int count8(int num) {
        //Base case: if num is 0, there's no digits to count
        if (num == 0) {
            return 0;
        }

        //Stores the rightmost digit
        int rightmostDigit = num % 10;
        //Stores the digit left of rightmost digit
        int nextDigit = (num / 10) % 10;

        //If rightmostDigit is 8
        if (rightmostDigit == 8) {
            //If nextDigit is an 8, count this 8 as a double
            if (nextDigit == 8) {
                return 2 + count8(num / 10);
            } else {
                //Otherwise, count this 8 as a single
                return 1 + count8(num / 10);
            }
        } else {
            //If current digit isn't 8, move on to the next
            return count8(num / 10);
        }
    }//End count8

    /*
     * Counts every 'hi' within a string
    */
    public static int countHi(String str) {
        //Base case: if str has less than 2
        //characters, 'hi' will not be within
        if (str == null || str.length() < 2) {
            return 0;
        }

        //Stores the first two characters seperately
        char char1 = str.charAt(0);
        char char2 = str.charAt(1);

        //If char1 and char2 spell out 'hi', count it and move on
        if (char1 == 'h' && char2 == 'i') {
            return 1 + countHi(str.substring(2));
        }

        //Otherwise, move on to the next characters in str
        return countHi(str.substring(1));
    }//end countHi

    /*
     * Works similar to countHi, except it excludes any 'hi'
     * with an 'x' before it
    */
    public static int countHi2(String str) {
        //Base case: if str has less than 2
        //characters, 'hi' will not be within
        if (str == null || str.length() < 2) {
            return 0;
        }

        //Stores the first two characters seperately
        char char1 = str.charAt(0);
        char char2 = str.charAt(1);

        //If char1 has an 'x', don't count the next 'hi'
        if (char1 == 'x' && char2 =='h') {
            return countHi2(str.substring(2));
        }else if (char1 == 'h' && char2 == 'i') {
            //If char1 and char2 spell out 'hi', count it and move on
            return 1 + countHi2(str.substring(2));
        }

        //Otherwise, move on to the next characters in str
        return countHi2(str.substring(1));
    }//End countHi2

    /*
     * Counts every time a given substring is within a string
     * without overlapping
    */
    public static int strCount(String str, String sub) {
        //Base case: if string is shorter than substring,
        //they can't be compared
        if (str.length() < sub.length()) {
            return 0;
        }

        //Stores a part of string the same length as substring
        String strSample = str.substring(0, sub.length());

        //If substring and sample match, count it and move on
        if (sub.equals(strSample)) {
            return 1 + strCount(str.substring(sub.length()), sub);
        }

        //Otherwise, move on to the rest of string
        return strCount(str.substring(1), sub);
    }//End strCount

    /*
     * Removes adjacent characters that are the same
     * within a string and returns that modified string
    */
    public static String stringClean(String str) {
        //Base case: if string is a character, there's nothing to compare
        if (str.length() < 2) {
            return str;
        }

        //If the first two characters are the same, remove the first one
        if (str.charAt(0) == str.charAt(1)) {
            return stringClean(str.substring(1));
        }

        //Otherwise, keep the current character and move on
        return str.substring(0, 1) + stringClean(str.substring(1));
    }//End stringClean
}//End class