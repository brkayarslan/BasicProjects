package TipDonusumleri;

public class Main {
    public static void main(String[] args) {
        //Widening Casting (Otomatik)
        int a = 10;
        double b = a;
        System.out.println(b);


        //Narrowing Casting (Manuel)
        double pi = 3.14;
        int c = (int) pi;
        System.out.println(c);
        System.out.println((int) pi);

        byte d = 80;
        System.out.println((char) d);

        int e = 20;
        System.out.println(e);
        String str = String.valueOf(e);
        System.out.println(str+5);
        int f = Integer.parseInt(str);
        System.out.println(f+5);

    }
}
