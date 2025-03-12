public abstract class Book {
    protected String title;
    protected boolean isAvailable;

    public Book(String title, boolean isAvailable) {
        this.title = title;
        this.isAvailable = isAvailable;
    }

    public abstract boolean isAvailable();

    public abstract void checkOut();
}