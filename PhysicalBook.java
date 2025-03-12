public class PhysicalBook extends Book {
    public PhysicalBook(String title, boolean isAvailable) {
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
            System.out.println("Physical book '" + title + "' has been checked out.");
        } else {
            System.out.println("Physical book '" + title + "' is not available.");
        }
    }
}