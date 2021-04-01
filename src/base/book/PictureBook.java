package base.book;

public class PictureBook extends Book {

    private String illustrator;

    public PictureBook (String t, String a, String i) {
        super(t, a);
        this.illustrator = i;
    }

    @Override
    public void printBookInfo (){
        super.printBookInfo();
        System.out.print(" and illustrated by " + illustrator);
    }

}
