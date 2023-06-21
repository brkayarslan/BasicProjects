package CollectionAndMap;

import java.util.Iterator;
import java.util.Vector;

public class VectorEx {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("Ankara");
        vector.add("İstanbul");
        vector.add("Bursa");
        vector.add("İzmir");

        vector.add(2,"Bolu");
        System.out.println(vector.contains("Ankara"));

        Iterator<String> itr = vector.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
