package day5;

public class Books {


    // Constructor overloading
     public Books() {
        System.out.println("Books constructor");
    }

    // Constructor with parameter
    public  Books(String author){
        System.out.println("Author of the book is: "+author);
    }


    public static void main(String[] args) {
         new Books();
        Books books=  new Books("Arvind");
        books.publishBook("Java Programming");

    }

    public void publishBook(String bookName){
        System.out.println("Book published: "+bookName);
    }
}
