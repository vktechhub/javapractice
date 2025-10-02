import java.util.*;

public class CJ_Collection_2_Common_Methods {
    public static void main(String[] args) {

        // Collection Methods - Overview 
        // 1. add() - Adds an element to the collection
        // 2. addAll() - Adds all the elements of a collection to another collection
        // 3. contains() - Returns true if the collection contains a specified element
        // 4. remove() - Removes a specified element from the collection
        // 5. removeIf() - Removes all elements that match a given condition (Java 8 and above)
        // 6. size() - Returns the number of elements in the collection
        // 7. isEmpty() - Returns true if the collection is empty
        // 8. clear() - Removes all the elements from the collection
        // 9. iterator() - Returns an iterator to traverse the elements of the collection
        // 10. toArray() - Converts the collection to an array
        // Operations with another Collection
        // 11. addAll(Collection c) - Adds all elements from the specified collection to this collection
        // 12. containsAll() - Returns true if the collection contains all the elements of a specified collection
        // 13. retainAll() - Retains only the elements in the collection that are contained in a specified collection
        // 14. removeAll() - Removes all the elements of a specified collection from the collection

        System.out.println("--------------------------------------------------");
        // Collection Methods - In common for List, Set, Queue
        System.out.println("Collections - Common Methods Overview:");
        System.out.println("--------------------------------------------------");
        Collection<String> fruitsCollection = new ArrayList<>();
        fruitsCollection.add("Mango");  // add() - Add element
        System.out.println("fruitsCollection - " + fruitsCollection);
        Collections.addAll(fruitsCollection, "Apple", "Orange", "Banana", "Mango", "Apple", "Banana", "Grapes", "Pineapple" , "Kiwi", "Guava");  // addAll() - Add multiple elements
        System.out.println("fruitsCollection - " + fruitsCollection);   // duplicate check
        System.out.println("Collection contains Apple: " + fruitsCollection.contains("Apple")); // contains() - Check if element exists
        fruitsCollection.remove("Orange"); // remove() - Remove element
        System.out.println("After removing Orange - " + fruitsCollection);

        fruitsCollection.removeIf(fruit -> fruit.startsWith("A")); // removeIf() - Remove elements - condition starts with
        System.out.println("After removing all elements starting with 'A': " + fruitsCollection);

        fruitsCollection.removeIf(fruit -> fruit.endsWith("e")); // removeIf() - Remove elements - condition ends with
        System.out.println("After removing all elements ending with 'e': " + fruitsCollection);

        fruitsCollection.removeIf(fruit -> fruit.length() < 5); // removeIf() - Remove elements - condition length comparison
        System.out.println("After removing all elements with length < 5: " + fruitsCollection);

        fruitsCollection.removeIf(fruit -> fruit.contains("n")); // removeIf() - Remove elements - condition contains specific substring
        System.out.println("After removing all elements containing 'n': " + fruitsCollection);

        System.out.println("Size of Collection: " + fruitsCollection.size());   // size() - Get number of elements
        System.out.println("Is Collection empty? " + fruitsCollection.isEmpty()); // isEmpty() - Check if collection is empty
        fruitsCollection.clear(); // clear() - Clear all elements
        System.out.println("After clearing Collection: " + fruitsCollection);
        System.out.println("Is Collection empty? " + fruitsCollection.isEmpty()); 
        Collections.addAll(fruitsCollection, "Apple", "Orange", "Banana", "Mango");
        System.out.println("After adding again - " + fruitsCollection);

        //iterator
        Iterator<String> it_Collection = fruitsCollection.iterator(); // iterator() - Get iterator
        System.out.print("Iterating over collection: ");
        while(it_Collection.hasNext()){
            System.out.print(it_Collection.next() + " ");
        }
        System.out.println();

        Object[] fruitsArray_of_Collection = fruitsCollection.toArray(); // toArray() - Convert to array
        System.out.println("Array from Collection: " + Arrays.toString(fruitsArray_of_Collection));

        Collection<String> anotherCollection = new ArrayList<>();
        Collections.addAll(anotherCollection, "Apple", "Banana", "Grapes", "Pineapple" , "Kiwi", "Guava");
        System.out.println("anotherCollection - " + anotherCollection);
        System.out.println("fruitsCollection contains all elements of anotherCollection: " + fruitsCollection.containsAll(anotherCollection)); // containsAll() - Check if all elements exist

        fruitsCollection.addAll(anotherCollection); // addAll() - Add all elements from another collection
        System.out.println("After adding all from anotherCollection: " + fruitsCollection);
        System.out.println("fruitsCollection contains all elements of anotherCollection: " + fruitsCollection.containsAll(anotherCollection)); // containsAll() - Check if all elements exist

        fruitsCollection.removeAll(anotherCollection); // removeAll() - Remove all elements
        System.out.println("After removing all elements: " + fruitsCollection);
        System.out.println("Is Collection empty? " + fruitsCollection.isEmpty()); // isEmpty() - Check if collection is empty

        fruitsCollection.addAll(anotherCollection);
        System.out.println("After adding again - " + fruitsCollection);

        fruitsCollection.retainAll(anotherCollection); // retainAll() - Retain only elements in another collection
        System.out.println("After only retaining all from anotherCollection: " + fruitsCollection);

        System.out.println("--------------------------------------------------");      
        // List Methods - In common to Collection Methods
        System.out.println("List - Common Methods Overview:");
        System.out.println("--------------------------------------------------");
        List<String> fruitsList = new ArrayList<>();
        fruitsList.add("Mango");  // add() - Add element
        System.out.println("fruitsList - " + fruitsList);
        Collections.addAll(fruitsList, "Apple", "Orange", "Banana", "Mango", "Apple", "Banana", "Grapes", "Pineapple" , "Kiwi", "Guava");  // addAll() - Add multiple elements
        System.out.println("fruitsList - " + fruitsList);   // duplicate check
        System.out.println("List contains Apple: " + fruitsList.contains("Apple")); // contains() - Check if element exists
        fruitsList.remove("Orange"); // remove() - Remove element
        System.out.println("After removing Orange - " + fruitsList);

        fruitsList.removeIf(fruit -> fruit.startsWith("A")); // removeIf() - Remove elements - condition starts with
        System.out.println("After removing all elements starting with 'A': " + fruitsList);

        fruitsList.removeIf(fruit -> fruit.endsWith("e")); // removeIf() - Remove elements - condition ends with
        System.out.println("After removing all elements ending with 'e': " + fruitsList);

        fruitsList.removeIf(fruit -> fruit.length() < 5); // removeIf() - Remove elements - condition length comparison
        System.out.println("After removing all elements with length < 5: " + fruitsList);

        fruitsList.removeIf(fruit -> fruit.contains("n")); // removeIf() - Remove elements - condition contains specific substring
        System.out.println("After removing all elements containing 'n': " + fruitsList);

        System.out.println("Size of List: " + fruitsList.size());   // size() - Get number of elements
        System.out.println("Is List empty? " + fruitsList.isEmpty()); // isEmpty() - Check if List is empty
        fruitsList.clear(); // clear() - Clear all elements
        System.out.println("After clearing List: " + fruitsList);
        System.out.println("Is List empty? " + fruitsList.isEmpty()); 
        Collections.addAll(fruitsList, "Apple", "Orange", "Banana", "Mango");
        System.out.println("After adding again - " + fruitsList);

        //iterator
        Iterator<String> it_List = fruitsList.iterator(); // iterator() - Get iterator
        System.out.print("Iterating over List: ");
        while(it_List.hasNext()){
            System.out.print(it_List.next() + " ");
        }
        System.out.println();

        Object[] fruitsArray_of_List = fruitsList.toArray(); // toArray() - Convert to array
        System.out.println("Array from List: " + Arrays.toString(fruitsArray_of_List));

        List<String> anotherList = new ArrayList<>();
        Collections.addAll(anotherList, "Apple", "Banana", "Grapes", "Pineapple" , "Kiwi", "Guava");
        System.out.println("anotherList - " + anotherList);
        System.out.println("fruitsList contains all elements of anotherList: " + fruitsList.containsAll(anotherList)); // containsAll() - Check if all elements exist

        fruitsList.addAll(anotherList); // addAll() - Add all elements from another List
        System.out.println("After adding all from anotherList: " + fruitsList);
        System.out.println("fruitsList contains all elements of anotherList: " + fruitsList.containsAll(anotherList)); // containsAll() - Check if all elements exist

        fruitsList.removeAll(anotherList); // removeAll() - Remove all elements
        System.out.println("After removing all elements: " + fruitsList);
        System.out.println("Is List empty? " + fruitsList.isEmpty()); // isEmpty() - Check if List is empty

        fruitsList.addAll(anotherList);
        System.out.println("After adding again - " + fruitsList);

        fruitsList.retainAll(anotherList); // retainAll() - Retain only elements in another List
        System.out.println("After only retaining all from anotherList: " + fruitsList);

        System.out.println("--------------------------------------------------");
        // ArrayList Methods - In common to Collection Methods
        System.out.println("ArrayList - Common Methods Overview:");
        System.out.println("--------------------------------------------------");
        ArrayList<String> fruitsArrayList = new ArrayList<>();
        fruitsArrayList.add("Mango");  // add() - Add element
        System.out.println("fruitsArrayList - " + fruitsArrayList);
        Collections.addAll(fruitsArrayList, "Apple", "Orange", "Banana", "Mango", "Apple", "Banana", "Grapes", "Pineapple" , "Kiwi", "Guava");  // addAll() - Add multiple elements
        System.out.println("fruitsArrayList - " + fruitsArrayList);   // duplicate check
        System.out.println("ArrayList contains Apple: " + fruitsArrayList.contains("Apple")); // contains() - Check if element exists
        fruitsArrayList.remove("Orange"); // remove() - Remove element
        System.out.println("After removing Orange - " + fruitsArrayList);

        fruitsArrayList.removeIf(fruit -> fruit.startsWith("A")); // removeIf() - Remove elements - condition starts with
        System.out.println("After removing all elements starting with 'A': " + fruitsArrayList);

        fruitsArrayList.removeIf(fruit -> fruit.endsWith("e")); // removeIf() - Remove elements - condition ends with
        System.out.println("After removing all elements ending with 'e': " + fruitsArrayList);

        fruitsArrayList.removeIf(fruit -> fruit.length() < 5); // removeIf() - Remove elements - condition length comparison
        System.out.println("After removing all elements with length < 5: " + fruitsArrayList);

        fruitsArrayList.removeIf(fruit -> fruit.contains("n")); // removeIf() - Remove elements - condition contains specific substring
        System.out.println("After removing all elements containing 'n': " + fruitsArrayList);

        System.out.println("Size of ArrayList: " + fruitsArrayList.size());   // size() - Get number of elements
        System.out.println("Is ArrayList empty? " + fruitsArrayList.isEmpty()); // isEmpty() - Check if ArrayList is empty
        fruitsArrayList.clear(); // clear() - Clear all elements
        System.out.println("After clearing ArrayList: " + fruitsArrayList);
        System.out.println("Is ArrayList empty? " + fruitsArrayList.isEmpty()); 
        Collections.addAll(fruitsArrayList, "Apple", "Orange", "Banana", "Mango");
        System.out.println("After adding again - " + fruitsArrayList);

        //iterator
        Iterator<String> it_ArrayList = fruitsArrayList.iterator(); // iterator() - Get iterator
        System.out.print("Iterating over ArrayList: ");
        while(it_ArrayList.hasNext()){
            System.out.print(it_ArrayList.next() + " ");
        }
        System.out.println();

        Object[] fruitsArray_of_ArrayList = fruitsArrayList.toArray(); // toArray() - Convert to array
        System.out.println("Array from ArrayList: " + Arrays.toString(fruitsArray_of_ArrayList));

        ArrayList<String> anotherArrayList = new ArrayList<>();
        Collections.addAll(anotherArrayList, "Apple", "Banana", "Grapes", "Pineapple" , "Kiwi", "Guava");
        System.out.println("anotherArrayList - " + anotherArrayList);
        System.out.println("fruitsArrayList contains all elements of anotherArrayList: " + fruitsArrayList.containsAll(anotherArrayList)); // containsAll() - Check if all elements exist

        fruitsArrayList.addAll(anotherArrayList); // addAll() - Add all elements from another ArrayList
        System.out.println("After adding all from anotherArrayList: " + fruitsArrayList);
        System.out.println("fruitsArrayList contains all elements of anotherArrayList: " + fruitsArrayList.containsAll(anotherArrayList)); // containsAll() - Check if all elements exist

        fruitsArrayList.removeAll(anotherArrayList); // removeAll() - Remove all elements
        System.out.println("After removing all elements: " + fruitsArrayList);
        System.out.println("Is ArrayList empty? " + fruitsArrayList.isEmpty()); // isEmpty() - Check if ArrayList is empty

        fruitsArrayList.addAll(anotherArrayList);
        System.out.println("After adding again - " + fruitsArrayList);

        fruitsArrayList.retainAll(anotherArrayList); // retainAll() - Retain only elements in another ArrayList
        System.out.println("After only retaining all from anotherArrayList: " + fruitsArrayList);

        System.out.println("--------------------------------------------------");   
        // LinkedList Methods - In common to Collection Methods
        System.out.println("LinkedList - Common Methods Overview:");
        System.out.println("--------------------------------------------------");
        LinkedList<String> fruitsLinkedList = new LinkedList<>();
        fruitsLinkedList.add("Mango");  // add() - Add element
        System.out.println("fruitsLinkedList - " + fruitsLinkedList);
        Collections.addAll(fruitsLinkedList, "Apple", "Orange", "Banana", "Mango", "Apple", "Banana", "Grapes", "Pineapple" , "Kiwi", "Guava");  // addAll() - Add multiple elements
        System.out.println("fruitsLinkedList - " + fruitsLinkedList);   // duplicate check
        System.out.println("LinkedList contains Apple: " + fruitsLinkedList.contains("Apple")); // contains() - Check if element exists
        fruitsLinkedList.remove("Orange"); // remove() - Remove element
        System.out.println("After removing Orange - " + fruitsLinkedList);

        fruitsLinkedList.removeIf(fruit -> fruit.startsWith("A")); // removeIf() - Remove elements - condition starts with
        System.out.println("After removing all elements starting with 'A': " + fruitsLinkedList);

        fruitsLinkedList.removeIf(fruit -> fruit.endsWith("e")); // removeIf() - Remove elements - condition ends with
        System.out.println("After removing all elements ending with 'e': " + fruitsLinkedList);

        fruitsLinkedList.removeIf(fruit -> fruit.length() < 5); // removeIf() - Remove elements - condition length comparison
        System.out.println("After removing all elements with length < 5: " + fruitsLinkedList);

        fruitsLinkedList.removeIf(fruit -> fruit.contains("n")); // removeIf() - Remove elements - condition contains specific substring
        System.out.println("After removing all elements containing 'n': " + fruitsLinkedList);

        System.out.println("Size of LinkedList: " + fruitsLinkedList.size());   // size() - Get number of elements
        System.out.println("Is LinkedList empty? " + fruitsLinkedList.isEmpty()); // isEmpty() - Check if LinkedList is empty
        fruitsLinkedList.clear(); // clear() - Clear all elements
        System.out.println("After clearing LinkedList: " + fruitsLinkedList);
        System.out.println("Is LinkedList empty? " + fruitsLinkedList.isEmpty()); 
        Collections.addAll(fruitsLinkedList, "Apple", "Orange", "Banana", "Mango");
        System.out.println("After adding again - " + fruitsLinkedList);

        //iterator
        Iterator<String> it_LinkedList = fruitsLinkedList.iterator(); // iterator() - Get iterator
        System.out.print("Iterating over LinkedList: ");
        while(it_LinkedList.hasNext()){
            System.out.print(it_LinkedList.next() + " ");
        }
        System.out.println();

        Object[] fruitsArray_of_LinkedList = fruitsLinkedList.toArray(); // toArray() - Convert to array
        System.out.println("Array from LinkedList: " + Arrays.toString(fruitsArray_of_LinkedList));

        LinkedList<String> anotherLinkedList = new LinkedList<>();
        Collections.addAll(anotherLinkedList, "Apple", "Banana", "Grapes", "Pineapple" , "Kiwi", "Guava");
        System.out.println("anotherLinkedList - " + anotherLinkedList);
        System.out.println("fruitsLinkedList contains all elements of anotherLinkedList: " + fruitsLinkedList.containsAll(anotherLinkedList)); // containsAll() - Check if all elements exist

        fruitsLinkedList.addAll(anotherLinkedList); // addAll() - Add all elements from another LinkedList
        System.out.println("After adding all from anotherLinkedList: " + fruitsLinkedList);
        System.out.println("fruitsLinkedList contains all elements of anotherLinkedList: " + fruitsLinkedList.containsAll(anotherLinkedList)); // containsAll() - Check if all elements exist

        fruitsLinkedList.removeAll(anotherLinkedList); // removeAll() - Remove all elements
        System.out.println("After removing all elements: " + fruitsLinkedList);
        System.out.println("Is LinkedList empty? " + fruitsLinkedList.isEmpty()); // isEmpty() - Check if LinkedList is empty

        fruitsLinkedList.addAll(anotherLinkedList);
        System.out.println("After adding again - " + fruitsLinkedList);

        fruitsLinkedList.retainAll(anotherLinkedList); // retainAll() - Retain only elements in another LinkedList
        System.out.println("After only retaining all from anotherLinkedList: " + fruitsLinkedList);

        System.out.println("--------------------------------------------------"); 
        // Set Methods - In common to Collection Methods
        System.out.println("Set - Common Methods Overview:");
        System.out.println("--------------------------------------------------");
        Set<String> fruitsSet = new HashSet<>();
        fruitsSet.add("Mango");  // add() - Add element
        System.out.println("fruitsSet - " + fruitsSet);
        Collections.addAll(fruitsSet, "Apple", "Orange", "Banana", "Mango", "Apple", "Banana", "Grapes", "Pineapple" , "Kiwi", "Guava");  // addAll() - Add multiple elements
        System.out.println("fruitsSet - " + fruitsSet);   // duplicate check
        System.out.println("Set contains Apple: " + fruitsSet.contains("Apple")); // contains() - Check if element exists
        fruitsSet.remove("Orange"); // remove() - Remove element
        System.out.println("After removing Orange - " + fruitsSet);

        fruitsSet.removeIf(fruit -> fruit.startsWith("A")); // removeIf() - Remove elements - condition starts with
        System.out.println("After removing all elements starting with 'A': " + fruitsSet);

        fruitsSet.removeIf(fruit -> fruit.endsWith("e")); // removeIf() - Remove elements - condition ends with
        System.out.println("After removing all elements ending with 'e': " + fruitsSet);

        fruitsSet.removeIf(fruit -> fruit.length() < 5); // removeIf() - Remove elements - condition length comparison
        System.out.println("After removing all elements with length < 5: " + fruitsSet);

        fruitsSet.removeIf(fruit -> fruit.contains("n")); // removeIf() - Remove elements - condition contains specific substring
        System.out.println("After removing all elements containing 'n': " + fruitsSet);

        System.out.println("Size of Set: " + fruitsSet.size());   // size() - Get number of elements
        System.out.println("Is Set empty? " + fruitsSet.isEmpty()); // isEmpty() - Check if Set is empty
        fruitsSet.clear(); // clear() - Clear all elements
        System.out.println("After clearing Set: " + fruitsSet);
        System.out.println("Is Set empty? " + fruitsSet.isEmpty()); 
        Collections.addAll(fruitsSet, "Apple", "Orange", "Banana", "Mango");
        System.out.println("After adding again - " + fruitsSet);

        //iterator
        Iterator<String> it_Set = fruitsSet.iterator(); // iterator() - Get iterator
        System.out.print("Iterating over Set: ");
        while(it_Set.hasNext()){
            System.out.print(it_Set.next() + " ");
        }
        System.out.println();

        Object[] fruitsArray_of_Set = fruitsSet.toArray(); // toArray() - Convert to array
        System.out.println("Array from Set: " + Arrays.toString(fruitsArray_of_Set));

        Set<String> anotherSet = new HashSet<>();
        Collections.addAll(anotherSet, "Apple", "Banana", "Grapes", "Pineapple" , "Kiwi", "Guava");
        System.out.println("anotherSet - " + anotherSet);
        System.out.println("fruitsSet contains all elements of anotherSet: " + fruitsSet.containsAll(anotherSet)); // containsAll() - Check if all elements exist

        fruitsSet.addAll(anotherSet); // addAll() - Add all elements from another Set
        System.out.println("After adding all from anotherSet: " + fruitsSet);
        System.out.println("fruitsSet contains all elements of anotherSet: " + fruitsSet.containsAll(anotherSet)); // containsAll() - Check if all elements exist

        fruitsSet.removeAll(anotherSet); // removeAll() - Remove all elements
        System.out.println("After removing all elements: " + fruitsSet);
        System.out.println("Is Set empty? " + fruitsSet.isEmpty()); // isEmpty() - Check if Set is empty

        fruitsSet.addAll(anotherSet);
        System.out.println("After adding again - " + fruitsSet);

        fruitsSet.retainAll(anotherSet); // retainAll() - Retain only elements in another Set
        System.out.println("After only retaining all from anotherSet: " + fruitsSet);

        System.out.println("--------------------------------------------------");
        // HashSet Methods - In common to Collection Methods
        System.out.println("HashSet - Common Methods Overview:");
        System.out.println("--------------------------------------------------");
        HashSet<String> fruitsHashSet = new HashSet<>();
        fruitsHashSet.add("Mango");  // add() - Add element
        System.out.println("fruitsHashSet - " + fruitsHashSet);
        Collections.addAll(fruitsHashSet, "Apple", "Orange", "Banana", "Mango", "Apple", "Banana", "Grapes", "Pineapple" , "Kiwi", "Guava");  // addAll() - Add multiple elements
        System.out.println("fruitsHashSet - " + fruitsHashSet);   // duplicate check
        System.out.println("HashSet contains Apple: " + fruitsHashSet.contains("Apple")); // contains() - Check if element exists
        fruitsHashSet.remove("Orange"); // remove() - Remove element
        System.out.println("After removing Orange - " + fruitsHashSet);

        fruitsHashSet.removeIf(fruit -> fruit.startsWith("A")); // removeIf() - Remove elements - condition starts with
        System.out.println("After removing all elements starting with 'A': " + fruitsHashSet);

        fruitsHashSet.removeIf(fruit -> fruit.endsWith("e")); // removeIf() - Remove elements - condition ends with
        System.out.println("After removing all elements ending with 'e': " + fruitsHashSet);

        fruitsHashSet.removeIf(fruit -> fruit.length() < 5); // removeIf() - Remove elements - condition length comparison
        System.out.println("After removing all elements with length < 5: " + fruitsHashSet);

        fruitsHashSet.removeIf(fruit -> fruit.contains("n")); // removeIf() - Remove elements - condition contains specific substring
        System.out.println("After removing all elements containing 'n': " + fruitsHashSet);

        System.out.println("Size of HashSet: " + fruitsHashSet.size());   // size() - Get number of elements
        System.out.println("Is HashSet empty? " + fruitsHashSet.isEmpty()); // isEmpty() - Check if HashSet is empty
        fruitsHashSet.clear(); // clear() - Clear all elements
        System.out.println("After clearing HashSet: " + fruitsHashSet);
        System.out.println("Is HashSet empty? " + fruitsHashSet.isEmpty()); 
        Collections.addAll(fruitsHashSet, "Apple", "Orange", "Banana", "Mango");
        System.out.println("After adding again - " + fruitsHashSet);

        //iterator
        Iterator<String> it_HashSet = fruitsHashSet.iterator(); // iterator() - Get iterator
        System.out.print("Iterating over HashSet: ");
        while(it_HashSet.hasNext()){
            System.out.print(it_HashSet.next() + " ");
        }
        System.out.println();

        Object[] fruitsArray_of_HashSet = fruitsHashSet.toArray(); // toArray() - Convert to array
        System.out.println("Array from HashSet: " + Arrays.toString(fruitsArray_of_HashSet));

        HashSet<String> anotherHashSet = new HashSet<>();
        Collections.addAll(anotherHashSet, "Apple", "Banana", "Grapes", "Pineapple" , "Kiwi", "Guava");
        System.out.println("anotherHashSet - " + anotherHashSet);
        System.out.println("fruitsHashSet contains all elements of anotherHashSet: " + fruitsHashSet.containsAll(anotherHashSet)); // containsAll() - Check if all elements exist

        fruitsHashSet.addAll(anotherHashSet); // addAll() - Add all elements from another HashSet
        System.out.println("After adding all from anotherHashSet: " + fruitsHashSet);
        System.out.println("fruitsHashSet contains all elements of anotherHashSet: " + fruitsHashSet.containsAll(anotherHashSet)); // containsAll() - Check if all elements exist

        fruitsHashSet.removeAll(anotherHashSet); // removeAll() - Remove all elements
        System.out.println("After removing all elements: " + fruitsHashSet);
        System.out.println("Is HashSet empty? " + fruitsHashSet.isEmpty()); // isEmpty() - Check if HashSet is empty

        fruitsHashSet.addAll(anotherHashSet);
        System.out.println("After adding again - " + fruitsHashSet);

        fruitsHashSet.retainAll(anotherHashSet); // retainAll() - Retain only elements in another HashSet
        System.out.println("After only retaining all from anotherHashSet: " + fruitsHashSet);

        System.out.println("--------------------------------------------------");
        // LinkedHashSet Methods - In common to Collection Methods
        System.out.println("LinkedHashSet - Common Methods Overview:");
        System.out.println("--------------------------------------------------");
        LinkedHashSet<String> fruitsLinkedHashSet = new LinkedHashSet<>();
        fruitsLinkedHashSet.add("Mango");  // add() - Add element
        System.out.println("fruitsLinkedHashSet - " + fruitsLinkedHashSet);
        Collections.addAll(fruitsLinkedHashSet, "Apple", "Orange", "Banana", "Mango", "Apple", "Banana", "Grapes", "Pineapple" , "Kiwi", "Guava");  // addAll() - Add multiple elements
        System.out.println("fruitsLinkedHashSet - " + fruitsLinkedHashSet);   // duplicate check
        System.out.println("LinkedHashSet contains Apple: " + fruitsLinkedHashSet.contains("Apple")); // contains() - Check if element exists
        fruitsLinkedHashSet.remove("Orange"); // remove() - Remove element
        System.out.println("After removing Orange - " + fruitsLinkedHashSet);

        fruitsLinkedHashSet.removeIf(fruit -> fruit.startsWith("A")); // removeIf() - Remove elements - condition starts with
        System.out.println("After removing all elements starting with 'A': " + fruitsLinkedHashSet);

        fruitsLinkedHashSet.removeIf(fruit -> fruit.endsWith("e")); // removeIf() - Remove elements - condition ends with
        System.out.println("After removing all elements ending with 'e': " + fruitsLinkedHashSet);

        fruitsLinkedHashSet.removeIf(fruit -> fruit.length() < 5); // removeIf() - Remove elements - condition length comparison
        System.out.println("After removing all elements with length < 5: " + fruitsLinkedHashSet);

        fruitsLinkedHashSet.removeIf(fruit -> fruit.contains("n")); // removeIf() - Remove elements - condition contains specific substring
        System.out.println("After removing all elements containing 'n': " + fruitsLinkedHashSet);

        System.out.println("Size of LinkedHashSet: " + fruitsLinkedHashSet.size());   // size() - Get number of elements
        System.out.println("Is LinkedHashSet empty? " + fruitsLinkedHashSet.isEmpty()); // isEmpty() - Check if LinkedHashSet is empty
        fruitsLinkedHashSet.clear(); // clear() - Clear all elements
        System.out.println("After clearing LinkedHashSet: " + fruitsLinkedHashSet);
        System.out.println("Is LinkedHashSet empty? " + fruitsLinkedHashSet.isEmpty()); 
        Collections.addAll(fruitsLinkedHashSet, "Apple", "Orange", "Banana", "Mango");
        System.out.println("After adding again - " + fruitsLinkedHashSet);

        //iterator
        Iterator<String> it_LinkedHashSet = fruitsLinkedHashSet.iterator(); // iterator() - Get iterator
        System.out.print("Iterating over LinkedHashSet: ");
        while(it_LinkedHashSet.hasNext()){
            System.out.print(it_LinkedHashSet.next() + " ");
        }
        System.out.println();

        Object[] fruitsArray_of_LinkedHashSet = fruitsLinkedHashSet.toArray(); // toArray() - Convert to array
        System.out.println("Array from LinkedHashSet: " + Arrays.toString(fruitsArray_of_LinkedHashSet));

        LinkedHashSet<String> anotherLinkedHashSet = new LinkedHashSet<>();
        Collections.addAll(anotherLinkedHashSet, "Apple", "Banana", "Grapes", "Pineapple" , "Kiwi", "Guava");
        System.out.println("anotherLinkedHashSet - " + anotherLinkedHashSet);
        System.out.println("fruitsLinkedHashSet contains all elements of anotherLinkedHashSet: " + fruitsLinkedHashSet.containsAll(anotherLinkedHashSet)); // containsAll() - Check if all elements exist

        fruitsLinkedHashSet.addAll(anotherLinkedHashSet); // addAll() - Add all elements from another LinkedHashSet
        System.out.println("After adding all from anotherLinkedHashSet: " + fruitsLinkedHashSet);
        System.out.println("fruitsLinkedHashSet contains all elements of anotherLinkedHashSet: " + fruitsLinkedHashSet.containsAll(anotherLinkedHashSet)); // containsAll() - Check if all elements exist

        fruitsLinkedHashSet.removeAll(anotherLinkedHashSet); // removeAll() - Remove all elements
        System.out.println("After removing all elements: " + fruitsLinkedHashSet);
        System.out.println("Is LinkedHashSet empty? " + fruitsLinkedHashSet.isEmpty()); // isEmpty() - Check if LinkedHashSet is empty

        fruitsLinkedHashSet.addAll(anotherLinkedHashSet);
        System.out.println("After adding again - " + fruitsLinkedHashSet);

        fruitsLinkedHashSet.retainAll(anotherLinkedHashSet); // retainAll() - Retain only elements in another LinkedHashSet
        System.out.println("After only retaining all from anotherLinkedHashSet: " + fruitsLinkedHashSet);

        System.out.println("--------------------------------------------------");
        // TreeSet Methods - In common to Collection Methods
        System.out.println("TreeSet - Common Methods Overview:");
        System.out.println("--------------------------------------------------");
        TreeSet<String> fruitsTreeSet = new TreeSet<>();
        fruitsTreeSet.add("Mango");  // add() - Add element
        System.out.println("fruitsTreeSet - " + fruitsTreeSet);
        Collections.addAll(fruitsTreeSet, "Apple", "Orange", "Banana", "Mango", "Apple", "Banana", "Grapes", "Pineapple" , "Kiwi", "Guava");  // addAll() - Add multiple elements
        System.out.println("fruitsTreeSet - " + fruitsTreeSet);   // duplicate check
        System.out.println("TreeSet contains Apple: " + fruitsTreeSet.contains("Apple")); // contains() - Check if element exists
        fruitsTreeSet.remove("Orange"); // remove() - Remove element
        System.out.println("After removing Orange - " + fruitsTreeSet);

        fruitsTreeSet.removeIf(fruit -> fruit.startsWith("A")); // removeIf() - Remove elements - condition starts with
        System.out.println("After removing all elements starting with 'A': " + fruitsTreeSet);

        fruitsTreeSet.removeIf(fruit -> fruit.endsWith("e")); // removeIf() - Remove elements - condition ends with
        System.out.println("After removing all elements ending with 'e': " + fruitsTreeSet);

        fruitsTreeSet.removeIf(fruit -> fruit.length() < 5); // removeIf() - Remove elements - condition length comparison
        System.out.println("After removing all elements with length < 5: " + fruitsTreeSet);

        fruitsTreeSet.removeIf(fruit -> fruit.contains("n")); // removeIf() - Remove elements - condition contains specific substring
        System.out.println("After removing all elements containing 'n': " + fruitsTreeSet);

        System.out.println("Size of TreeSet: " + fruitsTreeSet.size());   // size() - Get number of elements
        System.out.println("Is TreeSet empty? " + fruitsTreeSet.isEmpty()); // isEmpty() - Check if TreeSet is empty
        fruitsTreeSet.clear(); // clear() - Clear all elements
        System.out.println("After clearing TreeSet: " + fruitsTreeSet);
        System.out.println("Is TreeSet empty? " + fruitsTreeSet.isEmpty()); 
        Collections.addAll(fruitsTreeSet, "Apple", "Orange", "Banana", "Mango");
        System.out.println("After adding again - " + fruitsTreeSet);

        //iterator
        Iterator<String> it_TreeSet = fruitsTreeSet.iterator(); // iterator() - Get iterator
        System.out.print("Iterating over TreeSet: ");
        while(it_TreeSet.hasNext()){
            System.out.print(it_TreeSet.next() + " ");
        }
        System.out.println();

        Object[] fruitsArray_of_TreeSet = fruitsTreeSet.toArray(); // toArray() - Convert to array
        System.out.println("Array from TreeSet: " + Arrays.toString(fruitsArray_of_TreeSet));

        TreeSet<String> anotherTreeSet = new TreeSet<>();
        Collections.addAll(anotherTreeSet, "Apple", "Banana", "Grapes", "Pineapple" , "Kiwi", "Guava");
        System.out.println("anotherTreeSet - " + anotherTreeSet);
        System.out.println("fruitsTreeSet contains all elements of anotherTreeSet: " + fruitsTreeSet.containsAll(anotherTreeSet)); // containsAll() - Check if all elements exist

        fruitsTreeSet.addAll(anotherTreeSet); // addAll() - Add all elements from another TreeSet
        System.out.println("After adding all from anotherTreeSet: " + fruitsTreeSet);
        System.out.println("fruitsTreeSet contains all elements of anotherTreeSet: " + fruitsTreeSet.containsAll(anotherTreeSet)); // containsAll() - Check if all elements exist

        fruitsTreeSet.removeAll(anotherTreeSet); // removeAll() - Remove all elements
        System.out.println("After removing all elements: " + fruitsTreeSet);
        System.out.println("Is TreeSet empty? " + fruitsTreeSet.isEmpty()); // isEmpty() - Check if TreeSet is empty

        fruitsTreeSet.addAll(anotherTreeSet);
        System.out.println("After adding again - " + fruitsTreeSet);

        fruitsTreeSet.retainAll(anotherTreeSet); // retainAll() - Retain only elements in another TreeSet
        System.out.println("After only retaining all from anotherTreeSet: " + fruitsTreeSet);

        System.out.println("--------------------------------------------------");
        // Queue Methods - In common to Collection Methods
        System.out.println("Queue - Common Methods Overview:");
        System.out.println("--------------------------------------------------");
        Queue<String> fruitsQueue = new ArrayDeque<>();
        fruitsQueue.add("Mango");  // add() - Add element
        System.out.println("fruitsQueue - " + fruitsQueue);
        Collections.addAll(fruitsQueue, "Apple", "Orange", "Banana", "Mango", "Apple", "Banana", "Grapes", "Pineapple" , "Kiwi", "Guava");  // addAll() - Add multiple elements
        System.out.println("fruitsQueue - " + fruitsQueue);   // duplicate check
        System.out.println("Queue contains Apple: " + fruitsQueue.contains("Apple")); // contains() - Check if element exists
        fruitsQueue.remove("Orange"); // remove() - Remove element
        System.out.println("After removing Orange - " + fruitsQueue);

        fruitsQueue.removeIf(fruit -> fruit.startsWith("A")); // removeIf() - Remove elements - condition starts with
        System.out.println("After removing all elements starting with 'A': " + fruitsQueue);

        fruitsQueue.removeIf(fruit -> fruit.endsWith("e")); // removeIf() - Remove elements - condition ends with
        System.out.println("After removing all elements ending with 'e': " + fruitsQueue);

        fruitsQueue.removeIf(fruit -> fruit.length() < 5); // removeIf() - Remove elements - condition length comparison
        System.out.println("After removing all elements with length < 5: " + fruitsQueue);

        fruitsQueue.removeIf(fruit -> fruit.contains("n")); // removeIf() - Remove elements - condition contains specific substring
        System.out.println("After removing all elements containing 'n': " + fruitsQueue);

        System.out.println("Size of Queue: " + fruitsQueue.size());   // size() - Get number of elements
        System.out.println("Is Queue empty? " + fruitsQueue.isEmpty()); // isEmpty() - Check if Queue is empty
        fruitsQueue.clear(); // clear() - Clear all elements
        System.out.println("After clearing Queue: " + fruitsQueue);
        System.out.println("Is Queue empty? " + fruitsQueue.isEmpty()); 
        Collections.addAll(fruitsQueue, "Apple", "Orange", "Banana", "Mango");
        System.out.println("After adding again - " + fruitsQueue);

        //iterator
        Iterator<String> it_Queue = fruitsQueue.iterator(); // iterator() - Get iterator
        System.out.print("Iterating over Queue: ");
        while(it_Queue.hasNext()){
            System.out.print(it_Queue.next() + " ");
        }
        System.out.println();

        Object[] fruitsArray_of_Queue = fruitsQueue.toArray(); // toArray() - Convert to array
        System.out.println("Array from Queue: " + Arrays.toString(fruitsArray_of_Queue));

        Queue<String> anotherQueue = new ArrayDeque<>();
        Collections.addAll(anotherQueue, "Apple", "Banana", "Grapes", "Pineapple" , "Kiwi", "Guava");
        System.out.println("anotherQueue - " + anotherQueue);
        System.out.println("fruitsQueue contains all elements of anotherQueue: " + fruitsQueue.containsAll(anotherQueue)); // containsAll() - Check if all elements exist

        fruitsQueue.addAll(anotherQueue); // addAll() - Add all elements from another Queue
        System.out.println("After adding all from anotherQueue: " + fruitsQueue);
        System.out.println("fruitsQueue contains all elements of anotherQueue: " + fruitsQueue.containsAll(anotherQueue)); // containsAll() - Check if all elements exist

        fruitsQueue.removeAll(anotherQueue); // removeAll() - Remove all elements
        System.out.println("After removing all elements: " + fruitsQueue);
        System.out.println("Is Queue empty? " + fruitsQueue.isEmpty()); // isEmpty() - Check if Queue is empty

        fruitsQueue.addAll(anotherQueue);
        System.out.println("After adding again - " + fruitsQueue);

        fruitsQueue.retainAll(anotherQueue); // retainAll() - Retain only elements in another Queue
        System.out.println("After only retaining all from anotherQueue: " + fruitsQueue);

        System.out.println("--------------------------------------------------");
        // Deque Methods - In common to Collection Methods
        System.out.println("Deque - Common Methods Overview:");
        System.out.println("--------------------------------------------------");
        Deque<String> fruitsDeque = new ArrayDeque<>();
        fruitsDeque.add("Mango");  // add() - Add element
        System.out.println("fruitsDeque - " + fruitsDeque);
        Collections.addAll(fruitsDeque, "Apple", "Orange", "Banana", "Mango", "Apple", "Banana", "Grapes", "Pineapple" , "Kiwi", "Guava");  // addAll() - Add multiple elements
        System.out.println("fruitsDeque - " + fruitsDeque);   // duplicate check
        System.out.println("Deque contains Apple: " + fruitsDeque.contains("Apple")); // contains() - Check if element exists
        fruitsDeque.remove("Orange"); // remove() - Remove element
        System.out.println("After removing Orange - " + fruitsDeque);

        fruitsDeque.removeIf(fruit -> fruit.startsWith("A")); // removeIf() - Remove elements - condition starts with
        System.out.println("After removing all elements starting with 'A': " + fruitsDeque);

        fruitsDeque.removeIf(fruit -> fruit.endsWith("e")); // removeIf() - Remove elements - condition ends with
        System.out.println("After removing all elements ending with 'e': " + fruitsDeque);

        fruitsDeque.removeIf(fruit -> fruit.length() < 5); // removeIf() - Remove elements - condition length comparison
        System.out.println("After removing all elements with length < 5: " + fruitsDeque);

        fruitsDeque.removeIf(fruit -> fruit.contains("n")); // removeIf() - Remove elements - condition contains specific substring
        System.out.println("After removing all elements containing 'n': " + fruitsDeque);

        System.out.println("Size of Deque: " + fruitsDeque.size());   // size() - Get number of elements
        System.out.println("Is Deque empty? " + fruitsDeque.isEmpty()); // isEmpty() - Check if Deque is empty
        fruitsDeque.clear(); // clear() - Clear all elements
        System.out.println("After clearing Deque: " + fruitsDeque);
        System.out.println("Is Deque empty? " + fruitsDeque.isEmpty()); 
        Collections.addAll(fruitsDeque, "Apple", "Orange", "Banana", "Mango");
        System.out.println("After adding again - " + fruitsDeque);

        //iterator
        Iterator<String> it_Deque = fruitsDeque.iterator(); // iterator() - Get iterator
        System.out.print("Iterating over Deque: ");
        while(it_Deque.hasNext()){
            System.out.print(it_Deque.next() + " ");
        }
        System.out.println();

        Object[] fruitsArray_of_Deque = fruitsDeque.toArray(); // toArray() - Convert to array
        System.out.println("Array from Deque: " + Arrays.toString(fruitsArray_of_Deque));

        Deque<String> anotherDeque = new ArrayDeque<>();
        Collections.addAll(anotherDeque, "Apple", "Banana", "Grapes", "Pineapple" , "Kiwi", "Guava");
        System.out.println("anotherDeque - " + anotherDeque);
        System.out.println("fruitsDeque contains all elements of anotherDeque: " + fruitsDeque.containsAll(anotherDeque)); // containsAll() - Check if all elements exist

        fruitsDeque.addAll(anotherDeque); // addAll() - Add all elements from another Deque
        System.out.println("After adding all from anotherDeque: " + fruitsDeque);
        System.out.println("fruitsDeque contains all elements of anotherDeque: " + fruitsDeque.containsAll(anotherDeque)); // containsAll() - Check if all elements exist

        fruitsDeque.removeAll(anotherDeque); // removeAll() - Remove all elements
        System.out.println("After removing all elements: " + fruitsDeque);
        System.out.println("Is Deque empty? " + fruitsDeque.isEmpty()); // isEmpty() - Check if Deque is empty

        fruitsDeque.addAll(anotherDeque);
        System.out.println("After adding again - " + fruitsDeque);

        fruitsDeque.retainAll(anotherDeque); // retainAll() - Retain only elements in another Deque
        System.out.println("After only retaining all from anotherDeque: " + fruitsDeque);

        System.out.println("--------------------------------------------------");
        // ArrayDeque Methods - In common to Collection Methods
        System.out.println("ArrayDeque - Common Methods Overview:");
        System.out.println("--------------------------------------------------");
        ArrayDeque<String> fruitsArrayDeque = new ArrayDeque<>();
        fruitsArrayDeque.add("Mango");  // add() - Add element
        System.out.println("fruitsArrayDeque - " + fruitsArrayDeque);
        Collections.addAll(fruitsArrayDeque, "Apple", "Orange", "Banana", "Mango", "Apple", "Banana", "Grapes", "Pineapple" , "Kiwi", "Guava");  // addAll() - Add multiple elements
        System.out.println("fruitsArrayDeque - " + fruitsArrayDeque);   // duplicate check
        System.out.println("ArrayDeque contains Apple: " + fruitsArrayDeque.contains("Apple")); // contains() - Check if element exists
        fruitsArrayDeque.remove("Orange"); // remove() - Remove element
        System.out.println("After removing Orange - " + fruitsArrayDeque);

        fruitsArrayDeque.removeIf(fruit -> fruit.startsWith("A")); // removeIf() - Remove elements - condition starts with
        System.out.println("After removing all elements starting with 'A': " + fruitsArrayDeque);

        fruitsArrayDeque.removeIf(fruit -> fruit.endsWith("e")); // removeIf() - Remove elements - condition ends with
        System.out.println("After removing all elements ending with 'e': " + fruitsArrayDeque);

        fruitsArrayDeque.removeIf(fruit -> fruit.length() < 5); // removeIf() - Remove elements - condition length comparison
        System.out.println("After removing all elements with length < 5: " + fruitsArrayDeque);

        fruitsArrayDeque.removeIf(fruit -> fruit.contains("n")); // removeIf() - Remove elements - condition contains specific substring
        System.out.println("After removing all elements containing 'n': " + fruitsArrayDeque);

        System.out.println("Size of ArrayDeque: " + fruitsArrayDeque.size());   // size() - Get number of elements
        System.out.println("Is ArrayDeque empty? " + fruitsArrayDeque.isEmpty()); // isEmpty() - Check if ArrayDeque is empty
        fruitsArrayDeque.clear(); // clear() - Clear all elements
        System.out.println("After clearing ArrayDeque: " + fruitsArrayDeque);
        System.out.println("Is ArrayDeque empty? " + fruitsArrayDeque.isEmpty()); 
        Collections.addAll(fruitsArrayDeque, "Apple", "Orange", "Banana", "Mango");
        System.out.println("After adding again - " + fruitsArrayDeque);

        //iterator
        Iterator<String> it_ArrayDeque = fruitsArrayDeque.iterator(); // iterator() - Get iterator
        System.out.print("Iterating over ArrayDeque: ");
        while(it_ArrayDeque.hasNext()){
            System.out.print(it_ArrayDeque.next() + " ");
        }
        System.out.println();

        Object[] fruitsArray_of_ArrayDeque = fruitsArrayDeque.toArray(); // toArray() - Convert to array
        System.out.println("Array from ArrayDeque: " + Arrays.toString(fruitsArray_of_ArrayDeque));

        ArrayDeque<String> anotherArrayDeque = new ArrayDeque<>();
        Collections.addAll(anotherArrayDeque, "Apple", "Banana", "Grapes", "Pineapple" , "Kiwi", "Guava");
        System.out.println("anotherArrayDeque - " + anotherArrayDeque);
        System.out.println("fruitsArrayDeque contains all elements of anotherArrayDeque: " + fruitsArrayDeque.containsAll(anotherArrayDeque)); // containsAll() - Check if all elements exist

        fruitsArrayDeque.addAll(anotherArrayDeque); // addAll() - Add all elements from another ArrayDeque
        System.out.println("After adding all from anotherArrayDeque: " + fruitsArrayDeque);
        System.out.println("fruitsArrayDeque contains all elements of anotherArrayDeque: " + fruitsArrayDeque.containsAll(anotherArrayDeque)); // containsAll() - Check if all elements exist

        fruitsArrayDeque.removeAll(anotherArrayDeque); // removeAll() - Remove all elements
        System.out.println("After removing all elements: " + fruitsArrayDeque);
        System.out.println("Is ArrayDeque empty? " + fruitsArrayDeque.isEmpty()); // isEmpty() - Check if ArrayDeque is empty

        fruitsArrayDeque.addAll(anotherArrayDeque);
        System.out.println("After adding again - " + fruitsArrayDeque);

        fruitsArrayDeque.retainAll(anotherArrayDeque); // retainAll() - Retain only elements in another ArrayDeque
        System.out.println("After only retaining all from anotherArrayDeque: " + fruitsArrayDeque);

        System.out.println("--------------------------------------------------");
        // PriorityQueue Methods - In common to Collection Methods
        System.out.println("PriorityQueue - Common Methods Overview:");
        System.out.println("--------------------------------------------------");
        PriorityQueue<String> fruitsPriorityQueue = new PriorityQueue<>();
        fruitsPriorityQueue.add("Mango");  // add() - Add element
        System.out.println("fruitsPriorityQueue - " + fruitsPriorityQueue);
        Collections.addAll(fruitsPriorityQueue, "Apple", "Orange", "Banana", "Mango", "Apple", "Banana", "Grapes", "Pineapple" , "Kiwi", "Guava");  // addAll() - Add multiple elements
        System.out.println("fruitsPriorityQueue - " + fruitsPriorityQueue);   // duplicate check
        System.out.println("PriorityQueue contains Apple: " + fruitsPriorityQueue.contains("Apple")); // contains() - Check if element exists
        fruitsPriorityQueue.remove("Orange"); // remove() - Remove element
        System.out.println("After removing Orange - " + fruitsPriorityQueue);

        fruitsPriorityQueue.removeIf(fruit -> fruit.startsWith("A")); // removeIf() - Remove elements - condition starts with
        System.out.println("After removing all elements starting with 'A': " + fruitsPriorityQueue);

        fruitsPriorityQueue.removeIf(fruit -> fruit.endsWith("e")); // removeIf() - Remove elements - condition ends with
        System.out.println("After removing all elements ending with 'e': " + fruitsPriorityQueue);

        fruitsPriorityQueue.removeIf(fruit -> fruit.length() < 5); // removeIf() - Remove elements - condition length comparison
        System.out.println("After removing all elements with length < 5: " + fruitsPriorityQueue);

        fruitsPriorityQueue.removeIf(fruit -> fruit.contains("n")); // removeIf() - Remove elements - condition contains specific substring
        System.out.println("After removing all elements containing 'n': " + fruitsPriorityQueue);

        System.out.println("Size of PriorityQueue: " + fruitsPriorityQueue.size());   // size() - Get number of elements
        System.out.println("Is PriorityQueue empty? " + fruitsPriorityQueue.isEmpty()); // isEmpty() - Check if PriorityQueue is empty
        fruitsPriorityQueue.clear(); // clear() - Clear all elements
        System.out.println("After clearing PriorityQueue: " + fruitsPriorityQueue);
        System.out.println("Is PriorityQueue empty? " + fruitsPriorityQueue.isEmpty()); 
        Collections.addAll(fruitsPriorityQueue, "Apple", "Orange", "Banana", "Mango");
        System.out.println("After adding again - " + fruitsPriorityQueue);

        //iterator
        Iterator<String> it_PriorityQueue = fruitsPriorityQueue.iterator(); // iterator() - Get iterator
        System.out.print("Iterating over PriorityQueue: ");
        while(it_PriorityQueue.hasNext()){
            System.out.print(it_PriorityQueue.next() + " ");
        }
        System.out.println();

        Object[] fruitsArray_of_PriorityQueue = fruitsPriorityQueue.toArray(); // toArray() - Convert to array
        System.out.println("Array from PriorityQueue: " + Arrays.toString(fruitsArray_of_PriorityQueue));

        PriorityQueue<String> anotherPriorityQueue = new PriorityQueue<>();
        Collections.addAll(anotherPriorityQueue, "Apple", "Banana", "Grapes", "Pineapple" , "Kiwi", "Guava");
        System.out.println("anotherPriorityQueue - " + anotherPriorityQueue);
        System.out.println("fruitsPriorityQueue contains all elements of anotherPriorityQueue: " + fruitsPriorityQueue.containsAll(anotherPriorityQueue)); // containsAll() - Check if all elements exist

        fruitsPriorityQueue.addAll(anotherPriorityQueue); // addAll() - Add all elements from another PriorityQueue
        System.out.println("After adding all from anotherPriorityQueue: " + fruitsPriorityQueue);
        System.out.println("fruitsPriorityQueue contains all elements of anotherPriorityQueue: " + fruitsPriorityQueue.containsAll(anotherPriorityQueue)); // containsAll() - Check if all elements exist

        fruitsPriorityQueue.removeAll(anotherPriorityQueue); // removeAll() - Remove all elements
        System.out.println("After removing all elements: " + fruitsPriorityQueue);
        System.out.println("Is PriorityQueue empty? " + fruitsPriorityQueue.isEmpty()); // isEmpty() - Check if PriorityQueue is empty

        fruitsPriorityQueue.addAll(anotherPriorityQueue);
        System.out.println("After adding again - " + fruitsPriorityQueue);

        fruitsPriorityQueue.retainAll(anotherPriorityQueue); // retainAll() - Retain only elements in another PriorityQueue
        System.out.println("After only retaining all from anotherPriorityQueue: " + fruitsPriorityQueue);

        System.out.println("--------------------------------------------------");
    }
}
