package PatikaStore;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Brand> brands = new ArrayList<>();
        brands.add(new Brand(1,"Samsung"));
        brands.add(new Brand(2,"Xiaomi"));
        brands.add(new Brand(3,"Casper"));
        brands.add(new Brand(4,"Hp"));
        brands.add(new Brand(5,"Huawei"));
        brands.add(new Brand(6,"Apple"));
        brands.add(new Brand(7,"Asus"));
        brands.add(new Brand(8,"Monster"));
        brands.add(new Brand(9,"Lenovo"));
        brands.add(new Brand(10,"Philips"));
        brands.add(new Brand(11,"LG"));

        ArrayList<SmartPhone> smartPhones = new ArrayList<>();
        smartPhones.add(new SmartPhone(1,3199,10,150,"SAMSUNG GALAXY A51",brands.get(0),16,4.7,2,"Siyah",4000));
        smartPhones.add(new SmartPhone(2,7379,15,300,"iPhone 11 64 GB",brands.get(5),64,6.1,6,"Mavi",3046));
        smartPhones.add(new SmartPhone(3,4012,5,240,"Redmi Note 10 Pro 8GB",brands.get(4),32,6.5,12,"Beyaz",5000));

        ArrayList<Television> televisions = new ArrayList<>();
        televisions.add(new Television(1,7000,8,500,"Samsung UE50BU8100UXTK  ",brands.get(0),32,50,16,"Gri"));
        televisions.add(new Television(2,9499,3,100,"PHILIPS 50PUS8807",brands.get(9),16,55,8,"Siyah"));
        televisions.add(new Television(3,12499,10,200,"LG 43UQ75006LF",brands.get(10),8,43,8,"Beyaz"));


        System.out.println("PatikaStore Ürün Yönetim Paneli !");
        System.out.println("1 - Televizyon İşlemleri");
        System.out.println("2 - Cep Telefonu İşlemleri");
        System.out.println("3 - Marka Listele");
        int a = scanner.nextInt();
        while (a != 4){
            switch (a){
                case 0:
                    System.out.println("PatikaStore Ürün Yönetim Paneli !");
                    System.out.println("1 - Televizyon İşlemleri");
                    System.out.println("2 - Cep Telefonu İşlemleri");
                    System.out.println("3 - Marka Listele");
                    a = scanner.nextInt();
                    continue;
                case 1:
                    System.out.println("| ID | Ürün Adı                      | Fiyat     | Marka     | Depolama  | Ekran     | RAM         |");
                    for (Television television : televisions){
                        System.out.printf("| %-3d| %-30s| %-10d| %-10s| %-10d| %.1f| %-12d|\n",
                                television.getId(), television.getName(), television.getPrice(), television.getBrand().getName(),
                                television.getMemory(), television.getScreenSize(), television.getRam());
                }
                    System.out.println("0 - Ana sayfa");
                    System.out.println("4 - Çıkış");
                    a = scanner.nextInt();
                    continue;
                case 2:
                    System.out.println("| ID | Ürün Adı                      | Fiyat     | Marka     | Depolama  | Ekran     | Pil       | RAM       | Renk      |");
                    for (SmartPhone smartPhone: smartPhones){
                        System.out.printf("| %-3d| %-30s| %-10.1f| %-10s| %-10d| %-10.1f| %-10d| %-10d| %-10s|\n",
                                smartPhone.getId(), smartPhone.getName(), (double)smartPhone.getPrice(), smartPhone.getBrand().getName(),
                                smartPhone.getMemory(), smartPhone.getScreenSize(),  smartPhone.getBattery(),
                                smartPhone.getRam(), smartPhone.getColour());
                }
                    System.out.println("0 - Ana sayfa");
                    System.out.println("4 - Çıkış");
                    a = scanner.nextInt();
                    continue;
                case 3: Collections.sort(brands, new Comparator<Brand>() {
                    public int compare(Brand brand1, Brand brand2) {
                        return brand1.getName().compareTo(brand2.getName());
                    }
                });

                    for (Brand brand : brands) {
                        System.out.println(brand.getName());
                    }
                    System.out.println("0 - Ana sayfa");
                    System.out.println("4 - Çıkış");
                    a = scanner.nextInt();
                    continue;

            }
        }
    }
}
