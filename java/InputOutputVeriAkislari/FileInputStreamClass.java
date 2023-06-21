package InputOutputVeriAkislari;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileInputStreamClass {

    public static void main(String[] args) {
        {
            try {
                // File dosya = new File("patika.txt");//1. yöntem zor
                FileInputStream inputStream = new FileInputStream("src\\patika.txt"); //2. yöntem kolay

                System.out.println("Kullanılabilir byte sayısı: "+inputStream.available());

                //dosya içersindekileri yazdırma
                int i = inputStream.read();
                while (i != -1){
                    System.out.print((char) i);
                    i = inputStream.read();
                }

                System.out.println("Kullanılabilir byte sayısı: "+inputStream.available());

                //işin bittiği yerde
                inputStream.close();

                //atlama işlemi
                inputStream.skip(10);//ilk 10 karakter atlanır.

            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

}
