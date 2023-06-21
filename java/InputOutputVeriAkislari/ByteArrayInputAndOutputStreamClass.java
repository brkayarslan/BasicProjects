package InputOutputVeriAkislari;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ByteArrayInputAndOutputStreamClass {
    public static void main(String[] args) {
        byte[] dizi = {1,2,3,4,54,66};
        ByteArrayInputStream inputStream = new ByteArrayInputStream(dizi);
        // Dizinin bir bölümünü okuyan bir ByteArrayInputStream oluşturur ByteArrayInputStream input = new ByteArrayInputStream(byte[] arr, int start, int length);
        System.out.println("Kullanılabilen byte sayısı: "+inputStream.available());
        int i = inputStream.read();
        while (i!=-1){
            System.out.println(i);
            i = inputStream.read();
        }

        try {
            inputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        //byteoutputstream

        String data = "Java 102 Dersleri";
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        byte[] dataByteArray = data.getBytes();
        try {
            outputStream.write(dataByteArray);
            String newData = outputStream.toString();
            System.out.println("Çıkış Akışı : "+newData);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
