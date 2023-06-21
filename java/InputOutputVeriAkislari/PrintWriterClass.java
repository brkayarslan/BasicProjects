package InputOutputVeriAkislari;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterClass {
    public static void main(String[] args) {
        String data = "Merhaba dünya";
        try {
            PrintWriter writer = new PrintWriter("C:\\Users\\user\\Desktop\\JavaLearning\\src\\patika.txt");
            writer.write(data);
            writer.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
