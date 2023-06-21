package Enum;


//Enum Sınıfı
//
//
//Java’da Enum türleri önceden tanımlanmış sabit değerleri ifade etmek için kullanılır.
// Mesela en klasik örnek haftanın günleri. Bir haftanın kaç gün olduğu ve hangi günlerden
// oluştuğu bilindiğine göre bunu aşağıdaki gibi bir sınıfla ifade edebiliriz.
public class Main {
    public static void main(String[] args) {
        System.out.println(Day.CARSAMBA.getDay());
        Day.CARSAMBA.getDayName();
    }
}
