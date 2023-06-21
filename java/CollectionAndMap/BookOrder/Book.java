package CollectionAndMap.BookOrder;

public class Book implements Comparable<Book>{

    private String title;
    private int pageCount;
    private String authorName;
    private String publicationDate;

    public Book(String title, int pageCount, String authorName, String publicationDate) {
        this.title = title;
        this.pageCount = pageCount;
        this.authorName = authorName;
        this.publicationDate = publicationDate;
    }


    @Override
    public int compareTo(Book other) {
        return this.title.compareTo(other.title);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", pageCount=" + pageCount +
                ", authorName='" + authorName + '\'' +
                ", publicationDate='" + publicationDate + '\'' +
                '}';
    }


}
