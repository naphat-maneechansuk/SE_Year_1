package book;

public class Library {
    private Book[] book;

    public Library(Book[] book){
        this.book = book;
    }
    public int searchBook(String wantB){
        int num = -1;
        for (int i = 0; i < book.length;i++){
            if (book[i].getBookID().equals(wantB)||book[i].getTitle().equals(wantB)){
                num = i;
            }
        }
        return num;
    }
    public void borrowBook(String wantB){
        for (int i = 0;i <book.length;i++){
            if (book[i].getTitle().equals(wantB)||book[i].getBookID().equals(wantB)){
                if (book[i].getStatus() == 'A'){
                    System.out.println(wantB+" can borrow.");
                    book[i].updateStatus();
                }else {
                    System.out.println(wantB+" is borrowing. Sorry!");
                }
            }
        }
    }
    public void returnBook(String wantB){
        for (int i = 0;i <book.length;i++){
            if (book[i].getTitle().equals(wantB)||book[i].getBookID().equals(wantB)){
                if (book[i].getStatus() == 'A'){
                    System.out.println("This book is not borrowed. Re-input again!");
                }else {
                    System.out.println("Thank you, the return successful.");
                    book[i].updateStatus();
                }
            }
        }
    }
    public void showAllBook(){
        System.out.println("These are all books in our library");
        for (int i = 0; i<book.length;i++){
            System.out.println(book[i].toString());
        }
    }
}
