import java.util.*;

public class CJ_Collection_4_ArrayList_Specific_Methods {
    public static void main(String[] args) {
        //ArrayList Methods - Overview (In addition to Collection and List methods)
        // ensureCapacity() - Increases the capacity of the ArrayList to a specified minimum capacity
        // trimToSize() - Trims the capacity of the ArrayList to the current size
        ArrayList<String> fruitsArrayList = new ArrayList<>();
        Collections.addAll(fruitsArrayList, "Fig", "Grape", "Honeydew", "Apple", "Banana", "Cherry", "Date", "Fig", "Grape");
        System.out.println("fruitsArrayList: " + fruitsArrayList);
        fruitsArrayList.ensureCapacity(20);
        System.out.println("Capacity ensured to 20.");
        System.out.println("fruitsArrayList after ensureCapacity set to 20: " + fruitsArrayList);
        fruitsArrayList.trimToSize();
        System.out.println("Capacity trimmed to current size.");
        System.out.println("fruitsArrayList after  trimToSize: " + fruitsArrayList);
        
    }
}
