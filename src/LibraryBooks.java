// Name: Boris Alemnka       Course: Software Development 1 (CEN 3024C)       Date: 6/11/2024
//Class Name: Book
//Function: Holds the book object from where our book title, author, setters and getters methods will be stored
// as well as the return method defined and initialized by data type.


import java.util.ArrayList;

class LibraryBooks {
    private static ArrayList<Book> book1;

    public LibraryBooks() {         //Constructor
        book1 = new ArrayList<>();
    }

    public static void addNewBook(Book LibraryBook) {  //Adding a book
        book1.add(LibraryBook);
    }

    static boolean removeBookBarcode(String barcode) {    //Removing book using barcode
        return book1.removeIf(LibraryBook -> LibraryBook.getBarcode().equals(barcode));
    }

    static boolean removeBookTitle(String title) {      //Removing book using title
        return book1.removeIf(LibraryBook -> LibraryBook.getTitle().equals(title));
    }

    static boolean checkOut(String title) {       // Checking out a book using title
        for (Book LibraryBook : book1) {
            if (LibraryBook.getTitle().equals(title) && !LibraryBook.isCheckedOut()) {
                LibraryBook.setCheckedOut(true);
                return true;
            }
        }
        return false;
    }

    public static boolean checkIn(String title) {      //Checking in a book using title
        for (Book LibraryBook : book1) {
            if (LibraryBook.getTitle().equals(title) && LibraryBook.isCheckedOut()) {
                LibraryBook.setCheckedOut(true);
            }
        }
        return false;
    }
    public static void printBookCollection() {
        System.out.println("Printing Library Collection Database:");
        for (Book LibraryBook : book1) {
            System.out.println(LibraryBook);
        }
    }
}