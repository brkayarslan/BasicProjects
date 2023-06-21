package InputOutputVeriAkislari;

import java.io.*;

public class BufferedReaderClass {

    //tamponlama, destekleme
    //büyük verileri okumayı sağlar
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("C:\\Users\\user\\Desktop\\JavaLearning\\src\\patika.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            bufferedReader.lines();
            while ((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        try {
            FileWriter fileWriter = new FileWriter("C:\\Users\\user\\Desktop\\JavaLearning\\src\\patika.txt",true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            String data = "BufferWriter ve fileWriter kullanıyorum";
            bufferedWriter.write(data);
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
