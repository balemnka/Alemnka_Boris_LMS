// Name: Boris Alemnka       Course: Software Development 1 (CEN 3024C)       Date: 6/11/2024
//Class Name: Book
//Function: Holds the book object from where our book title, author, setters and getters methods will be stored
// as well as the return method defined and initialized by data type.

class Book {
                                           // Fields/Variables
    private final String title;
    private final String author;
    private final String barcode;
    private boolean isCheckedOut;

    public Book(String title, String author, String barcode) {      //Constructor

        this.title = title;
        this.author = author;
        this.barcode = barcode;
        this.isCheckedOut = false;
    }

    public String getTitle() {              // Getters and setters for fields
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public String getBarcode() {
        return barcode;
    }
    public boolean isCheckedOut() {
        return isCheckedOut;
    }
    public void setCheckedOut(boolean checkedOut) {
        this.isCheckedOut = checkedOut;
    }
    public void checkOut() {
        isCheckedOut = true;
    }
    public void checkIn() {
        isCheckedOut = false;
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", Barcode: " + barcode + ", Checked Out: " + isCheckedOut;
    }
}
