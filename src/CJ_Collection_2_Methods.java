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
        System.out.println("Is Collection empty? " + fruitsCollection.isEmpty());
        fruitsCollection.clear();
        System.out.println("After clearing Collection: " + fruitsCollection);
        Collections.addAll(fruitsCollection, "Apple", "Orange", "Banana");
        System.out.println("Collection contains Apple: " + fruitsCollection.contains("Apple")); 
    
        Collection<String> anotherCollection = new ArrayList<>();
        Collections.addAll(anotherCollection, "Apple", "Banana");
        System.out.println("fruitsCollection contains all elements of anotherCollection: " + fruitsCollection.containsAll(anotherCollection));

        fruitsCollection.addAll(anotherCollection);
        System.out.println("After adding all from anotherCollection: " + fruitsCollection);

        //iterator
        Iterator<String> it = fruitsCollection.iterator();
        System.out.print("Iterating over collection: ");
        while(it.hasNext()){
            System.out.print(it.next() + " ");
        }
        System.out.println();

        fruitsCollection.removeAll(anotherCollection);
        System.out.println("After removing all from anotherCollection: " + fruitsCollection);

        fruitsCollection.retainAll(anotherCollection);
        System.out.println("After retaining all from anotherCollection: " + fruitsCollection);

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
        System.out.println("After adding Grapes at index 0: " + fruitsList);
        fruitsList.set(1, "Pineapple"); // Update element at specific index
        System.out.println("After setting Pineapple at index 1: " + fruitsList);
        System.out.println("Index of Banana: " + fruitsList.indexOf("Banana"));
        System.out.println("Last Index of Apple: " + fruitsList.lastIndexOf("Apple"));
        System.out.println("Element at index 1: " + fruitsList.get(1));

        //ArrayList Methods - Overview(In addition to Collection and List)
        // ensureCapacity() - Increases the capacity of the ArrayList to a specified minimum capacity
        // trimToSize() - Trims the capacity of the ArrayList to the current size
        //
        ArrayList<String> fruitsArrayList = new ArrayList<>();
        Collections.addAll(fruitsArrayList, "Apple", "Orange", "Banana");
        System.out.println("ArrayList:- fruitsArrayList - " + fruitsArrayList);
        fruitsArrayList.ensureCapacity(10);
        System.out.println("After ensuring capacity of 10 - " + fruitsArrayList);
        fruitsArrayList.trimToSize();
        System.out.println("After trimming to size - " + fruitsArrayList);

        //LinkList Methods - Overview (In addition to Collection and List)
        // addFirst() - Adds an element at the beginning of the LinkedList
        // addLast() - Adds an element at the end of the LinkedList
        // getFirst() - Returns the first element of the LinkedList
        // getLast() - Returns the last element of the LinkedList
        // removeFirst() - Removes the first element of the LinkedList
        // removeLast() - Removes the last element of the LinkedList
        // offer() - Adds an element to the end of the LinkedList (as a queue)
        // poll() - Removes and returns the first element of the LinkedList (as a queue)
        // push() - Adds an element at the top of the LinkedList (as a stack)
        // pop() - Removes and returns the top element of the LinkedList (as a stack

        //Set Methods - Overview (In addition to Collection methods)
       
        // HashSet Methods - Overview (not in Collection and Set methods)
    }
}
