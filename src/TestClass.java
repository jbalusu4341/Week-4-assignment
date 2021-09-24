public class TestClass {
    public static void main(String[] args) {
        BooksCollection books = new BooksCollection();
        BookList book = new BookList(books);
        book.printBookList();
    }
}
