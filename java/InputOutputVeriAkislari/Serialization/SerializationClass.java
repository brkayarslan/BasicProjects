package InputOutputVeriAkislari.Serialization;

//Nesne okuma

import java.io.*;

public class SerializationClass {
    public static void main(String[] args) {
        Car c1 = new Car("Audi","A3"); //üretilen nesnenin sınıfı serializable implement edilmeli

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\user\\Desktop\\JavaLearning\\src\\main\\java\\InputOutputVeriAkislari\\Serialization\\araba.txt");
            ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);//üreteceğimiz outpt hangi dosyada olacak
            outputStream.writeObject(c1); //c1 nesnesini dosyanın içine kaydettik
            outputStream.close();

            FileInputStream fileInputStream = new FileInputStream("src\\main\\java\\InputOutputVeriAkislari\\Serialization\\araba.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            Car newCar = (Car) objectInputStream.readObject();
            System.out.println(newCar.getBrand());
            System.out.println(newCar.getModel());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
