import java.util.ArrayList;
import java.util.HashMap;

class LibraryBooks {
    private static ArrayList<Book> book1;

    public LibraryBooks() {  //Contructors
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



//class LibraryBooks {
//    private final Map<String, Book> libraryBooks = new HashMap<>();
//
//    private void addNewBook(Book book1) {
//        libraryBooks.put(book1.getTitle(), book1);
//    }
//    public void removeBookTitle(String title) {
//        libraryBooks.values().removeIf(book1 -> book1.getTitle().equals(title));
//    }
//    public void removeBookBarcode(String barcode) {
//        libraryBooks.remove(barcode);
//    }
//    public void checkOut(String title) {
//        libraryBooks.values().forEach(book1 -> {
//            if (book1.getTitle().equals(title)) {
//                book1.setUnavailable(true);
//            }
//        });
//    }
//    public void checkIn(String title) {
//        libraryBooks.values().forEach(book1 -> {
//            if (book1.getTitle().equals(title)) {
//                book1.setUnavailable(false);
//            }
//        });
//    }
//    public void printLibraryDatabase() {
//        System.out.println("Printing Library Collection Database:");
//        libraryBooks.values().forEach(System.out:: println);
//        }
//    }