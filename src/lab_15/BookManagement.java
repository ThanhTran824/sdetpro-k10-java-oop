package lab_15;

import java.util.List;

public class BookManagement {
    public static void main(String[] args) {
        String projectLocation = System.getProperty("user.dir");
        String relativeFilePath = "\\src\\lab_15\\book.txt";
        String absoluteFilePath = projectLocation.concat(relativeFilePath);

        List<Book> currentBookList = BookFactory.convertDataIntoList(absoluteFilePath);

        boolean isContinuing = true;
        while (isContinuing) {
            BookMenuOption.printMenuOption();
            int selectedOption = BookMenuOption.selectMenuOption();
            switch (selectedOption) {
                case 0:
                    isContinuing = false;
                    break;
                case 1:
                    BookListHandling.addNewBook(currentBookList);
                    BookFactory.saveBookList(currentBookList, absoluteFilePath);
                    break;
                case 2:
                    String ISBNToFindBook = BookListHandling.inputTheISBNToSearch();
                    BookListHandling.findABookByISBN(ISBNToFindBook, currentBookList);
                    break;
                case 3:
                    String ISBNToUpdate = BookListHandling.inputTheISBNToSearch();
                    BookListHandling.updateABookViaISBN(ISBNToUpdate, currentBookList);
                    BookFactory.saveBookList(currentBookList, absoluteFilePath);
                    break;
                case 4:
                    String ISBNToDelete = BookListHandling.inputTheISBNToSearch();
                    BookListHandling.deleteABookViaISBN(ISBNToDelete, currentBookList);
                    BookFactory.saveBookList(currentBookList, absoluteFilePath);
                    break;
                case 5:
                    BookListHandling.printBookList(currentBookList);
                    break;
                default:
                    System.out.println("Please choose correct menu option!");
            }
        }

    }
}
