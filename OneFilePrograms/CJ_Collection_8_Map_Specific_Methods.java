import java.util.*;

public class CJ_Collection_8_Map_Specific_Methods {
    public static void main(String[] args) {

        System.out.println("--------------------------------");
        System.out.println("Methods in HashMap, But not in Map:");
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");      
        map.put(3, "Three");
        map.put(4, "Four");
        map.put(5, "Five");
        System.out.println(map);
        
        @SuppressWarnings("unchecked")
        HashMap<Integer, String> map2 = (HashMap<Integer, String>) map.clone();
        System.out.println("Cloned map: " + map2);

        System.out.println("--------------------------------");
        System.out.println("Methods in LinkedHashMap, But not in Map:");
        LinkedHashMap<Integer, String> lmap = new LinkedHashMap<>();
        lmap.put(1, "One");
        lmap.put(2, "Two");
        lmap.put(3, "Three");
        lmap.put(4, "Four");
        lmap.put(5, "Five");
        System.out.println(lmap);

        @SuppressWarnings("unchecked")
        LinkedHashMap<Integer, String> lmap2 = (LinkedHashMap<Integer, String>) lmap.clone();
        System.out.println("Cloned LinkedHashMap: " + lmap2);
        
        // removeEldestEntry - when size > 3
        LinkedHashMap<Integer, String> lmap3 = new LinkedHashMap<Integer, String>(5, 0.75f, true) {
            protected boolean removeEldestEntry(Map.Entry<Integer, String> eldest) {
                return size() > 3;  

            }
        };
        System.out.println("lmap3: " + lmap3);
        lmap3.put(1,"Apple");
        lmap3.put(2, "Orange");
        lmap3.put(3, "Mango");
        System.out.println("lmap3: " + lmap3);
        lmap3.put(4, "Blueberry");
        System.out.println("lmap3: " + lmap3);

        System.out.println("--------------------------------");
        System.out.println("Methods in TreeMap, But not in Map:");
        TreeMap<Integer, String> tmap = new TreeMap<>();
        tmap.put(0,"tree0");
        tmap.put(1,"tree1");
        tmap.put(2,"tree2");
        tmap.put(3,"tree3");
        System.out.println("tmap: - " + tmap);
        System.out.println("firstkey - " + tmap.firstKey());
        System.out.println("lastkey - " + tmap.lastKey());
        System.out.println("Headmap" + tmap.headMap(2));
        System.out.println("tailmap" + tmap.tailMap(2));
        System.out.println("SubMap" + tmap.subMap(1, 3));
        System.out.println("ceilingkey" + tmap.ceilingKey(2));
        System.out.println("floorkey" + tmap.floorKey(2));
        System.out.println("higherkey" + tmap.higherKey(2));
        System.out.println("lowerkey" + tmap.lowerKey(2));
        System.out.println("descending map" + tmap.descendingMap());
        System.out.println("descendingKeySet" + tmap.descendingKeySet());
    }
}

