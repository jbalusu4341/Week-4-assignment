public class BookList {
    BooksCollection books;

    public BookList(BooksCollection books) {
        this.books = books;
    }

    public void printBookList() {
        Iterator iterator = books.createIterator();
        System.out.println("\" LIST OF BOOKS \"");
        System.out.println();
        while (iterator.hasNext()) {
            Book list = (Book) iterator.next();
            System.out.println(list.getBook());
        }
    }
}
