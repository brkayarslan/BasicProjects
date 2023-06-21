package InputOutputVeriAkislari;


import java.io.*;

//Kullanılan diğer streamleri daha hızlı kullanmak için tampon görevi gören bir yapıdır.
public class BufferedStreamClass {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("src\\patika.txt");
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);

            int i = bufferedInputStream.read();
            while (i != -1){
                System.out.print((char) i);
                i = bufferedInputStream.read();
            }

            fileInputStream.close();
            bufferedInputStream.close();

            String data = "Java 102 Patikasi Buffered Stream";

            FileOutputStream fileOutputStream = new FileOutputStream("src\\patika.txt",true);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);

            byte[] bytes = data.getBytes();

            bufferedOutputStream.write(bytes);
            bufferedOutputStream.close();
            fileOutputStream.close();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
