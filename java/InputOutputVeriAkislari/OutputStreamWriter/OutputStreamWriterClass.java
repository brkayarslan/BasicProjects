package InputOutputVeriAkislari.OutputStreamWriter;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class OutputStreamWriterClass {
    public static void main(String[] args) {
        String data = "ğüşi";
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("output.txt");
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);

            outputStreamWriter.write(data);
            outputStreamWriter.close();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
