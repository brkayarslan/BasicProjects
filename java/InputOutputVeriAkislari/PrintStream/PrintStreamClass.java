package InputOutputVeriAkislari.PrintStream;


//tüm verileri metin veri (string) tipinde aktarmamızı sağlar
//output stream sınıfını genişletir.

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class PrintStreamClass {
    public static void main(String[] args) {
        System.out.print("Patika.Dev");
        try {
            PrintStream output = new PrintStream("src\\main\\java\\InputOutputVeriAkislari\\PrintStream\\print.txt");
            output.print(1231231232);
            output.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
