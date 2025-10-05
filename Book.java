public class Book {
    private String title;
    private String author;
    private int yearPublished;
    private int currentPage;

    // Constructor
    public Book(String title, String author, int yearPublished) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.currentPage = 0; 
    }

    // Getters
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public int getYearPublished() {
        return yearPublished;
    }
    public int getCurrentPage() {
        return currentPage;
    }

    // Setter for author
    public void setAuthor(String author) {
        this.author = author;
    }

    // Method to change the current page
    public void changePage(int page) {
        if (page < 0) {
            System.out.println("Page number cannot be negative. No change made.");
            return;
        }
        this.currentPage = page;
    }

    // Display details method
    public void displayDetails() {
        System.out.println("Title: " + title +
                           ", Author: " + author +
                           ", Year: " + yearPublished +
                           ", Current Page: " + currentPage);
    }

    @Override
    public String toString() {
        return title + " by " + author + " (" + yearPublished + ")";
    }
}
