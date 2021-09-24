public class BooksCollection implements Pages {
    static final int number = 10;
    int items;
    Book[] bookList;

    public BooksCollection() {
        bookList = new Book[number];

        addBook("JAVA Book 4th Edition");
        addBook("DSA Book 5th Edition");
        addBook("C language Book 6th Edition");
        addBook("C++ Book 7th Edition");
        addBook("C# Book 8th Edition");
        addBook("Python Book 9th Edition");
        addBook("C Sharp language Book 10th Edition");
        addBook("JAVASCRIPT Book 11th Edition");
        addBook("HTML Book 12th Edition");
        addBook("CSS Book 13th Edition");
        items = 0;
    }

    public void addBook(String name) {
        Book book;
        book = new Book(name);
        if (items >= number)
            System.err.println("Full");
        else {
            bookList[items] = book;
            items++;
        }
    }

    public Iterator createIterator() {
        return new BookIterator(bookList);
    }

    @Override
    public Iterator getIterator() {
        return null;
    }
}
