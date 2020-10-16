import java.util.HashMap;
import java.util.Map;

// package Java Examples;

public class DictionaryPractice {
 
    public static void main(String[] args) {
        //English to Spanish Dictionary
        Map<String,String> englSpanDictionary = new HashMap<String,String>();   // String to String entries for this dictionary.
        // Adding to the dictionary
        englSpanDictionary.put("Monday","Lunes");                               // A to B = ("A","B")
        englSpanDictionary.put("Tuesday","Martes");
        englSpanDictionary.put("Wednesday","Miercoles");
        englSpanDictionary.put("Thursday","Jueves");
        englSpanDictionary.put("Friday","Viernes");
        englSpanDictionary.put("Saturday","Sabado");
        englSpanDictionary.put("Sunday","Domingo");
        // Retrieving from the dictionary
        System.out.println(englSpanDictionary.get("Monday"));
        System.out.println(englSpanDictionary.get("Tuesday"));
        System.out.println(englSpanDictionary.get("Wednesday"));
        System.out.println(englSpanDictionary.get("Thursday"));
        System.out.println(englSpanDictionary.get("Friday"));
        System.out.println(englSpanDictionary.get("Saturday"));
        System.out.println(englSpanDictionary.get("Sunday"));
        // Prints out all of the keys
        System.out.println(englSpanDictionary.keySet());
        // Prints out all of the values
        System.out.println(englSpanDictionary.values());
        // Print out size w/ prompt
        System.out.println("The dictionary size is " + englSpanDictionary.size());

        // When this program is run, the bottom 3 just give us lines of space.
        System.out.println();
        System.out.println();
        System.out.println();


        // Shopping List
        Map<String,Boolean> shoppingList = new Hashmap<String,Boolean>();       // To make a list that says "Do I need this, yes or no"
        // Add to the list
        shoppingList.put("Tofo", true);
        shoppingList.put("Snacks", Boolean.TRUE);
        shoppingList.put("Bread", Boolean.TRUE);
        shoppingList.put("Sour Cream", Boolean.FALSE);
        shoppingList.put("Sugar", false);
        // Retrieve items
        System.out.println(shoppingList.get("Tofo"));
        System.out.println(shoppingList.get("Bread"));
        System.out.println(shoppingList.get("Sugar"));
        // Key-Value Pairs 
        System.out.println(shoppingList.toString());
        // Remove items
        shoppingList.remove("Sour Cream");                                      // Removes this item
        // Replace items
        shoppingList.replace("Bread", Boolean.FALSE);                           // This will change Bread's value to False.
        
        // Clear List
        shoppingList.clear();
        System.out.println(shoppingList.toString());                            // toString prints out Key-value pairs declared above.
        // Is the list empty (F = No / T = Yes)
        System.out.println(shoppingList.isEmpty());
    }



}
