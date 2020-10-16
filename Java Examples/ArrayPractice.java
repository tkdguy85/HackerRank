package Java Examples;

import java.util.Arrays;                                    // Necessary import for running Array functions.


public class ArrayPractice {

    // Custom array printing function. This is just to help understand what is happening in the array layout.


    /* Uncomment to use function

    public static void printArray(int[] array) {            // Array is the parameter name.
        System.out.print("[");                              // Not using println since that would go to the next line. This keeps our [] on the same line.
        for (int i = 0; i < array.length; i++) {            // Making sure I stays less than the full length of the array, increasing by i++.
            int item = array[i];                            // Starts adding items to 'item' at i, the beginning of the index.
            System.out.print(item);                         // Again, not using println, to add the item to its place in the index.
            if (i < array.length -1) {                      // Less than one to not exceed an extra comma in the last set of the array.
                System.out.print(", ");                     // Gives that ', ' portion to our array format.
            }
        }
        System.out.println("]");                            // Closes the bracket and completes the array shape.
    }

    

    */

    public static void main(String[] args) {
        
        // Declaring, Allocating, & Initializing arrays
        
        int[] intArray1;                                    // Just declares array. Initialize later.
        int[] intArray2 = new int[4];                       // Setting the size of the array.
        int[] intArray3 = {5, 6, 3, 9, 2};                  // {} Declare what are actually in the array. Must be of the same data type. In this case 'int's.

        String[] shoppingList = {'milk', 'eggs', 'fruit'};  // Declaring strings in an array.
    
        // System.out.println(Arrays.toString(intArray2));  // Printing reveals indexs of said arrays.
        
        intArray2[0] = 10;                                  // Sets index 0 of array2 to 10. 
        intArray2[1] = 8;
        intArray2[2] = 19;
        intArray2[3] = 2;                                   // index 3 to = 2.   
    }

    /* calling out the print function below will yield the respective arrays.
    printArray(intArray2); // Builds array2
    printArray(intArray3); // Builds array3 
    */

    //System.out.println(intArray2[3]);                     // Retrieves a specific index from that array (in this case, index 3 holds 2 as stated above).

    //Arrays.sort(intArray3);                               // Array can sort to some different set up. I.e. abc, 123, some sort of sorting function.

    
    // SPECIAL FOR LOOP: forEach
    /*
    printArray(shoppingList);

    System.out.println("Special For Loop: ");
    
    for (String s : shoppingList) {                         // This would take the list and print it out in full.
        System.out.println(s);
    }
    */


    // Math.abs(rand.nextInt) % 5                           // This hints at pulling out a random object from the array (assuming an array with the length of 5).


}
