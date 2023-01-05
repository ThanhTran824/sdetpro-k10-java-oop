package lab_14;

import com.sun.org.apache.xpath.internal.operations.Bool;

public class BookInfo extends Book {

    public BookInfo(String name, String author, float price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public int insertBook(BookInfo book) {
        return 1;
    }

    public int updateBook(BookInfo book) {
        return 1;
    }

    public int deleteBook(BookInfo book) {
        return 1;
    }

}
