public class Main {
    public static void main(String[] args) {
        Book physicalBook = new PhysicalBook("The Great Gatsby", true);
        Book ebook = new Ebook("Java Programming", true);
        
        Library library = new Library();
        library.checkOutBook(physicalBook); 
        library.checkOutBook(ebook);         
    }
}