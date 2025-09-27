import java.util.*;

public class CJ_Collection_2_Methods {
    public static void main(String[] args) {

        // Collection Methods - Overview 
        // add() - Adds an element to the collection
        // addAll() - Adds all the elements of a collection to another collection
        // clear() - Removes all the elements from the collection
        // contains() - Returns true if the collection contains a specified element
        // containsAll() - Returns true if the collection contains all the elements of a specified collection
        // isEmpty() - Returns true if the collection is empty
        // iterator() - Returns an iterator to traverse the elements of the collection
        // remove() - Removes a specified element from the collection
        // removeAll() - Removes all the elements of a specified collection from the collection
        // retainAll() - Retains only the elements in the collection that are contained in a specified collection
        // size() - Returns the number of elements in the collection
        // toArray() - Converts the collection to an array 

        Collection<String> fruitsCollection = new ArrayList<>();
        fruitsCollection.add("Mango");
        Collections.addAll(fruitsCollection, "Apple", "Orange", "Banana");
        System.out.println("fruitsCollection - " + fruitsCollection);
        fruitsCollection.remove("Orange");
        System.out.println("After removing Orange - " + fruitsCollection);
        System.out.println("Collection contains Apple: " + fruitsCollection.contains("Apple"));
        System.out.println("Size of Collection: " + fruitsCollection.size());

        Object[] fruitsArray = fruitsCollection.toArray();
        System.out.println("Array from Collection: " + Arrays.toString(fruitsArray));

        //List Methods - Overview (In addition to Collection methods)
        // get() - Returns the element at a specified index
        // set() - Updates the element at a specified index
        // add(index, element) - Adds an element at a specified index
        // indexOf() - Returns the index of the first occurrence of a specified element
        // lastIndexOf() - Returns the index of the last occurrence of a specified element
        // listIterator() - Returns a list iterator to traverse the elements of the list
        // subList() - Returns a view of a portion of the list between specified indices
        List<String> fruitsList = new ArrayList<>();
        Collections.addAll(fruitsList, "Apple", "Orange", "Banana");
        System.out.println("Collection:- fruitsList - " + fruitsList);
        fruitsList.add(0, "Grapes"); // Add element at specific index
    }
}
