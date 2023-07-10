 class Library{
    String []books;
    int noOfBooks;
    Library(){
       this.books = new String[10];
       this.noOfBooks = 0;
    }
    public void addBook(String book){
        this.books[noOfBooks] = book;
        noOfBooks++;
        System.out.println(book + " added.");
    }
     public void showAvailableBooks(){
        System.out.println("Available books:");
        for(String b: this.books){
            if(b == null){
                continue;
            }
            System.out.println("* "+b);
        }
     }
    public void issueBook(String book){
        for(int i=0; i<this.books.length; i++){
            if(this.books[i].equals(book)){
                System.out.println(book+" issued.");
                this.books[i]=null;
                return;
            }
        }
        System.out.println("Already issued.");
    }
    public void returnBook(String book){
        addBook(book);
    }
}

public class Book_Library {
    public static void main(String[] args) {
        Library lb = new Library();
        lb.addBook("Atomic Habits");
        lb.addBook("Subtle Art");
        lb.addBook("Psychology Of Money");
        lb.addBook("Verity");

        lb.showAvailableBooks();
        lb.issueBook("Subtle Art");
        //lb.issueBook("Subtle Art");

        lb.showAvailableBooks();
        lb.returnBook("Sublte Art");
        lb.showAvailableBooks();

    }
}
