public class Book {
    private String title;
    private int pages;
    private int year;

    public Book (String title, int pages, int year) {
        this.title = title;
        this.pages = pages;
        this.year = year;
    }

    public Book () {
        this.title = null;
        this.pages = 0;
        this.year = 0;
    }
    public Book (String title) {
        this.title = title;
        this.pages = 0;
        this.year = 0;
    }

    public Book (int pages, int year) {
        this.title = null;
        this.pages = pages;
        this.year = year;
    }

    public Book (String title, int year) {
        this.title = title;
        this.pages = 0;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public int getPages() {
        return pages;
    }

    public int getYear() {
        return year;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return getTitle() + ", " + getPages() + " pages, " + getYear();
    }
}
