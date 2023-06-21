package StreamAPI;

//Stream API
//
//
//JDK 8 ile lambda ifadelerinin Java’ya eklenmesi üzerine, yine bununla ilintili olarak
// Stream API yazılmıştır. Basitçe söylemek gerekirse, koleksiyonlar üzerinde lambda ifadeleri
// kullanarak işlem yapmamızı sağlayan metotlar eklemiştir.
//
//
//
//Stream, akış demektir. Nesnelerin art arda gelmesiyle bir akış oluşur. Akış yaratarak, bir
// dizi veya koleksiyonun elemanları üzerinde işlemler yapabiliriz. Akışlar, verinin nasıl
// depolanacağıyla ilgilenmez, yalnızca veriyi bir yerden bir yere transfer eder. Bu transfer
// esnasında veri üzerinde bir veya birden fazla işlem yapılması muhtemeldir. Bu işlem verinin
// filtrelenmesi, sıralanması veya dönüştürülmesi gibi işlemler olabilir. Bu işlem, akışın
// kaynağını değiştirmez; fakat yeni bir akış oluşturur. Örneğin, bir akışın içindeki nesneleri
// sıralarsanız, kaynak değişmez; fakat sıralı nesnelerden oluşan yeni bir akış yaratılır.
//
//
//
//JDK 8 ile akışları, Stream türünde bir nesne olarak ifade edebiliriz. Stream API çok
// kapsamlı bir konu olsa da biz yalnızca koleksiyonlar üzerinde yapılan işlemleri inceleyeceğiz.

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(25);
        list.add(12);
        list.add(3);
        list.add(89);
        list.add(25);
        list.add(44);
        list.add(100);
        list.add(7);
        list.add(63);

        //Normal gösterim
        for (int i : list) {
            System.out.println(i);
        }

        //Stream API
        list.stream().forEach(i -> System.out.println(i));
        //Aynı şekilde
        list.forEach(i -> System.out.println(i));

        //elemanları filtreleme
        //60tan büyükleri gösterme
        list.stream().filter(num -> num > 60).forEach(num -> System.out.println(num));

        //distinct metodu her eleman en fazla 1 kez yer alır
        list.stream().distinct().forEach(num -> System.out.println(num));

        //sorted() otomatik sıralama
        list.stream().sorted().forEach(num -> System.out.println(num));
        list.stream().distinct().distinct().forEach(num -> System.out.println(num));
        //Tersten sıralama
        list.stream().distinct().sorted(Comparator.reverseOrder()).forEach(num -> System.out.println(num));

        //limit() bellirlenen sayıda ilk elemanları yazdırır
        list.stream().limit(5).forEach(num -> System.out.println(num));

        //skip() belirtilen kadar eleman atlar
        list.stream().skip(3).forEach(num -> System.out.println(num));

        //count() eleman sayısı öğrenir
        long c = list.stream().skip(3).limit(5).count();

        //anyMatch() sorgulama yapılır
        //ör: listede 25 var mı?
        boolean control = list.stream().anyMatch(i -> i == 25);
        System.out.println(control);

        //allMatch() hepsini kontrol eder
        boolean controll = list.stream().allMatch(i -> i == 25);
        System.out.println(controll);

        //hiçbirinin gerçekleşmeme olayı
        boolean controlll = list.stream().noneMatch(i -> i == 25);
        System.out.println(controlll);

        //map akışın elemanlarını değiştirmek için kullanılır
        list.stream().map(i -> Math.sqrt(i)).forEach(i -> System.out.println(i));
    }
}
