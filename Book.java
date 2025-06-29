class Book {
    static int TotalNoOfBook;

    String title;
    String author;
    String isbn;

    boolean isBorrowed;



static {
        TotalNoOfBook=0;
       }
    {
        TotalNoOfBook++;
    }
    
    




Book(String isbn, String title,String author){
    this.isbn=isbn;
    this.title=title;
    this.author= author;
}



Book(String isbn){
    this(isbn, "unknown", "unknown");
}



static int getTotalNoOfBooks(){
    return TotalNoOfBook;

}


void BorrowBook(){
    if(isBorrowed){
        System.out.println("the book is already Boorowed ");
    }else{
    this.isBorrowed=true;
    System.out.println("enjoy the book");
    }
}


void ReturnBook(){
    if(isBorrowed){
        this.isBorrowed=false;
        System.out.println("tankyou for return the book");
    }else{
        System.out.println("the book is already in the library ");
    }
}
 }


public static void main(String[] args) {
    Book GodOfWar=new Book(1,"design","Author");
    Book things=new Book(2);
    System.out.println(Book.getTotalNoOfBooks());
    GodOfWar.BorrowBook();
    things.BorrowBook();
    GodOfWar.BorrowBook();
    things.ReturnBook();
    GodOfWar.ReturnBook();
}
