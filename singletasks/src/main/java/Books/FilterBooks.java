package Books;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class FilterBooks {

    public static void main(String[] args) {

        Books books = new Books(1990, "cos", "author");
        Books books1 = new Books(1990, "cos", "author");
        Books books2 = new Books(1992, "cos", "author");
        Books books3 = new Books(2004, "cos", "author");
        Books books4 = new Books(2007, "cos", "author");

        HashSet<Books> booksHashSet = new HashSet<>();
        booksHashSet.add(books);
        booksHashSet.add(books1);
        booksHashSet.add(books2);
        booksHashSet.add(books3);
        booksHashSet.add(books4);


        Iterator<Books> iteratorBooks = booksHashSet.iterator();

        while (iteratorBooks.hasNext()) {

            Books currentBook = iteratorBooks.next();
            System.out.println(currentBook);
        }
        for (Books book : booksHashSet) {
            if (book.getYearOfRelease() < 2010)
                System.out.println(book);

        }
    }

}
