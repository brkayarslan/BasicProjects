package Enum;

public enum Day {
    PAZARTESI(1),
    SALI(2),
    CARSAMBA(3),
    PERSEMBE(4),
    CUMA(5),
    CUMARTESI(6),
    PAZAR(7);

    private int day;
    Day(int day) {
        this.day = day;
    }

    public int getDay() {
        return day;
    }

    public void getDayName(){
        String day = null;
        switch (this.day){
            case 1:
                day = "Pazartesi";
                break;
            case 2:
                day = "Salı";
                break;
            case 3:
                day = "Carsamba";

        }
        System.out.println(day);
    }
}
