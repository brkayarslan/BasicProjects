package CollectionAndMap;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetEx {
    public static void main(String[] args) {
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(10);
        linkedHashSet.add(10);
        linkedHashSet.add(40);
        linkedHashSet.add(30);
        linkedHashSet.add(50);

        Iterator <Integer> iterator = linkedHashSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
