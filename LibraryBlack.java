public class LibraryBlack {
    


    // Inner class representing a Book with properties: title, author, isbn, and isBorrowed
    class Book{
        // Static variable to keep track of the total number of books
        static int TotalNoOfBooks;

        // Instance variables for book details
        String title;
        String author;
        String isbn;
        boolean isBorrowed = false;

        // Static block to initialize TotalNoOfBooks to 0
        static {
            TotalNoOfBooks=0;
        }

        // Default constructor, increments TotalNoOfBooks
        Book(){
            TotalNoOfBooks++;
        }

        // Constructor with isbn, title, and author parameters
        Book(String isbn, String title, String author ){
            this.isbn=isbn;
            this.title=title;
            this.author=author;
        }

        // Constructor with only isbn parameter, sets title and author to "unknown"
        Book(String isbn){
            this(isbn,"unknown","unknown");
        }

        // Static method to get the total number of books
        static int getTotalNoOfBooks(){
            return TotalNoOfBooks;
        }

        // Method to borrow a book, checks if the book is already borrowed
        void borrowBook(){
            if(isBorrowed){
                System.out.println("already borrowed");
            }
            else{
                this.isBorrowed=true;
                System.out.println("enjoy the book ");
            }
        }

        // Method to return a book, checks if the book is currently borrowed
        void returnBook(){
            if(isBorrowed){
                this.isBorrowed=false;
                System.out.println("hope you enjoy,pls leave the review");
            }
            else{
                System.out.println("this book is already in the library  ");
            }
        }
    }

    // Main method to create and interact with Book objects
    public static void main (String[] args){
        // Create a new Book object with isbn, title, and author
        Book b1= new Book("1","funny","codder");

        // Create a new Book object with only isbn, title and author set to "unknown"
        Book myBook =new Book("2");

        // Print the total number of books
        System.out.println(Book.getTotalNoOfBooks());

        // Borrow a book
        b1.borrowBook();

        // Borrow a book
        myBook.borrowBook();

        // Attempt to borrow a book that is already borrowed
        b1.borrowBook();

        // Return a book
        b1.returnBook();

        // Return a book
        myBook.returnBook();
    }
}