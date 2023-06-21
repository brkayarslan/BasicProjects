package CollectionAndMap;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx {
    public static void main(String[] args) {

        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(10);
        hashSet.add(null);
        hashSet.add(25);
        hashSet.add(15);


        System.out.println(hashSet.size());
        System.out.println(hashSet.contains(25));

        for (Integer a: hashSet) {
            System.out.println(a);
        }


        // Iterator collextionlarda gezmeye yarayan yapıdır.
        Iterator<Integer> itr = hashSet.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        hashSet.clear();
    }
}
