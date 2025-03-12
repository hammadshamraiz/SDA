// PhysicalBook.java
public class PhysicalBook {
    private String title;
    private boolean isAvailable;

    public PhysicalBook(String title, boolean isAvailable) {
        this.title = title;
        this.isAvailable = isAvailable;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void checkOut() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Physical book '" + title + "' has been checked out.");
        } else {
            System.out.println("Physical book '" + title + "' is not available.");
        }
    }
}

// Ebook.java
public class Ebook {
    private String title;
    private boolean isAvailable;

    public Ebook(String title, boolean isAvailable) {
        this.title = title;
        this.isAvailable = isAvailable;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void checkOut() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Ebook '" + title + "' has been downloaded.");
        } else {
            System.out.println("Ebook '" + title + "' is not available.");
        }
    }
}

// Library.java (Without Polymorphism)
public class Library {
    public void checkOutPhysicalBook(PhysicalBook book) {
        book.checkOut();
    }

    public void checkOutEbook(Ebook ebook) {
        ebook.checkOut();
    }
}

// Main.java
public class Main {
    public static void main(String[] args) {
        PhysicalBook physicalBook = new PhysicalBook("The Great Gatsby", true);
        Ebook ebook = new Ebook("Java Programming", true);
        
        Library library = new Library();
        library.checkOutPhysicalBook(physicalBook);  // PhysicalBook
        library.checkOutEbook(ebook);                 // Ebook
    }
}
