public class BookIterator implements Iterator {
    Book[] bookList;
    int list;

    {
        list = 0;
    }

    public BookIterator(Book[] bookList) {
        this.bookList = bookList;
    }

    @Override
    public boolean hasNext() {
        return list < bookList.length &&
                bookList[list] != null;
    }

    @Override
    public Object next() {
        Book book = bookList[list];
        list += 1;
        return book;
    }
}
