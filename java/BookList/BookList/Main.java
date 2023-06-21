package BookList;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("Kürk Mantolu Madonna", 285, "Sabahattin Ali", new Date(2003, Calendar.JULY, 20)));
        books.add(new Book("Kırmızı Saçlı Kadın", 568, "Orhan Pamuk", new Date(1984, Calendar.MARCH, 10)));
        books.add(new Book("Havvanın 3 Kızı", 716, "Elif Safak", new Date(1995, Calendar.JANUARY, 5)));
        books.add(new Book("Küçük Prens", 98, "Antonie", new Date(2003, Calendar.JUNE, 8)));
        books.add(new Book("Hayvanlardan Tanrılara", 59, "Yuval Noah", new Date(2012, Calendar.NOVEMBER, 5)));
        books.add(new Book("İçimdeki Seytan", 812, "Sabahattin Ali", new Date(2018, Calendar.DECEMBER, 25)));
        books.add(new Book("Kahve Kokulu Hikayeler", 288, "Kolektif", new Date(2020, Calendar.AUGUST, 20)));
        books.add(new Book("Kelebeğin Hayat Sırları", 349, "Nil Karaibrahimgil", new Date(2005, Calendar.APRIL, 29)));
        books.add(new Book("1984", 431, "George Orwell", new Date(1984, Calendar.MAY, 18)));
        books.add(new Book("Hayvan Çiftliği", 930, "George Orwell", new Date(1985, Calendar.DECEMBER, 7)));

        // Kitap isminin karşısında yazar ismi olan bir Map oluşturma
        Map<String, String> bookMap = books.stream()
                .collect(HashMap::new, (map, book) -> map.put(book.getName(), book.getAuthor()), HashMap::putAll);

        for (Map.Entry<String, String> entry : bookMap.entrySet()) {
            System.out.println("Kitap: " + entry.getKey() + ", Yazar: " + entry.getValue());
        }

        List<Book> filteredBooks = books.stream().filter(book -> book.getPageNumber() > 100 ).toList();

        for (Book book : filteredBooks) {
            System.out.println("Kitap: " + book.getName() + ", Sayfa Sayısı: " + book.getPageNumber() );
        }
    }
}