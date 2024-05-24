import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println();

        /**
         * Užpildant tuščia konstruktorių su seteriais, galima objekto elementus suformuoti tokius kokius norisi
         * Naudojant pilną konstruktorių, objekto elementai yra griežtai tipizuoti
         */
        Book bookA = new Book();
        bookA.setTitle("Sliekiaspurgio kelionė");
        bookA.setPages(212);
        bookA.setReleaseYear(2012);

        Book bookB = new Book();
        bookB.setTitle("Gamtos įkvėpti");
        bookB.setPages(278);
        bookB.setReleaseYear(2020);

        Book bookC = new Book();
        bookC.setTitle("Raizgiaus kelias");
        bookC.setPages(136);
        bookC.setReleaseYear(2006);

        System.out.println("======== Užpildyto tuščio konstruktoriaus rezultatas ========");
        bookA.listBook();
        bookB.listBook();
        bookC.listBook();

        // Sukuriamos knygos naudojant pilnus konstruktorius
        Book book1 = new Book("Žiedų valdovai", 2000, 1934);
        Book book2 = new Book("Raizgiaus kelias",136,2006);
        Book book3 = new Book("Šnipuko konservatorija ir paslaptys", 324, 2024);
        Book book4 = new Book("Tčkaus kelionė ir paslaptys", 136, 2024);

        book1.listBook();
        book2.listBook();
        book3.listBook();
        book4.listBook();

        ArrayList<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);

        // Prasukti ciklą per masyvą ir ištraukti visas knygas (naudojant geterius)
        for (Book book: books) {
            book.listBook();
            System.out.println(book.getPages() + book.getTitle());
            System.out.println(book);
        }

    }


}