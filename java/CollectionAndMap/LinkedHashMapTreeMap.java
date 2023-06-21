package CollectionAndMap;

import java.util.LinkedHashMap;
import java.util.TreeMap;

//LinkedHashMap
//
//
//Map arayüzünün Hashtable ve LinkedList özeliklerini içeren bir kılgısıdır. Dolayısıyla, bu yapıda döngü sırası öngörülebilir. Bu yapının HashMap yapısından önemli farkı öğelerini çift yönlü bağ ile birbirlerine bağlamasıdır. Bağlı liste olduğu için, döngü sırası öğelerin bağlı listedeki konumlarıdır. Tabii, öğelerin konumu listenin yaratılışında yerleştikleri sıradır.
//
//
//
//LinkedHashMap sınıfı HashMap sınıfının belirsiz sıralamasını önler, koleksiyonun öğelerine öngörülebilen bir sırada erişimi sağlar. Tabii, bu erişim sırasını, HashMap yapısını TreeMap yapısına dönüştürerek de sağlayabiliriz. Ama, genellikle, TreeMap yapısını kurmanın karmaşası (complexity) daha çoktur.

public class LinkedHashMapTreeMap {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> linkedHashMap = new LinkedHashMap<>();

        linkedHashMap.put(16,"Bursa");
        linkedHashMap.put(34,"İstanbul");
        linkedHashMap.put(6,"Ankara");
        linkedHashMap.put(1,"Adana");

        for (Integer a: linkedHashMap.keySet()) {
            System.out.print(a);
            System.out.println(" : "+linkedHashMap.get(a));
        }

        System.out.println("---------------------");

        TreeMap<Integer,String> treeMap = new TreeMap<>(new OrderByKey());

        //TreeMap için comperatora ihtiyacımız vardır.
        //Tersi için TreeMap<Integer,String> treeMap = new TreeMap<>(new CollectionAndMap.OrderByKey().reversed());
        treeMap.put(16,"Bursa");
        treeMap.put(34,"İstanbul");
        treeMap.put(6,"Ankara");
        treeMap.put(1,"Adana");


        for (Integer a: treeMap.keySet()) {
            System.out.print(a);
            System.out.println(" : "+treeMap.get(a));
        }

    }
}
