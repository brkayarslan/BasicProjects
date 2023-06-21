package InputOutputVeriAkislari;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class FileReaderClass        {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("C:\\Users\\user\\Desktop\\JavaLearning\\src\\patika.txt");
            int i = fileReader.read();
            while (i != -1){
                System.out.print((char) i);
                i = fileReader.read();
            }
            fileReader.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        String data = "Merhaba, dünya";
        try {
            FileWriter fileWriter = new FileWriter("C:\\Users\\user\\Desktop\\JavaLearning\\src\\patika.txt",true);
            fileWriter.write(data);
            fileWriter.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}



