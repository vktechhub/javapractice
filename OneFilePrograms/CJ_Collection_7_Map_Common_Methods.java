import java.util.*;
public class CJ_Collection_7_Map_Common_Methods {
    public static void main(String[] args) {

        //Map Methods - Overview
        // Basic Methods
        System.out.println("--------------------------------");
        System.out.println("Basic Map Methods:");
        Map<Integer, String> map = new HashMap<>();
        map.put(2, "Two");
        map.put(3, "Three");
        map.put(1, "One");
        map.put(4, "Four");
        map.putIfAbsent(2, "Two Duplicate"); // Will not overwrite existing key
        map.putIfAbsent(5, "Five");
        System.out.println("Map: " + map);
        System.out.println("Get value for key 1: " + map.get(1));
        System.out.println("Contains key 2: " + map.containsKey(2));
        System.out.println("Contains value 'Three': " + map.containsValue("Three"));
        System.out.println("Size of map: " + map.size());
        map.remove(1);
        System.out.println("Map after removing key 1: " + map);
        System.out.println("Is map empty: " + map.isEmpty());
        map.clear();
        System.out.println("Map after clear: " + map);
        System.out.println("Is map empty after clear: " + map.isEmpty());
        map.put(2, "Two");
        map.put(3, "Three");
        map.put(1, "One");
        map.put(4, "Four");
        System.out.println("Map after re-adding elements: " + map);

        // Bulk Operations
        Map<Integer, String> map1 = new HashMap<>();
        map1.putAll(map);
        System.out.println("Map1 after putAll from map: " + map1);
        System.out.println("Map1 equals map: " + map1.equals(map));

        // Collection Views
        System.out.println("Keys in map: " + map.keySet());
        System.out.println("Values in map: " + map.values());
        System.out.println("Entries in map: " + map.entrySet());

        // Hashing and Equality
        Map<Integer, String> map2 = new HashMap<>();
        map2.put(2, "Two");
        map2.put(3, "Three");
        System.out.println("Map2: " + map2);
        System.out.println("Map1 hashCode: " + map1.hashCode());
        System.out.println("Map2 hashCode: " + map2.hashCode());
        System.out.println("Map1 equals Map2: " + map1.equals(map2));
        System.out.println("Map1 toString: " + map1.toString());
        System.out.println("Map2 toString: " + map2.toString());

        // Advanced Methods (Java 8+)
        map2.putIfAbsent(4, "Four");
        System.out.println("Map2 after putIfAbsent(4, 'Four'): " + map2);
        map2.compute(2, (k, v) -> v + " Updated");
        System.out.println("Map2 after compute on key 2: " + map2); 
        map2.computeIfAbsent(5, k -> "Five");
        System.out.println("Map2 after computeIfAbsent on key 5: " + map2);
        map2.computeIfPresent(3, (k, v) -> v + " Present");
        System.out.println("Map2 after computeIfPresent on key 3: " + map2);
        map2.merge(3, " Merged", (v1, v2) -> v1 + v2);
        System.out.println("Map2 after merge on key 3: " + map2);
        map2.replace(4, "Four Replaced");
        System.out.println("Map2 after replace on key 4: " + map2);
        map2.forEach((k, v) -> System.out.println("Key: " + k + ", Value: " + v));
        System.out.println("Get value for key 5 with default: " + map2.getOrDefault(5, "Default Value"));
        map2.replaceAll((k, v) -> v + " (Replaced All)");
        System.out.println("Map2 after replaceAll: " + map2);

        boolean replaced = map2.replace(4, "Four Replaced (Replaced All)", "Four Final");
        System.out.println("Was key 4 replaced? " + replaced);
        System.out.println("Map2 after conditional replace on key 4: " + map2);

        System.out.println("--------------------------------");
        System.out.println("HashMap Methods similar to Map :");
        System.out.println("Basic Map Methods:");
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(2, "Two");
        hm.put(3, "Three");
        hm.put(1, "One");
        hm.put(4, "Four");
        System.out.println("Map: " + hm);
        System.out.println("Get value for key 1: " + hm.get(1));
        System.out.println("Contains key 2: " + hm.containsKey(2));
        System.out.println("Contains value 'Three': " + hm.containsValue("Three"));
        System.out.println("Size of map: " + hm.size());
        hm.remove(1);
        System.out.println("Map after removing key 1: " + hm);
        System.out.println("Is map empty: " + hm.isEmpty());
        hm.clear();
        System.out.println("Map after clear: " + hm);
        System.out.println("Is map empty after clear: " + hm.isEmpty());
        hm.put(2, "Two");
        hm.put(3, "Three");
        hm.put(1, "One");
        hm.put(4, "Four");
        System.out.println("Map after re-adding elements: " + hm);

        // Bulk Operations
        HashMap<Integer, String> hm1 = new HashMap<>();
        hm1.putAll(hm);
        System.out.println("Map1 after putAll from map: " + hm1);
        System.out.println("Map1 equals map: " + hm1.equals(hm));

        // Collection Views
        System.out.println("Keys in map: " + hm.keySet());
        System.out.println("Values in map: " + hm.values());
        System.out.println("Entries in map: " + hm.entrySet());

        // Hashing and Equality
        HashMap<Integer, String> hm2 = new HashMap<>();
        hm2.put(2, "Two");
        hm2.put(3, "Three");
        System.out.println("Map2: " + hm2);
        System.out.println("Map1 hashCode: " + hm1.hashCode());
        System.out.println("Map2 hashCode: " + hm2.hashCode());
        System.out.println("Map1 equals Map2: " + hm1.equals(hm2));
        System.out.println("Map1 toString: " + hm1.toString());
        System.out.println("Map2 toString: " + hm2.toString());

        // Advanced Methods (Java 8+)
        hm2.putIfAbsent(4, "Four");
        System.out.println("Map2 after putIfAbsent(4, 'Four'): " + hm2);
        hm2.compute(2, (k, v) -> v + " Updated");
        System.out.println("Map2 after compute on key 2: " + hm2);
        hm2.computeIfAbsent(5, k -> "Five");
        System.out.println("Map2 after computeIfAbsent on key 5: " + hm2);
        hm2.computeIfPresent(3, (k, v) -> v + " Present");
        System.out.println("Map2 after computeIfPresent on key 3: " + hm2);
        hm2.merge(3, " Merged", (v1, v2) -> v1 + v2);
        System.out.println("Map2 after merge on key 3: " + hm2);
        hm2.replace(4, "Four Replaced");
        System.out.println("Map2 after replace on key 4: " + hm2);
        hm2.forEach((k, v) -> System.out.println("Key: " + k + ", Value: " + v));
        System.out.println("Get value for key 5 with default: " + hm2.getOrDefault(5, "Default Value"));
        hm2.replaceAll((k, v) -> v + " (Replaced All)");
        System.out.println("Map2 after replaceAll: " + hm2);

        boolean replaced_hm2 = hm2.replace(4, "Four Replaced (Replaced All)", "Four Final");
        System.out.println("Was key 4 replaced? " + replaced_hm2);
        System.out.println("Map2 after conditional replace on key 4: " + hm2);

        System.out.println("--------------------------------");
        
        System.out.println("LinkedHashMap Methods similar to Map :");
        System.out.println("Basic Map Methods:");
        LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>();
        lhm.put(2, "Two");
        lhm.put(3, "Three");
        lhm.put(1, "One");
        lhm.put(4, "Four");
        System.out.println("Map: " + lhm);
        System.out.println("Get value for key 1: " + lhm.get(1));
        System.out.println("Contains key 2: " + lhm.containsKey(2));
        System.out.println("Contains value 'Three': " + lhm.containsValue("Three"));
        System.out.println("Size of map: " + lhm.size());
        lhm.remove(1);
        System.out.println("Map after removing key 1: " + lhm);
        System.out.println("Is map empty: " + lhm.isEmpty());
        lhm.clear();
        System.out.println("Map after clear: " + lhm);
        System.out.println("Is map empty after clear: " + lhm.isEmpty());
        lhm.put(2, "Two");
        lhm.put(3, "Three");
        lhm.put(1, "One");
        lhm.put(4, "Four");
        System.out.println("Map after re-adding elements: " + lhm);

        // Bulk Operations
        LinkedHashMap<Integer, String> lhm1 = new LinkedHashMap<>();
        lhm1.putAll(lhm);
        System.out.println("Map1 after putAll from map: " + lhm1);
        System.out.println("Map1 equals map: " + lhm1.equals(lhm));

        // Collection Views
        System.out.println("Keys in map: " + lhm.keySet());
        System.out.println("Values in map: " + lhm.values());
        System.out.println("Entries in map: " + lhm.entrySet());

        // Hashing and Equality
        LinkedHashMap<Integer, String> lhm2 = new LinkedHashMap<>();
        lhm2.put(2, "Two");
        lhm2.put(3, "Three");
        System.out.println("Map2: " + lhm2);
        System.out.println("Map1 hashCode: " + lhm1.hashCode());
        System.out.println("Map2 hashCode: " + lhm2.hashCode());
        System.out.println("Map1 equals Map2: " + lhm1.equals(lhm2));
        System.out.println("Map1 toString: " + lhm1.toString());
        System.out.println("Map2 toString: " + lhm2.toString());

        // Advanced Methods (Java 8+)
        lhm2.putIfAbsent(4, "Four");
        System.out.println("Map2 after putIfAbsent(4, 'Four'): " + lhm2);
        lhm2.compute(2, (k, v) -> v + " Updated");
        System.out.println("Map2 after compute on key 2: " + lhm2);
        lhm2.computeIfAbsent(5, k -> "Five");
        System.out.println("Map2 after computeIfAbsent on key 5: " + lhm2);
        lhm2.computeIfPresent(3, (k, v) -> v + " Present");
        System.out.println("Map2 after computeIfPresent on key 3: " + lhm2);
        lhm2.merge(3, " Merged", (v1, v2) -> v1 + v2);
        System.out.println("Map2 after merge on key 3: " + lhm2);
        lhm2.replace(4, "Four Replaced");
        System.out.println("Map2 after replace on key 4: " + lhm2);
        lhm2.forEach((k, v) -> System.out.println("Key: " + k + ", Value: " + v));
        System.out.println("Get value for key 5 with default: " + lhm2.getOrDefault(5, "Default Value"));
        lhm2.replaceAll((k, v) -> v + " (Replaced All)");
        System.out.println("Map2 after replaceAll: " + lhm2);

        boolean replaced_lhm2 = lhm2.replace(4, "Four Replaced (Replaced All)", "Four Final");
        System.out.println("Was key 4 replaced? " + replaced_lhm2);
        System.out.println("Map2 after conditional replace on key 4: " + lhm2);

        System.out.println("--------------------------------");
        
        System.out.println("TreeMap Methods similar to Map :");
        System.out.println("Basic Map Methods:");
        TreeMap<Integer, String> tmap = new TreeMap<>();
        tmap.put(2, "Two");
        tmap.put(3, "Three");
        tmap.put(1, "One");
        tmap.put(4, "Four");
        System.out.println("Map: " + tmap);
        System.out.println("Get value for key 1: " + tmap.get(1));
        System.out.println("Contains key 2: " + tmap.containsKey(2));
        System.out.println("Contains value 'Three': " + tmap.containsValue("Three"));
        System.out.println("Size of map: " + tmap.size());
        tmap.remove(1);
        System.out.println("Map after removing key 1: " + tmap);
        System.out.println("Is map empty: " + tmap.isEmpty());
        tmap.clear();
        System.out.println("Map after clear: " + tmap);
        System.out.println("Is map empty after clear: " + tmap.isEmpty());
        tmap.put(2, "Two");
        tmap.put(3, "Three");
        tmap.put(1, "One");
        tmap.put(4, "Four");
        System.out.println("Map after re-adding elements: " + tmap);

        // Bulk Operations
        TreeMap<Integer, String> tmap1 = new TreeMap<>();
        tmap1.putAll(tmap);
        System.out.println("Map1 after putAll from map: " + tmap1);
        System.out.println("Map1 equals map: " + tmap1.equals(tmap));

        // Collection Views
        System.out.println("Keys in map: " + tmap.keySet());
        System.out.println("Values in map: " + tmap.values());
        System.out.println("Entries in map: " + tmap.entrySet());

        // Hashing and Equality
        TreeMap<Integer, String> tmap2 = new TreeMap<>();
        tmap2.put(2, "Two");
        tmap2.put(3, "Three");
        System.out.println("Map2: " + tmap2);
        System.out.println("Map1 hashCode: " + tmap1.hashCode());
        System.out.println("Map2 hashCode: " + tmap2.hashCode());
        System.out.println("Map1 equals Map2: " + tmap1.equals(tmap2));
        System.out.println("Map1 toString: " + tmap1.toString());
        System.out.println("Map2 toString: " + tmap2.toString());

        // Advanced Methods (Java 8+)
        tmap2.putIfAbsent(4, "Four");
        System.out.println("Map2 after putIfAbsent(4, 'Four'): " + tmap2);
        tmap2.compute(2, (k, v) -> v + " Updated");
        System.out.println("Map2 after compute on key 2: " + tmap2);
        tmap2.computeIfAbsent(5, k -> "Five");
        System.out.println("Map2 after computeIfAbsent on key 5: " + tmap2);
        tmap2.computeIfPresent(3, (k, v) -> v + " Present");
        System.out.println("Map2 after computeIfPresent on key 3: " + tmap2);
        tmap2.merge(3, " Merged", (v1, v2) -> v1 + v2);
        System.out.println("Map2 after merge on key 3: " + tmap2);
        tmap2.replace(4, "Four Replaced");
        System.out.println("Map2 after replace on key 4: " + tmap2);
        tmap2.forEach((k, v) -> System.out.println("Key: " + k + ", Value: " + v));
        System.out.println("Get value for key 5 with default: " + tmap2.getOrDefault(5, "Default Value"));
        tmap2.replaceAll((k, v) -> v + " (Replaced All)");
        System.out.println("Map2 after replaceAll: " + tmap2);

        boolean replaced_tmap2 = tmap2.replace(4, "Four Replaced (Replaced All)", "Four Final");
        System.out.println("Was key 4 replaced? " + replaced_tmap2);
        System.out.println("Map2 after conditional replace on key 4: " + tmap2);
    
    }
}
    
