package collections;

import java.util.*;

public class CollectionClass {

    // This method implements Collection
    public void implementCollection(){
        Map map = new HashMap();
        map.put("Banele", "8");
        map.put("Hendrick", "31");
        map.put("Shaun", "12");
        map.put("Mlamleli", "14");

        System.out.println("\nMap elements/values\n====================");
        System.out.println(map);
    }

    // This method implements List
    public void implementLinkedList(){
        // creating an instance of the LinkedList collection
        LinkedList<String> linkedList = new LinkedList<>();
        // adding values/elements into our list
        linkedList.add("Banele");
        linkedList.add("Hendrick");
        linkedList.add("Shaun");
        linkedList.add("Mlamleli");

        // Using iterator to traverse through the list
        Iterator<String> iterator = linkedList.iterator();

        // traversing through the list and displaying all the values
        System.out.println("\nLinkedList elements/values\n=========================");
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    // This method implements Set
    public void implementSet(){
        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);

        Iterator<Integer> iterator = set.iterator();
        System.out.println("\nHashMap elements/values\n=========================");
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    // This method implements Map
    public void implementMap(){
        TreeMap<Integer, String> treeMap = new TreeMap();
        treeMap.put(0, "Banele");
        treeMap.put(1, "Hendrick");
        treeMap.put(2, "Shaun");
        treeMap.put(3, "Mlamleli");

        System.out.println("\nTreeMap elements/values\n=========================");
        System.out.println("Key, Value");
        for(Map.Entry m:treeMap.entrySet()){
            System.out.println(m.getKey() + ", " + m.getValue());
        }
    }
}
