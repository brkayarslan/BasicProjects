package CollectionAndMap.BookOrder;

import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Book> books = new TreeSet<>();
        books.add(new Book("Üç kedi",154,"Ahmet","01.11.2000"));
        books.add(new Book("Aslan Avı",154,"Ahmet","01.11.2000"));
        books.add(new Book("Akıl ve Tutku",154,"Ahmet","01.11.2000"));
        books.add(new Book("Leylayı Bulmak",154,"Ahmet","01.11.2000"));
        books.add(new Book("O an",154,"Ahmet","01.11.2000"));

        for (Book b: books) {
            System.out.println(b);
        }
    }
}
