package week5;

import java.lang.reflect.Array;
import java.util.*;

public class ArraylistClass {
    public static void main(String[] args) {
        // Declare the ArrayList as below.
        // The important side is right side.
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<Integer>(); // We must use Wrapper class in such case. Or String. But! We can not use primitive data type.

        List<String> list3 = new ArrayList<>();
        // ArrayList<String> list4 = new List<>(); ---> Doesn't compile.
        List<String> list5 = new ArrayList<>();

        System.out.println(list5);

        // birds.add("Hawk"); ---> adding the element to ArrayList
        ArrayList<String> birds = new ArrayList<>();
        birds.add("Hawk"); // Index number 0.
        System.out.println(birds);
        birds.add("Test"); // Index number 1.
        birds.add(1, "Robin"); // In such case the room for the Robin will be opened. And Test will be moved to the next place: 2.
        birds.add(0, "Blue jay");
        birds.add("Cardinal"); // .add method is adding to the end of the Array List.
        System.out.println(birds);

        // birds.addAll("White", "Green"); // How to write a lot of meanings in just one line of code using method .add?

        // birds.remove() ---> Remove the element from ArrayList
        // remove() method is boolean type that's why if there's no such element in the ArrayList it's going to return false.
        // If there's such an element the remove method can remove and return true. Pay attention to this aspect.
        System.out.println(birds.remove("Fox")); //--> returns false
        System.out.println(birds.remove("Robin")); //--> returns true
        System.out.println("After removing the \"Robin\" element: " + birds);

        System.out.println("Removed the " + birds.remove(2) + " from the birds ArrayList which has index number 2.");

        System.out.println(birds.remove(1)); // --> in we put 10, 15 or bigger Numbers in remove method we will get an error (IndexOutOfBoundsException).

        // size and set methods as below
        System.out.println(birds.size());
        birds.set(1, "Welcome to Java");
        System.out.println(birds.get(0));

        // contains() method
        System.out.println(birds.size());
        System.out.println(birds.contains("The Birth"));
        System.out.println(birds.contains("Welcome to Java"));

        ArrayList<String> arrList = new ArrayList<>();
        arrList.add("Y");
        arrList.add("A");
        arrList.add("H"); //---> [M, O, z]
        Collections.sort(arrList); // Sorting the arrList. This method does not have return type. It's void method.
        System.out.println(arrList);

        // equals method
        ArrayList<String> arrList2 = new ArrayList<>();
        arrList.add("a");
        arrList2.add("b");
        arrList.add("c");
        arrList2.add("c");
        System.out.println("The original arrayList(arrList): " + arrList);
        System.out.println("The original arrayList(arrList2): " + arrList2);
        System.out.println(arrList.equals(arrList2)); // .equals is a boolean type method.
        arrList2.set(0, "a");
        arrList2.add(0, "Y");
        arrList2.add(0, "H");
        arrList2.add(0, "A");
        System.out.println("The updated original arrayList(arrList): " + arrList);
        System.out.println("The updated original arrayList(arrList2): " + arrList2);
        System.out.println(arrList.equals(arrList2));

        // clear() method provides an easy way to discard all elements of the ArrayList.
        arrList.clear();
        System.out.println(arrList.isEmpty()); // .isEmpty is a boolean type method.
        System.out.println(arrList.size());

        // How to convert an ArrayList to an Array?

        String arr[] = arrList2.toArray(new String[0]);
        System.out.println("arr array's length: " + arr.length);
        System.out.println("arr array's elements" + Arrays.toString(arr));

        String newArr[] = {"Vitalii", "Mustafa", "Ramazan", "Ali"}; // Created an array.
        List<String> newList = Arrays.asList(newArr); // Convert array to ArrayList.
        System.out.println(newList);
        System.out.println("newList ArrayList size is: " + newList.size());

        newList.set(3, "Alex");
        System.out.println(newArr[3]); // Instead of Ali comes Alex.

// Note: If you update the elements through Array methods or List methods, both array elements
//  and list elements  will be aﬀected.
//  Because they point to the same data store.
//  list.remove(1);



    }
}
