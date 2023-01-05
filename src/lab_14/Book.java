package lab_14;

public abstract class Book {
    protected String name;
    protected String author;
    protected float price;

    protected abstract int insertBook(BookInfo book);
    protected abstract int updateBook(BookInfo book);
    protected abstract int deleteBook(BookInfo book);
}
