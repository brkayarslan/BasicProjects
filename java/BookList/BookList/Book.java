package BookList;

import java.util.Date;

public class Book {
    private String name;
    private int pageNumber;
    private String author;
    private Date releaseDate;

    public Book(String name, int pageNumber, String author, Date releaseDate) {
        this.name = name;
        this.pageNumber = pageNumber;
        this.author = author;
        this.releaseDate = releaseDate;
    }

    public String getName() {
        return name;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public String getAuthor() {
        return author;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }
}
