public class Ebook extends Book {
    public Ebook(String title, boolean isAvailable) {
        super(title, isAvailable);
    }

    @Override
    public boolean isAvailable() {
        return isAvailable;
    }

    @Override
    public void checkOut() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Ebook '" + title + "' has been downloaded.");
        } else {
            System.out.println("Ebook '" + title + "' is not available.");
        }
    }
}