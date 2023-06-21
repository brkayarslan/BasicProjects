package InputOutputVeriAkislari;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

//
public class InputStreamReaderClass {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("src\\main\\java\\InputOutputVeriAkislari\\patika.txt");

            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream,  "UTF-8");
            System.out.println(inputStreamReader.getEncoding()); //karakter seti

            int i = inputStreamReader.read();
            while (i != -1){
                System.out.print((char) i);
                i = inputStreamReader.read();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
