package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Hashtable;
import java.util.SortedMap;
import java.util.TreeMap;

public class methods {

    public static  Map<Integer, String> displayHshMap(){
        Map<Integer, String> hashMap = new HashMap <Integer, String>();

        hashMap.put(10, "abc");
        hashMap.put(20, "cde");
        hashMap.put(30, null);
        hashMap.put(40, null);
        hashMap.put(20, "efg");
        hashMap.put(50, "abc");
        hashMap.put(20, "cde");

        for (Integer key : hashMap.keySet()){ //when its not not much needed to compare the both we can use like this
            System.out.println(key + ", " + hashMap.get(key));
        }

        return hashMap;

    }

    public static void displayTreeMap(){

        SortedMap<Integer, String> treeMap = new TreeMap<Integer, String>();

        treeMap.put(10, "abc");
        treeMap.put(20, "cde");
        treeMap.put(30, null);
        treeMap.put(40, null);
        treeMap.put(50, "efg");
        treeMap.put(50, "hij");
        treeMap.put(20, "cde");

        for (Map.Entry<Integer, String> mapEntry : treeMap.entrySet()){
            System.out.println(mapEntry.getKey() + ", " + mapEntry.getValue());
        }
    }

    public static void showHashTable(){

        Map<Integer, String>  hashTable = new Hashtable<Integer, String>();

        hashTable.put(10, "abc");
        hashTable.put(40, "cde");
        hashTable.put(30, "");
        hashTable.put(40, "");
        hashTable.put(40, "efg");
        hashTable.put(30, "cde");

        //hashTable.put(40, null);   gives an error message null exception as null is not allowed
        //either key or value cannot be null

        for (Map.Entry<Integer, String> mapEntry : hashTable.entrySet()){
            //hashTable.entrySet() will return one Map Entry at a time


            System.out.println(mapEntry.getKey() + ", " + mapEntry.getValue());
            //mapEntry.getKey() gets the key...  mapEntry.getValue() gets the value
        }

    }

}
/*Map.Entry() Efficiently accesses both key and value.
Clear and concise when both key and value are needed.
 */


/*
Map.Entry<Integer, String> mapEntry is the type and variable declaration for each element in the collection.
Here:
Map.Entry<Integer, String> specifies that each element is an entry in the map, consisting of an Integer key and a String value.
mapEntry is the variable that will hold the current entry from the map during each iteration of the loop.*/

/*
hashTable is the Hashtable we are iterating over.
.entrySet() is a method of the Map interface (and thus available to Hashtable, which implements Map) that returns a Set view of the map's entries.
 Each entry in this set is a Map.Entry object, which represents a key-value pair.
The entrySet() method provides a collection of all the key-value pairs contained in the map.
 */
