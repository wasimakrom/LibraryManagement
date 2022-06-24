package wasim.company;

class library{
    String[] books;
    int no_of_books;

    library(){
        this.books = new String[100];
        this.no_of_books = 0;
    }

    void addBook(String book){
        this.books[no_of_books] = book;
        no_of_books ++;
        System.out.println(book  + " has been added !!!");
    }

    void showAvailableBooks(){
        System.out.println("Available books are :-  Given below : ");
        for(String book : this.books){
            if(book==null) {
                continue;
            }
            System.out.println("*" + book);
        }
    }
    void issuedBook(String book){
        for(int i=0; i<this.books.length; i++){
            if(this.books[i].equals(book)){
                System.out.println("The book has been issued : ");
                this.books[i] = null;
                return ;
            }
        }
        System.out.println("This book does not exist !! ");
    }

    void returnBook(String book){
        addBook(book);
    }

}


public class Main {
    public static void main(String[] args){
        library centralLibrary = new library();
        centralLibrary.addBook("God with happiness ");
        centralLibrary.addBook("Path of definition");
        centralLibrary.addBook("Secret of Happiness ");
        centralLibrary.showAvailableBooks();
        centralLibrary.issuedBook("Path of definition");
        centralLibrary.showAvailableBooks();
        centralLibrary.returnBook("Path of definition");
        centralLibrary.showAvailableBooks();
    }
}
