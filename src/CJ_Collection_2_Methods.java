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
        // add() - Adds an element to the set (overrides Collection's add to ensure uniqueness)
        // remove() - Removes a specified element from the set (overrides Collection's remove)
        // contains() - Returns true if the set contains a specified element (overrides Collection's
        // isEmpty() - Returns true if the set is empty (overrides Collection's isEmpty)
        // size() - Returns the number of elements in the set (overrides Collection's size)
        // iterator() - Returns an iterator to traverse the elements of the set (overrides Collection's iterator)
        Set<String> fruits = new HashSet<>();
       
        // HashSet Methods - Overview (not in Collection and Set methods)
        // addAll() - Adds all elements from a specified collection to the set
        // retainAll() - Retains only the elements in the set that are contained in a specified collection
        // removeAll() - Removes from the set all elements that are contained in a specified collection
        // clear() - Removes all elements from the set
        // toArray() - Converts the set to an array
        //hashCode() - Returns the hash code value for the set
        //equals() - Compares the specified object with the set for equality
        Set<String> fruitsSet = new HashSet<>();

        //TreeSet Methods - Overview (not in Collection and Set Methods)

        //Map Methods - Overview
        // put() - Adds a key-value pair to the map
        // putAll() - Adds all the key-value pairs from a specified map to the map
        // get() - Returns the value associated with a specified key
        // remove() - Removes the key-value pair associated with a specified key
        // containsKey() - Returns true if the map contains a specified key
        // containsValue() - Returns true if the map contains a specified value
        // keySet() - Returns a set of all the keys in the map
        // values() - Returns a collection of all the values in the map
        // entrySet() - Returns a set of all the key-value pairs in the map
        // isEmpty() - Returns true if the map is empty
        // size() - Returns the number of key-value pairs in the map
        // clear() - Removes all the key-value pairs from the map
        Map<String, Integer> fruitsMap = new HashMap<>();

        //HashMap Methods - Overview (not in Collection and Map Methods)
        // putIfAbsent() - Adds a key-value pair to the map if the key is not already present
        // replace() - Updates the value associated with a specified key
        // getOrDefault() - Returns the value associated with a specified key, or a default value if the key is not present
        // forEach() - Performs the given action for each entry in the map
        // compute() - Computes a new value for a specified key using the given function
        // computeIfAbsent() - Computes a value for a specified key if the key is not already present
        // computeIfPresent() - Computes a new value for a specified key if the key is already present
        // merge() - Merges the specified value with the existing value for a specified key using the given function
        //hashCode() - Returns the hash code value for the map
        //equals() - Compares the specified object with the map for equality
        Map<String, Integer> fruitsHashMap = new HashMap<>();

        //Queue Methods - Overview (In addition to Collection methods)
        // offer() - Adds an element to the end of the queue
        // poll() - Removes and returns the head of the queue
        // peek() - Returns the head of the queue without removing it
        Queue<String> fruitsQueue = new LinkedList<>();

        //Deque Methods - Overview (In addition to Collection and Queue methods)
        // addFirst() - Adds an element at the front of the deque
        // addLast() - Adds an element at the end of the deque
        // removeFirst() - Removes and returns the first element of the deque
        // removeLast() - Removes and returns the last element of the deque
        // peekFirst() - Returns the first element of the deque without removing it
        // peekLast() - Returns the last element of the deque without removing it
        Deque<String> fruitsDeque = new LinkedList<>();

        //ArrayDeque Methods - Overview (In addition to Collection and Deque methods)
        // offerFirst() - Adds an element at the front of the deque
        // offerLast() - Adds an element at the end of the deque
        // pollFirst() - Removes and returns the first element of the deque
        // pollLast() - Removes and returns the last element of the deque
        // peekFirst() - Returns the first element of the deque without removing it
        // peekLast() - Returns the last element of the deque without removing it
        ArrayDeque<String> fruitsArrayDeque = new ArrayDeque<>();
    }
}
