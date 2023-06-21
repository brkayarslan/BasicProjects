package InputOutputVeriAkislari;

import java.io.File;
import java.io.IOException;

public class FileEx {
    public static void main(String[] args) {

        //dosya oluşturma. ana dizinde oluşturur
        File file = new File("patika.txt");
        try {
            if(file.createNewFile()){
                System.out.println(file.getName());
            }else {
                System.out.println(file.getName()+ " dosyası zaten mevcut");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());;
        }

        //belirtilen dizinde oluşturur
        File dosya = new File("src/patika.txt");
        try {
            dosya.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //dosyayı silme
        file.delete();

        //klasör oluşturma
        File dizin = new File("test");
        dizin.mkdir();
        //oluşturulan klasöre dosya ekleme
        File newFile = new File("test/patika.txt");
        try {
            newFile.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //olmayan dizinleride oluşturan method
        File newDizin = new File("patika/dev");
        newDizin.mkdirs();

        //klasör içindekileri listeleme
        File dizin1 = new File("test");
        for (String s : dizin.list()){
            System.out.println(s);
        }
    }


}
