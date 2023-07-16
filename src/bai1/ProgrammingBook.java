package bai1;

public class ProgrammingBook extends Book{
    public String language;
    public String framework;

    public ProgrammingBook() {
    }

    public ProgrammingBook(int bookCode, String name, double price, String author, String language, String framework) {
        super(bookCode, name, price, author);
        this.language = language;
        this.framework = framework;
    }
}
