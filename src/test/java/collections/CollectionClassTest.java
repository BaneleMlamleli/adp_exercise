package collections;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class CollectionClassTest {

    @Test
    public void implementCollection(){
        Map map = new HashMap();
        map.put("Banele", "8");
        map.put("Hendrick", "31");
        map.put("Shaun", "12");
        map.put("Mlamleli", "14");

        Assert.assertEquals("[Banele, Mlamleli, Hendrick, Shaun]", map.keySet().toString());
    }

    @Test
    public void implementLinkedList(){
        // creating an instance of the LinkedList collection
        LinkedList<String> linkedList = new LinkedList<>();
        // adding values/elements into our list
        linkedList.add("Banele");
        linkedList.add("Hendrick");
        linkedList.add("Shaun");
        linkedList.add("Mlamleli");

        Assert.assertEquals("[Banele, Hendrick, Shaun, Mlamleli]", linkedList.toString());
    }

    @Test
    public void implementSet(){
        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);

        Assert.assertEquals("[50, 20, 40, 10, 30]", set.toString());
    }

    @Test
    public void implementMap(){
        TreeMap<Integer, String> treeMap = new TreeMap();
        treeMap.put(0, "Banele");
        treeMap.put(1, "Hendrick");
        treeMap.put(2, "Shaun");
        treeMap.put(3, "Mlamleli");

        Assert.assertEquals("[0, 1, 2, 3]", treeMap.keySet().toString());
    }
}
