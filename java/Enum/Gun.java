package Enum;


//Zor olan enum kullanımı
public class Gun {
    public static final Gun PAZARTESI = new Gun(1);
    public static final Gun SALI = new Gun(2);
    public static final Gun CARSAMBA = new Gun(3);
    public static final Gun PERSEMBE = new Gun(4);
    public static final Gun CUMA = new Gun(5);
    public static final Gun CUMARTESI = new Gun(6);
    public static final Gun PAZAR = new Gun(7);

    private final int day;

    private Gun(int f) {
        this.day = f;
    }

    public int getDay() {
        return day;
    }
}
