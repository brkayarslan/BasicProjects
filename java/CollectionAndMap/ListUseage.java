package CollectionAndMap;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListUseage {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(15);
        list.add(null);
        list.add(30);
        System.out.println(list);

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        for (Integer element: list) {
            System.out.println(element);
        }

        System.out.println("Liste boyutu: "+list.size());
        // get ile listeden eleman okuması yapılır. Okunan eleman listeden çıkartılmaz.
        System.out.println("4. eleman: "+list.get(3));

        System.out.println("15 kaçıncı indis: "+list.indexOf(15));

        //Araya eleman ekleme
        list.add(1,20);
        System.out.println(list);

        //conatins methodları. contains arama işlemi sağlar true false döndürür
        System.out.println("Contains: "+list.contains(15));

        //listeye liste ekleme
        List<Integer> list2 = new ArrayList<>();
        list2.addAll(list);
        System.out.println("Liste2: "+list2);


        //String tipinde elemanları tutan ArrayList initialize
        List<String> nameList = new ArrayList<String>();

        //İndis 0'dan başlayarak elemanları sırayla yerleştirir.
        nameList.add("Gamze");
        nameList.add("Elif");
        nameList.add("Mustafa");
        nameList.add("Umut");
        nameList.add("Umut");
        //ArrayList null değerli eleman tutabilir.
        nameList.add(null);

        //Tüm listeyi ekrana yazdırır.
        System.out.println(nameList);

        //size() metodu, Collection Interface'inden gelen bir mirastır.
        System.out.println("Size of list: " + nameList.size());

        // get ile listeden eleman okuması yapılır. Okunan eleman listeden çıkartılmaz.
        System.out.println("Element of 1 index: " + nameList.get(1));
        System.out.println("Element of 2 index: " + nameList.get(2));


        // Liste başından taramaya başlarayarak ilk geçen noktadaki Umut bilgisinin indis değerini verir.
        System.out.println("Index of 'Umut': " + nameList.indexOf("Umut"));

        // Liste sonundan taramaya başlayarak son geçen noktadaki Umut bilgisinin indis değerini verir.
        System.out.println("Index of 'Umut': " + nameList.lastIndexOf("Umut"));

        //add() fonksiyonuna ilk verilen argüman indis, sonraki elemandır.
        //Verilen indise gidip verilen elemanı koyar.
        //Verilen indiste daha önceden tanımlanmış değer varsa, fonksiyondaki elemanı o indise koyar ve geri kalan elemanları kaydırır.
        nameList.add(3, "Zeynep");

        //set() fonksiyonuna ilk verilen argüman indis, sonraki elemandır.
        //Verilen indise gidip verilen elemanı koyar.
        //Verilen indis, liste boyutunun dışında olmamalıdır.
        nameList.set(1, "Naz");


        // contains ile liste içinde aradığımız eleman var mı yok mu belirtir.
        // varsa true, yoksa false döner
        System.out.println(nameList.contains("Elif"));
        System.out.println(nameList.contains("Mustafa"));

        // remove fonksiyonu ile listeden belirttiğimiz indisteki değer silinir.
        // silinen değer fonksiyondan bize geri döndürülür.
        String firstElement = nameList.remove(0);
        System.out.println(firstElement + " is removed from list!");


        List<String> newNameList = new ArrayList<String>();
        newNameList.add("Batuhan");
        newNameList.add("Kemal");

        // bir listeyi tümüyle bir diğer listeye eklemek için "addAll" fonksiyonu kullanılır.
        nameList.addAll(newNameList);


        // listeden alt bir liste oluşturmak için "sublist" fonksiyonunu kullanırız.
        //Başlangıç ve bitiş indisleri verilir.
        //Başlangıç indisindeki eleman dahil, bitiş indisindeki eleman hariç yeni bir liste oluşturulur.
        List<String> subList = nameList.subList(4, 6);

        System.out.println("Sublist from name list");
        System.out.println(subList);


        // toArray fonksiyonu parametresiz çağırırsanız Object tipinde bir dizi döner.
        Object[] objectArray = nameList.toArray();

        // toArray fonksiyonuna hangi tipte bir dizi oluşturmak istiyorsak,
        // o tipten bir nesne üretip parametre olarak göndeririz.
        // String tipinden bir dizi almak istediğimiz için "new String[0]" şeklinde bir nesne üretip, "toArray" fonksiyonuna gönderdik.
        String[] stringArray = nameList.toArray(new String[0]);


        // listedeki tüm elemanları temizler. yani tümünü listeden siler.
        nameList.clear();
    }
}
