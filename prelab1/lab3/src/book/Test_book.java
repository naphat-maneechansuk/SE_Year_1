package book;

import java.util.Scanner;

public class Test_book {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        Book[] books = new Book[5];
        books[0] = new Book("100","Programming","John");
        books[1] = new Book("200","Object-Oriented Programming","May");
        books[2] = new Book("300","Graphic","Marry");
        books[3] = new Book("400","Statistics","Martin");
        books[4] = new Book("500","Database","John");
        Library lib = new Library(books);
        lib.showAllBook();
        char select;
        do {
            System.out.print("<=== Enter the number what do you want to do ===>"+"\n"
                    +"1. Borrow a book."+"\n"
                    +"2. Return a book."+"\n"
                    +"3. Search a book."+"\n"
                    +"q. Quit the system."+"\n"
                    +"select = ");
            select = kb.next().charAt(0);
            String input = null;

            if (select == '1'){
                System.out.print("Enter [id/title] of book : ");
                input = kb.next();
                if (lib.searchBook(input)==-1){
                    System.out.println("Sorry, this book cannot be found in our library.");
                }
                lib.borrowBook(input);
            }else if (select == '2'){
                System.out.print("Enter [id/title] of book : ");
                input = kb.next();
                if (lib.searchBook(input)==-1){
                    System.out.println("Sorry, this book cannot be found in our library.");
                }
                lib.returnBook(input);
            }else if (select == '3'){
                System.out.print("Enter [id/title] of book : ");
                input = kb.next();
                if (lib.searchBook(input)==-1){
                    System.out.println("Sorry, this book cannot be found in our library.");
                }
                int b = lib.searchBook(input);
                System.out.println(books[b].toString());
            }
        }while (select != 'q');
        System.out.println("Thank you");
    }
}
