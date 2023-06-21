package PatikaStore;

public class SmartPhone extends Product{

    private int battery;

    public SmartPhone(int id, int price, int discount, int stock, String name, Brand brand, int memory, double screenSize, int ram, String colour, int battery) {
        super(id, price, discount, stock, name, brand, memory, screenSize, ram, colour);
        this.battery = battery;
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }
}
