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




//        LibraryBooks.printLibraryBooks();
//
//
//
//
//
//        System.out.print("Enter a barcode number to remove: ");   // Removing book by barcode
//        String barcode = scanA.nextLine();
//        //scanA.nextLine();
//        Book removeBook = LibraryBooks.removeBookBarcode(barcode);
//        System.out.println(removeBook != null ? "Book removed: " + removeBook.getTitle() : "not found.");
//
//        LibraryBooks.printBookCollection();
//
//        System.out.print("Enter a title to remove: ");
//        String title1 = scanA.nextLine();
//        removeBook = LibraryBooks.removeBookTitle(title1);
//        System.out.println(removeBook != null ? "Book removed: " + removeBook.getTitle() : "not found.");
//
//        LibraryBooks.printBookCollection();
//
//        System.out.print("Enter book title to check out: ");
//        String title2 = scanA.nextLine();
//        boolean checkOutBook = LibraryBooks.removeBookTitle(title2);
//        if (checkOutBook != null) {
//            checkOutBook.isCheckedOut();
//            LibraryBooks.addNewBook(checkOutBook);
//            System.out.print("This book is currently checked out: " + checkOutBook.getTitle());
//        } else {
//            System.out.print(checkOutBook + " not found.");
//        }
//        LibraryBooks.printBookCollection();
//
//        System.out.print("Enter book title to check in: ");
//        String title3 = scanA.nextLine();
//        Book checkInBook = LibraryBooks.removeBookTitle(title3);
//        if (checkInBook != null) {
//            checkInBook.checkIn();
//            LibraryBooks.addNewBook(checkInBook);
//            System.out.println("Book with title " + checkInBook.getTitle() + " has been checked in.");
//        } else {
//            System.out.println("Book not found");
//        }
//        LibraryBooks.printBookCollection();
//    }
//}











//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//public class Main {
 //   private final HashMap<String, Book> database = new HashMap<>();

 //   public static void main(String[] args) throws IOException {
   //     Main database = new Main();

//public class Main {
//    public static void main(String[] args) {

//        Scanner scanA = new Scanner(System.in);

//        LibraryBooks library1 = new LibraryBooks();

//        System.out.print("Enter the file name: ");
//        String fileName = scanA.nextLine();

//        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
//            String line1;
//            while ((line1 = reader.readLine()) != null) {
//                String[] parts = line1.split(",");
//                LibraryBooks.addNewBook(new Book(parts[0], parts[1], parts[2]));
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        LibraryBooks.printLibraryBooks();

//        System.out.print("Enter a barcode number to remove: ");
//        String barcode = scanA.nextLine();
//        if (LibraryBooks.removeBookBarcode(barcode)) {
//            System.out.println("Book with barcode " + barcode + " has been removed.");
//        }
//        LibraryBooks.printLibraryBooks();

//        System.out.print("Enter a title to remove: ");
//        String title1 = scanA.nextLine();
//        if (LibraryBooks.removeBookTitle(title1)) {
//            System.out.println("Book with title " + title1 + " has been removed.");
 //       }
 //       LibraryBooks.printLibraryBooks();

//        System.out.print("Enter book title to check out: ");
//        String title2 = scanA.nextLine();
//        if (LibraryBooks.checkOut(title2)) {
//            System.out.println("Book with title " + title1 + " has been checked out.");
//        }
//        LibraryBooks.printLibraryBooks();

//        System.out.print("Enter book title to check in: ");
//        String title3 = scanA.nextLine();
//        if (LibraryBooks.checkIn(title3)) {
//            System.out.println("Book with title " + title1 + " has been checked in.");
//        }
 //       LibraryBooks.printLibraryBooks();

//        ScanA.close();
//    }
//}
//**
//        Scanner scan1 = new Scanner(System.in);

//        System.out.print("Hello! Enter file name: ");
//        String fileName = scan1.nextLine();
//        database.loadFiles(fileName);
//        database.printCollection();
//
//      System.out.print("Enter barcode number to remove: ");
//        String barcode = scan1.nextLine();
//        database.removeBookBarcode(barcode);
//        database.printCollection();
//
//        System.out.print("Enter book title to remove: ");
//        String bookTitle1 = scan1.nextLine();
//        database.removeBookTitle(bookTitle1);
//        database.printCollection();
//
//        System.out.print("Enter book title to check out: ");
//        String bookTitle2 = scan1.nextLine();
//        database.checkOut(bookTitle2);
//        database.printCollection();
//
//        System.out.print("Enter book title to check in: ");
//        String bookTitle3 = scan1.nextLine();
//        database.checkIn(bookTitle3);
//        database.printCollection();
//    }
//    public void loadFiles(String fileName) throws FileNotFoundException {
//        File file = new File(fileName);
//        Scanner scan2 = new Scanner(file);

//        while (scan2.hasNextLine()) {
//            String line1 = scan2.nextLine();
//            String[] tokens = line1.split(",");

//            Book book1 = new Book(tokens[0], tokens[1], tokens[2]);
//            addNewBook(book1);
//        }
//    }
//    private void addNewBook(Book book1) {
//        database.put(book1.getBarcode(), book1);
 //   }
//    public void removeBookBarcode(String barcode) {
 //       if (database.containsKey(barcode)) {
 //           database.remove(barcode);
 //           System.out.println("Book was removed");
 //       }
 //       else
//        {
//            System.out.println("Book does not exist");
//        }
//    }
//   public void removeBookTitle(String bookTitle1) {
 //       for (Iterator<Map.Entry<String, Book>> iterate = database.entrySet().iterator(); iterate.hasNext(); ) {
 //           Map.Entry<String, Book> entry = iterate.next();
 //           if (entry.getValue().getTitle().equals(bookTitle1)) {
 //               iterate.remove();
 //               System.out.println(bookTitle1 + " was removed");
  //              return;
 //           }
 //       }
 //       System.out.println("Book does not exist");
//    }

//    public void checkOut(String bookTitle2) {
 //       for (Book book1 : database.values()) {
 //           if (book1.getTitle().equals(bookTitle2) && book1.isUnavailable()) {
 //               book1.setUnavailable(true);
 //               System.out.println(bookTitle2 + " is currently checked out");
  //              return;
 //           }
 //       }
 //       System.out.println("Book does not exist or is currently checked out");
 //   }
 //   public void checkIn(String bookTitle3) {
  //      for (Book book1 : database.values()) {
 //           if (book1.getTitle().equals(bookTitle3) && book1.isUnavailable()) {
 //               book1.setUnavailable(false);
//                return;
//            }
//        }
 //       System.out.println(bookTitle3 + " is currently checked out");
 //   }

//    public void printCollection() {
//        System.out.println("Now printing library database");
//        for (Book book1 : database.values()) {
 //           System.out.println(book1);
 //   }
//}