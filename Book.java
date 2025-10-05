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

// Submitted by: Porteza, Moris L. (BSCS-2D)

// AI Prompt:
// You are a Java programmer. You are tasked with making a book list that will demonstrate how to instantiate and manipulate a class, as well as how to use properties, constructors, and methods in Java.
// I will provide six instructions one by one throughout our conversation. Please follow the instructions carefully and generate two Java files: "MyBookList.java" and "Book.java". 
// Make sure that the code compiles and runs correctly. Each time I give an instruction for a specific number, you must implement it properly in the code and update the existing program so that it grows feature by feature.
// At the end of your response, provide a clear explanation not only about the functionality but also about the Java programming concepts applied. 
// Make the explanation easy to understand, even for a beginner programmer like me.

// AI Model: GPT-5 (ChatGPT)

// Transaction ID: https://chatgpt.com/share/68e2926d-6034-8013-9acb-e0677b356b85
