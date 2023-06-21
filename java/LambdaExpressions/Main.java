package LambdaExpressions;


// Lambda Expression
//Lambda ifadesi ilk kez Java 8'de tanıtıldı. Ana amacı dilin ifade gücünü artırmaktı.
// Ancak, lambdalara başlamadan önce, Fonksiyonel Interface konusunu anlamamız gerekir.

//Functional Interface

//Function interface, içerisinde sadece bir tane abstract metodu olan interface’dir.
// Eğer ilgili interface’in türetildiği interface’de abstract metot varsa bu durumda da
// functional interface olur.

//Functional interface’ler, lambda expression’ların kullanılabilmesi için tanımlanırlar.

//Functional interface’ler tanımlanırken, @FunctionalInterface anotasyonu kullanması zorunlu
// değildir. Bu anotasyon sadece validasyon yapma amacıyla kullanılır.

//Eğer anotasyon eklenirse ve birden fazla abstract metot eklenmeye çalışılırsa, bu durumda
// compile error verecektir.

//Runnable interface'i fonksiyonel bir interface'dir.

public class Main {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello Word");
            }
        });
        t1.start();

        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable Sınıfı");
            }
        };
        r1.run();

        //Lambda Expression burada dahil oluyor

        Runnable r2 = () -> System.out.println("r2 çıktısı");
        r2.run();

        //r1 ve r2'nin kullanımı aynı

        Runnable r3 = () -> {
            System.out.println("r3 çalıştı");
        };
        r3.run();

        Matematik toplama = new Matematik() {
            @Override
            public int transaction(int a, int b) {
                return a+b;
            }
        } ;

        Matematik cikarma = new Matematik() {
            @Override
            public int transaction(int a, int b) {
                return a-b;
            }
        };

        Matematik carpma = new Matematik() {
            @Override
            public int transaction(int a, int b) {
                return a*b;
            }
        };
        Matematik bolme = new Matematik() {
            @Override
            public int transaction(int a, int b) {

                if (b == 0){
                    b = 1;
                }
                return a/b;
            }
        };
        System.out.println(toplama.transaction(10,2));
        System.out.println(carpma.transaction(8,4));
        //Üstteki zor bir kullanım
        //Lambda exprestion ile halledilebilir.

        Matematik toplam = (a,b) -> a+b;
        Matematik cikma = (a,b) -> a-b;
        Matematik carp = (a,b) -> a*b;
        Matematik bol = (a,b) -> {
         if (b == 0){
             b=1;
         }
         return a/b;
        };
        System.out.println(bol.transaction(8,4));
        System.out.println(cikma.transaction(84,3));
    }
}
