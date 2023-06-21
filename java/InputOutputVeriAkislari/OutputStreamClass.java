package InputOutputVeriAkislari;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class OutputStreamClass {
    public static void main(String[] args) {
        String metin = "\nOutput Stream öğreniyorum.\n Patika dev";
        try {
            FileOutputStream outputStream = new FileOutputStream("src/patika.txt",true);//append true olmazssa dosyanın içindeki verileri siler
            byte[] yaziByte = metin.getBytes();
            outputStream.write(yaziByte);
            outputStream.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
