public class MyBookList {
    public static void main(String[] args) {
        // 1.) Create the following books that contains the title, author, year published. Use the Book class for this part.
        //      Rich Dad Poor Dad, Robert Kiyosaki, 1997
        //      The Power of Habit, Charles Duhigg, 2012
        //      Atomic Habits, James Clear, 2018
        //      Java Programming, John Doe, 2020
        //      Add your own favorite book

        Book book1 = new Book("Rich Dad Poor Dad", "Robert Kiyosaki", 1997);
        Book book2 = new Book("The Power of Habit", "Charles Duhigg", 2012);
        Book book3 = new Book("Atomic Habits", "James Clear", 2018);
        Book book4 = new Book("Java Programming", "John Doe", 2020);
        // It's so hard to choose just one, but I'll have to go with this one!
        // "Me quota ang pag- ibig. Sa bawat limang umiibig, isa lang ang magiging maligaya."
        Book book5 = new Book("Para Kay B", "Ricky Lee", 2008);

        // 2.) Display the details of each book using the displayDetails method.
        book1.displayDetails();
        book2.displayDetails();
        book3.displayDetails();
        book4.displayDetails();
        book5.displayDetails();

        // 3.) Change the current page of "Rich Dad Poor Dad" to 50 and "Atomic Habits" to 100 using the changePage method. Display the details again for the two books.
        book1.changePage(50);
        book3.changePage(100);
        System.out.println("\nAfter changing pages for two books:");
        book1.displayDetails();
        book3.displayDetails();

        // 4.) Change the current page of your favorite book to any page number you like. Display the details again for your favorite book.
        book5.changePage(143);
        System.out.println("\nFavorite book after changing page:");
        book5.displayDetails();

        // 5.) Change the author of "Java Programming" to "Jane Smith". Display the details again for the book.
        book4.setAuthor("Jane Smith");
        System.out.println("\nAfter changing author of Java Programming:");
        book4.displayDetails();

        // 6.) Create an array of Book objects to store all the books you created. Loop through the array and display the title of the books published after 2010.
        Book[] books = { book1, book2, book3, book4, book5 };
        System.out.println("\nBooks published after 2010:");
        for (Book b : books) {
            if (b.getYearPublished() > 2010) {
                System.out.println("- " + b.getTitle());
            }
        }
    }
}
