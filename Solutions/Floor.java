/*
Solution to June 2021 Coding Nomads Challenge: Find the Floor
https://forum.codingnomads.co/t/prizes-june-code-challenge-find-the-floor/983
 */

import java.util.ArrayList;
import java.util.List;

public class Floor {

    public static int find_floor(String directions) {
        //initialize counter variable
        int count = 0;

        //convert the string to an array of chars
        List<Character> chars = new ArrayList<>();
        for (char ch : directions.toCharArray()) {
            chars.add(ch);
        }

        //validate the input to make sure it's all ( or )
        for (char ch : chars) {
            if (ch == '(' || ch == ')') ;
            else {
                System.out.println("Input must be either all '(' or ')' no exceptions!");
                System.exit(0);
            }
        }

        //loop through each element in the array and count +1 for ( and -1 for )
        for (char ch : chars) {
            if (ch == '(') {
                count++;
            } else if (ch == ')') {
                count--;
            }
        }

        //return the value of count which represents which floor you're on
        return count;
    }

    public static void main(String[] args) {
        //Test )())()) and should get -3
        System.out.println(find_floor(")())())")); //results in -3
    }
}
