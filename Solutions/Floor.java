/*
Solution to June 2021 Coding Nomads Challenge: Find the Floor
https://forum.codingnomads.co/t/prizes-june-code-challenge-find-the-floor/983
 */

import java.util.ArrayList;
import java.util.List;

public class Floor {

    public static int find_floor(String directions) {
        //initialize variables to keep track of floor and position
        int whichFloor = 0; //keeps track of which floor we're on
        int position = 1; //keeps track of position of ( or ) each time we enter the basement

        //create a list of all the positions that we enter the basement
        List<Integer> positionsList = new ArrayList<>();

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

        //loop through each element in the array and increase or decrease whichFloor by +1 for ( and -1 for )
        for (char ch : chars) {
            if (ch == '(') {
                whichFloor++;
            } else if (ch == ')') {
                whichFloor--;
            }

            //Determine which position user first enters the basement and store in a list
            if (whichFloor != -1) {
                position++;
            } else {
                positionsList.add(position);
            }
        }

        //Retrieve the first element from the list, since that's the first time we entered the basement
        System.out.println("The first position you entered the basement is: " + positionsList.get(0));

        //return the value of whichFloor which represents which floor you're on
        return whichFloor;
    }

    public static void main(String[] args) {
        //Test )())()) and should get -3
        System.out.println("You're on floor: " + find_floor(")))"));
    }
}
