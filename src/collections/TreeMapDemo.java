package collections;


import java.util.*;
import java.util.concurrent.*;
  
public class TreeMapDemo {
  
    // Declaring a TreeMap
    static TreeMap<Integer, String> tree_map;
  
    // Function to create TreeMap
    static void create()
    {
        // Creating an empty TreeMap
        tree_map= new TreeMap<Integer, String>();
  
        System.out.println("TreeMap  created");
    }
  
    // Function to Insert values in
    // the TreeMap
    static void insert()
    {
        // Mapping string values to int keys
        tree_map.put(20, "Systems");
        tree_map.put(25, "Welcomes");
        tree_map.put(10, "Alpha");
        tree_map.put(30, "You");
  
        System.out.println("Elements successfully"+ " inserted in the TreeMap");
    }
  
    // Function to search a key in TreeMap
    static void searchKey(int key)
    {
  
        // Checking for the key
        System.out.println("Is key \""+ key + "\" present? "+ tree_map.containsKey(key));
    }
  
    // Function to search a value in TreeMap
    static void search(String value)
    {
  
        // Checking for the value
        System.out.println(
            "\nIs value \""
            + value + "\" present? "
            + tree_map.containsValue(value));
    }
  
    // Function to display the elements in TreeMap
    static void display()
    {
        // Displaying the TreeMap
        System.out.println("\nDisplaying the TreeMap:");
  
        System.out.println("TreeMap: " + tree_map);
    }
  
    // Function to traverse TreeMap
    static void traverse()
    {
        System.out.println("\nTraversing the TreeMap:");
        for (Map.Entry<Integer, String> e : tree_map.entrySet())
            System.out.println(e.getKey()
                               + " "
                               + e.getValue());
    }
  
    // Driver code
    public static void main(String[] args)
    {
  
        // Creating the TreeMap
        create();
  
        // Inserting values in the TreeMap
        insert();
  
        // Search key "50" in the TreeMap
        searchKey(50);
  
        // Search value "Alpha" in the TreeMap
        search("Alpha");
  
        // Display the elements in TreeMap
        display();
  
        // Traverse the TreeMap
        traverse();
    }
}
