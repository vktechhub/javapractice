import java.util.*;
public class CJ_Collection_3_List_Specific_Methods {
    public static void main(String[] args) {
       //List Methods - Overview (In addition to Collection methods)
        // get() - Returns the element at a specified index
        // set() - Updates the element at a specified index
        // add(index, element) - Adds an element at a specified index
        // remove(index) - Removes the element at a specified index
        // indexOf() - Returns the index of the first occurrence of a specified element
        // lastIndexOf() - Returns the index of the last occurrence of a specified element
        // listIterator() - Returns a list iterator to traverse the elements of the list
        // subList() - Returns a view of a portion of the list between specified indices

        System.out.println("--------------------------------------------------");
        // List Methods - Other than Collection methods
        System.out.println("List - Other than Collection methods:");
        System.out.println("--------------------------------------------------");
        List<String> fruitsList = new ArrayList<>();
        Collections.addAll(fruitsList,"Apple", "Banana", "Orange", "Mango", "Watermelon", "Pineapple");
        System.out.println("fruitsList: " + fruitsList);
        System.out.println("Element at index 2: " + fruitsList.get(2)); // Orange
        fruitsList.set(2, "Watermelon");
        System.out.println("After setting index 2 to Watermelon: " + fruitsList);
        fruitsList.add(2, "Kiwi");
        System.out.println("After adding Kiwi at index 2: " + fruitsList);
        fruitsList.add("Watermelon");
        System.out.println("After adding another Watermelon: " + fruitsList);
        System.out.println("Index of Watermelon: " + fruitsList.indexOf("Watermelon")); 
        System.out.println("Last index of Watermelon: " + fruitsList.lastIndexOf("Watermelon")); 
        fruitsList.remove(3); // Removes Mango
        System.out.println("After removing element at index 3: " + fruitsList);
        List<String> subList = fruitsList.subList(1, 3);
        System.out.println("SubList: " + subList);
        if(fruitsList.equals(subList)) {
            System.out.println("fruitsList is equal to subList");
        } else {
            System.out.println("fruitsList is not equal to subList");
        }
        List<String> anotherList = new ArrayList<>(fruitsList);
        System.out.println("anotherList (copy of fruitsList): " + anotherList);
        if(fruitsList.equals(anotherList)) {
            System.out.println("fruitsList is equal to anotherList");
        } else {
            System.out.println("fruitsList is not equal to anotherList");
        }
        System.out.println("hashcode of fruitsList: " + fruitsList.hashCode());
        System.out.println("hashcode of anotherList: " + anotherList.hashCode());
        System.out.println("hashcode of subList: " + subList.hashCode());

        ListIterator<String> listIterator = fruitsList.listIterator();
        System.out.print("Forward traversal: ");
        while (listIterator.hasNext()) {    
            System.out.print(listIterator.next() + " ");
        }
        System.out.println();

        System.out.print("Backward traversal: ");
        while (listIterator.hasPrevious()) {
            System.out.print(listIterator.previous() + " ");
        }
        System.out.println();

        System.out.println("fruitsList: " + fruitsList);
        System.out.println("ModifyIterator to remove/change elements:");
        ListIterator<String> modifyIterator = fruitsList.listIterator();
        
        while (modifyIterator.hasNext()) {
            String fruit = modifyIterator.next();
            if (fruit.startsWith("A")) {
                modifyIterator.remove();
            }
            if (fruit.startsWith("B")) {
                modifyIterator.set("Blueberry");
            }
            if (fruit.startsWith("M")) {
                modifyIterator.add("Melon");
            }
        }

        System.out.println("After modification: " + fruitsList);


        System.out.println("--------------------------------------------------");
        // ArrayList Methods - Other than Collection methods
        System.out.println("ArrayList - Other than Collection methods:");
        System.out.println("--------------------------------------------------");
        ArrayList<String> fruitsArrayList = new ArrayList<>();
        Collections.addAll(fruitsArrayList,"Apple", "Banana", "Orange", "Mango", "Watermelon", "Pineapple");
        System.out.println("fruitsArrayList: " + fruitsArrayList);
        System.out.println("Element at index 2: " + fruitsArrayList.get(2)); // Orange
        fruitsArrayList.set(2, "Watermelon");
        System.out.println("After setting index 2 to Watermelon: " + fruitsArrayList);
        fruitsArrayList.add(2, "Kiwi");
        System.out.println("After adding Kiwi at index 2: " + fruitsArrayList);
        fruitsArrayList.add("Watermelon");
        System.out.println("After adding another Watermelon: " + fruitsArrayList);
        System.out.println("Index of Watermelon: " + fruitsArrayList.indexOf("Watermelon")); 
        System.out.println("Last index of Watermelon: " + fruitsArrayList.lastIndexOf("Watermelon")); 
        fruitsArrayList.remove(3); // Removes Mango
        System.out.println("After removing element at index 3: " + fruitsArrayList);
        List<String> subArrayList = fruitsArrayList.subList(1, 3);
        System.out.println("SubArrayList: " + subArrayList);
        if(fruitsArrayList.equals(subArrayList)) {
            System.out.println("fruitsArrayList is equal to subList");
        } else {
            System.out.println("fruitsArrayList is not equal to subArrayList");
        }
        ArrayList<String> anotherArrayList = new ArrayList<>(fruitsArrayList);
        System.out.println("anotherArrayList (copy of fruitsArrayList): " + anotherArrayList);
        if(fruitsArrayList.equals(anotherArrayList)) {
            System.out.println("fruitsArrayList is equal to anotherArrayList");
        } else {
            System.out.println("fruitsArrayList is not equal to anotherArrayList");
        }
        System.out.println("hashcode of fruitsArrayList: " + fruitsArrayList.hashCode());
        System.out.println("hashcode of anotherArrayList: " + anotherArrayList.hashCode());
        System.out.println("hashcode of subArrayList: " + subArrayList.hashCode());

        ListIterator<String> arrayListIterator = fruitsArrayList.listIterator();
        System.out.print("Forward traversal: ");
        while (arrayListIterator.hasNext()) {
            System.out.print(arrayListIterator.next() + " ");
        }
        System.out.println();

        System.out.print("Backward traversal: ");
        while (arrayListIterator.hasPrevious()) {
            System.out.print(arrayListIterator.previous() + " ");
        }
        System.out.println();

        System.out.println("fruitsArrayList: " + fruitsArrayList);
        System.out.println("ModifyIterator to remove/change elements:");
        ListIterator<String> modifyArrayListIterator = fruitsArrayList.listIterator();
        while (modifyArrayListIterator.hasNext()) {
            String fruit = modifyArrayListIterator.next();
            if (fruit.startsWith("A")) {
                modifyArrayListIterator.remove();
            }
            if (fruit.startsWith("B")) {
                modifyArrayListIterator.set("Blueberry");
            }
            if (fruit.startsWith("M")) {
                modifyArrayListIterator.add("Melon");
            }
        }

        System.out.println("After modification: " + fruitsArrayList);
        System.out.println("--------------------------------------------------");
        // LinkedList Methods - Other than Collection methods
        System.out.println("LinkedList - Other than Collection methods:");
        System.out.println("--------------------------------------------------");
        LinkedList<String> fruitsLinkedList = new LinkedList<>();
        Collections.addAll(fruitsLinkedList,"Apple", "Banana", "Orange", "Mango", "Watermelon", "Pineapple");
        System.out.println("fruitsLinkedList: " + fruitsLinkedList);
        System.out.println("Element at index 2: " + fruitsLinkedList.get(2)); // Orange
        fruitsLinkedList.set(2, "Watermelon");
        System.out.println("After setting index 2 to Watermelon: " + fruitsLinkedList);
        fruitsLinkedList.add(2, "Kiwi");
        System.out.println("After adding Kiwi at index 2: " + fruitsLinkedList);
        fruitsLinkedList.add("Watermelon");
        System.out.println("After adding another Watermelon: " + fruitsLinkedList);
        System.out.println("Index of Watermelon: " + fruitsLinkedList.indexOf("Watermelon")); 
        System.out.println("Last index of Watermelon: " + fruitsLinkedList.lastIndexOf("Watermelon")); 
        fruitsLinkedList.remove(3); // Removes Mango
        System.out.println("After removing element at index 3: " + fruitsLinkedList);
        List<String> subLinkedList = fruitsLinkedList.subList(1, 3);
        System.out.println("SubLinkedList: " + subLinkedList);
        if(fruitsLinkedList.equals(subLinkedList)) {
            System.out.println("fruitsLinkedList is equal to subList");
        } else {
            System.out.println("fruitsLinkedList is not equal to subLinkedList");
        }
        LinkedList<String> anotherLinkedList = new LinkedList<>(fruitsLinkedList);
        System.out.println("anotherLinkedList (copy of fruitsLinkedList): " + anotherLinkedList);
        if(fruitsLinkedList.equals(anotherLinkedList)) {
            System.out.println("fruitsLinkedList is equal to anotherLinkedList");
        } else {
            System.out.println("fruitsLinkedList is not equal to anotherLinkedList");
        }
        System.out.println("hashcode of fruitsLinkedList: " + fruitsLinkedList.hashCode());
        System.out.println("hashcode of anotherLinkedList: " + anotherLinkedList.hashCode());
        System.out.println("hashcode of subLinkedList: " + subLinkedList.hashCode());

        ListIterator<String> LinkedListIterator = fruitsLinkedList.listIterator();
        System.out.print("Forward traversal: ");
        while (LinkedListIterator.hasNext()) {
            System.out.print(LinkedListIterator.next() + " ");
        }
        System.out.println();

        System.out.print("Backward traversal: ");
        while (LinkedListIterator.hasPrevious()) {
            System.out.print(LinkedListIterator.previous() + " ");
        }
        System.out.println();

        System.out.println("fruitsLinkedList: " + fruitsLinkedList);
        System.out.println("ModifyIterator to remove/change elements:");
        ListIterator<String> modifyLinkedListIterator = fruitsLinkedList.listIterator();
        while (modifyLinkedListIterator.hasNext()) {
            String fruit = modifyLinkedListIterator.next();
            if (fruit.startsWith("A")) {
                modifyLinkedListIterator.remove();
            }
            if (fruit.startsWith("B")) {
                modifyLinkedListIterator.set("Blueberry");
            }
            if (fruit.startsWith("M")) {
                modifyLinkedListIterator.add("Melon");
            }
        }

        System.out.println("After modification: " + fruitsLinkedList);
        System.out.println("--------------------------------------------------");

    }
}