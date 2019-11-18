package countingTime;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import java.util.ArrayList;

public class SpeedCollection {

    public static void main(String[] args) {


//
//        List<Integer> list = new ArrayList<Integer>();
//        for(int n =0; n< 8000000; n++){
//            list.add(n);
//        }
//        System.out.println(list.size());
//
//
//        long begin = System.currentTimeMillis();
//        list.remove(list.size()-1);
//        long end = System.currentTimeMillis();
//
//        System.out.println(end - begin );
//
//        begin = System.currentTimeMillis();
//        list.remove(0);
//        end = System.currentTimeMillis();
//
//        System.out.println(end - begin);


        List books = new LinkedList<Book>();

        for (int i = 0; i < 3000000; i++) {
            books.add(new Book("Konrad", "cos"));
        }

        System.out.println(books.size());

        long begin = System.currentTimeMillis();
        books.add(0, new Book("autor jakis", " tytul"));
        long end = System.currentTimeMillis();
        System.out.println(end - begin + "ms");


        HashMap<Integer, Book> listOfBooks = new HashMap<>();


        for(int n = 0; n < 6000000; n++){
            listOfBooks.put(n, new Book("author", "tytuł"));
        }
         begin = System.nanoTime();
      listOfBooks.remove(300495);
      end = System.nanoTime();

        System.out.println(end - begin);
        System.out.println(listOfBooks.size());

    }


}
