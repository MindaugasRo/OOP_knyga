public class Book {
    private String title;
    public int pages;
    public int releaseYear; //2024

    // Tuščias konstruktorius
    public Book (){

    }

    public Book(String title, int pages, int releaseYear) {
        this.title = title;
        this.pages = pages;
        this.releaseYear = releaseYear;
    }

//    @Override
//    public String toString() {
//        return "Book{" +
//                "title='" + title + '\'' +
//                ", pages=" + pages +
//                ", releaseYear=" + releaseYear +
//                '}';
//    }
    // Seteriai
    public void setTitle(String title) {
        this.title = title;
    }
    public void setPages(int pages) {
        this.pages = pages;
    }
    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    // Geteriai
    public void getTitle(String title) {
        this.title = title;
    }
    public void getPages(int pages) {
        this.pages = pages;
    }
    public void getReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void listBook() {
        System.out.println("-------------");
        System.out.println("Title: " + this.title);
        System.out.println("Pages: " + this.pages);
        System.out.println("Release yers: " + this.releaseYear);
        System.out.println("");
    }
}
