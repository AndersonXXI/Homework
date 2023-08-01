package HW9_3;

public class Book {
    private String title;
    private String author;
    private int yearPublished;

    public Book(String title, String author, int yearPublished) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    public void printInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year Published: " + yearPublished);
    }

    public static void main(String[] args) {
        Book book = new Book("Sample Book", "John Doe", 2023);

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("This is an anonymous class.");
            }
        };

        runnable.run();

        Runnable lambdaRunnable = () -> System.out.println("This is a lambda expression.");

        lambdaRunnable.run();
    }
}
