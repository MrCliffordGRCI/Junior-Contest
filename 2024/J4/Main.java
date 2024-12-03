/* 2024 J4 Troublesome Keys
*/

import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    String input = scn.nextLine();
    String output = scn.nextLine();

    // this section of code only works if the quiet key is never pressed
    if (input.length() == output.length()) {
      for (int j = 0; j < input.length(); j++) {
        if (input.charAt(j) != output.charAt(j)) {
          System.out.println(input.charAt(j) + " " + output.charAt(j));
          System.out.println("-");
          break;
        }
      }
    }

    // the following code works only if there is a quiet key press
    else {
      /*
       * The trick is to go through the alphabet and check if each letter is the quiet
       * key. We make a "temp" input string where the
       * the current letter of the alphabet is removed. The letter is the quiet key
       * IF:
       * 1) The temp string and the output string are the same length and....
       * 2) There is only one other letter in the temp string that doesn't match the
       * output string (Stick key!). If there is more than one letter than the current
       * letter of the alphabet is NOT the quiet key. (you can't have two sticky
       * keys!)
       */
      for (char i = 'a'; i <= 'z'; i++) {
        String temp = "";
        String current = "" + i;// converts the character to a string. Needed for using replaceAll method

        if (input.contains(current)) {
          temp = input.replaceAll(current, "");// make a temp string with the current letter of alphabet removed
          char sticky = ' ';// the sticky key
          char stickyOut = ' ';// the output one gets if they press sticky key
          boolean works = true;// if works stays true then you know you only had one sticky key!

          if (temp.length() == output.length()) {// if they are not the same length than the letter can't be the quiet
                                                 // key
            for (int j = 0; j < temp.length(); j++) {
              if (temp.charAt(j) != output.charAt(j)) {
                if (sticky == ' ') {// if we have not assigned a sticky key yet do it
                  sticky = temp.charAt(j);
                  stickyOut = output.charAt(j);
                } else if (sticky != temp.charAt(j)) {// this means there is another potential sticky which isn't
                                                      // possible. Reset and try next letter
                  works = false;
                  break;
                }
              }
            }
            if (works) {// if works stays true then you know you only had one sticky key!
              System.out.println(sticky + " " + stickyOut);
              System.out.println(current);
            }
          }
        }
      }
    }
  }
}