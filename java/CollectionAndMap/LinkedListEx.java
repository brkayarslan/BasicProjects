package CollectionAndMap;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListEx {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Berkay");
        list.add("Elif");
        list.add("Mustafa");
        list.add("Cengiz");

        Iterator<String> itr = list.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        for (String str: list) {
            System.out.println(str);
        }
    }
}
