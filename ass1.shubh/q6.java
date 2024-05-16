// LibraryResource.java
public abstract class LibraryResource {
    private String title;
    private String author;

    public LibraryResource(String title, String author) {
        this.title = title;
        this.author = author;
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

    public abstract void displayDetails();
}

// Book.java
public class Book extends LibraryResource {
    private int pageCount;

    public Book(String title, String author, int pageCount) {
        super(title, author);
        this.pageCount = pageCount;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    @Override
    public void displayDetails() {
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Page Count: " + getPageCount());
    }
}

// Magazine.java
public class Magazine extends LibraryResource {
    private String issueDate;

    public Magazine(String title, String author, String issueDate) {
        super(title, author);
        this.issueDate = issueDate;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    @Override
    public void displayDetails() {
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Issue Date: " + getIssueDate());
    }
}

// DVD.java
public class DVD extends LibraryResource {
    private int duration;

    public DVD(String title, String author, int duration) {
        super(title, author);
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public void displayDetails() {
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Duration: " + getDuration() + " minutes");
    }
}

// LibrarySystem.java
public class LibrarySystem {
    public static void main(String[] args) {
        Book book1 = new Book("The Catcher in the Rye", "J.D. Salinger", 277);
        Magazine magazine1 = new Magazine("National Geographic", "Editorial Team", "January 2023");
        DVD dvd1 = new DVD("The Shawshank Redemption", "Frank Darabont", 142);

        System.out.println("Book Details:");
        book1.displayDetails();
        System.out.println();

        System.out.println("Magazine Details:");
        magazine1.displayDetails();
        System.out.println();

        System.out.println("DVD Details:");
        dvd1.displayDetails();
        System.out.println();
    }
}