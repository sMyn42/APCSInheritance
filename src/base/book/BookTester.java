package base.book;

import java.util.ArrayList;

public class BookTester {

    public static void main (String[] args){

        //Part B

        ArrayList<Book> myLibrary = new ArrayList<Book>();
        /* missing code */
        Book book1 = new Book("Frankenstein", "Mary Shelley");
        Book book2 = new PictureBook("The Wonderful Wizard of Oz", "L. Frank Baum", "W.W. Denslow");
        /* end missing code */
        myLibrary.add(book1);
        myLibrary.add(book2);

        //END Part B

        //Test

        for (Book b: myLibrary){
            b.printBookInfo();
            System.out.println();
        }

        //End Test

        //Part C - Testing Book Listing

        BookListing listing1 = new BookListing(book1, 10.99);
        listing1.printDescription();

        System.out.println();

        BookListing listing2 = new BookListing(book2, 12.99);
        listing2.printDescription();

    }

}
