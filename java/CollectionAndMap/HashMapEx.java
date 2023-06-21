package CollectionAndMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {

    //Map ve HashMap
    //
    //
    //Map Interface somut sınıflarındandır. HashMap sınıfına, karışık eşleme de denilebilir. Eşleme tablosuna eleman ekleme, çıkartma işlemlerinde ve anahtarı verilen elemanı tabloda bulma işlemlerinde oldukça etkilidir.
    //
    //
    //
    //Map Interface’i kullanan sınıflar aşağıdaki metodlara sahiptir;
    //
    //
    //
    //clear: Map içinde bulunan bütün değerleri siler.
    //
    //
    //containsKey (Object key): Belli bir anahtar daha önceden girilmiş mi sorgular.
    //
    //
    //containsValue (Object value):Belli bir obje daha önceden girilmiş mi sorgular.
    //
    //
    //get (Object key): Anahtara karşılık gelen objeyi döndürür.
    //
    //
    //put (Object key, Object value): Anahtar — değer ikilisini kayıt eder.
    //
    //
    //remove (Object key):Belli bir anahtara karşılık gelen değeri siler.
    //
    //
    //size: O zaman kadar kayıt edilmiş anahtar — değer ikili sayısını verir.

    public static void main(String[] args) {
        HashMap<String,String> country = new HashMap<>();

        country.put("TR","Türkiye");
        country.put("GR","Almanya");
        country.put("EN","İngiltere");

        System.out.println(country.get("TR"));

        country.remove("EN");

        System.out.println(country.get("EN"));
        System.out.println(country.size());

        country.put("US","Amerika");

        //sıralamanın garantisi yoktur.
        for (String countryKey: country.keySet()) {
            System.out.println(countryKey);
        }

        for (String countryValue : country.values()){
            System.out.println(countryValue);
        }

        country.clear();
    }
}
