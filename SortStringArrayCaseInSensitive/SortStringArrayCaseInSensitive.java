/**
 * This program sorts a given string array in a case-insensitive manner.
 * The program takes a string as input, splits it into an array of strings, sorts the array
 * using a case-insensitive comparator, and prints the sorted array to the console.
 *
 * The main method performs the following steps:
 * 1. Declares and initializes a string variable.
 * 2. Splits the string into an array of strings.
 * 3. Sorts the array using a case-insensitive comparator.
 * 4. Prints the sorted array to the console.
 *
 * @author Rajasekar
 */
import java.util.Arrays;

public class SortStringArrayCaseInSensitive {
    
   public static void main(String[] args) {
      // Step 1: Declare and initialize a string variable
      String str = "HoLlYWoOd";
      
      // Step 2: Split the string into an array of strings
      String[] a = str.split("");
      
      // Step 3: Sort the array using a case-insensitive comparator
      Arrays.sort(a, String.CASE_INSENSITIVE_ORDER);
      
      // Step 4: Print the sorted array to the console
      Arrays.stream(a).forEach(System.out::print);
   }
}
