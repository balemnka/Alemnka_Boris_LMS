// Name: Boris Alemnka       Course: Software Development 1 (CEN 3024C)       Date: 6/11/2024
//Class Name: Main
//Function: Holds the main method that the user will run to execute tasks like removing/adding a book, with confirmation
// messages that display after an action has been taken.


import java.util.Scanner;
import java.io.*;

class LibraryUse {
    public static void main(String[] args) {
        Scanner scanA = new Scanner(System.in);

        System.out.print("Enter book title: ");
        String title = scanA.nextLine();

        System.out.print("Enter book author: ");
        String author = scanA.nextLine();

        System.out.print("Enter book barcode: ");
        String barcode = scanA.nextLine();

        LibraryBooks book = new LibraryBooks();
        Book newBook = new Book(title, author, barcode);
        LibraryBooks.addNewBook(newBook);
        System.out.println("'"+ title +"'" + " by " + author + " has been added to the library");


        System.out.print("Enter the file name: ");
        String fileName = scanA.nextLine();
        try (BufferedReader reader1 = new BufferedReader(new FileReader(fileName))) {
            String line1;

            while ((line1 = reader1.readLine()) != null) {
                String[] token = line1.split(",");
                LibraryBooks.addNewBook(new Book(token[0], token[1], token[2]));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        LibraryBooks.printBookCollection();

        System.out.print("Enter a barcode number to remove: ");
        //String barcode = scanA.nextLine();
        if (LibraryBooks.removeBookBarcode(barcode)) {
            System.out.println("Book with barcode " + barcode + " has been removed.");
        }
        LibraryBooks.printBookCollection();

        System.out.print("Enter a title to remove: ");
        String title1 = scanA.nextLine();
        if (LibraryBooks.removeBookTitle(title1)) {
            System.out.println("Book with title " + title1 + " has been removed.");
        }
        LibraryBooks.printBookCollection();

        System.out.print("Enter book title to check out: ");
        String title2 = scanA.nextLine();
        if (LibraryBooks.checkOut(title2)) {
            System.out.println("Book with title " + title1 + " has been checked out.");
        }
        LibraryBooks.printBookCollection();

        System.out.print("Enter book title to check in: ");
        String title3 = scanA.nextLine();
        if (LibraryBooks.checkIn(title3)) {
            System.out.println("Book with title " + title1 + " has been checked in.");
        }
        LibraryBooks.printBookCollection();
    }
}