package base.book;

public class BookListing {

    private Book listedBook;
    private double cost;

    public BookListing (Book b, double c) {
        listedBook = b;
        cost = c;
    }

    public void printDescription() {
        listedBook.printBookInfo();
        System.out.print(", $" + cost);
    }

}
