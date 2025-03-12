# SDA
<h1> Book.java (Superclass)</h1>
<ul>
<li> This is an abstract class that represents a general Book. It has two main properties: title (the name of the book) and isAvailable (a boolean to check if the book is available).</li>
<li>It also defines two methods: isAvailable() to check availability and checkOut() to borrow the book, but these methods are abstract and need to be implemented by subclasses.</li>
</ul>
<h2> PhysicalBook.java (Concrete Class)</h2>
<ul>
<li>This class represents a physical book and extends the Book class.
</li>
<li>It implements the isAvailable() method to return if the physical book is available.
</li>
<li>The checkOut() method checks if the book is available. If it is, it changes isAvailable to false and prints a message saying the book has been checked out; otherwise, it prints that the book is not available.</li>
</ul>

<h3> Ebook.java (Concrete Class):</h3>
<ul>
<li>This class represents an ebook and also extends the Book class.
</li>
<li>Like the PhysicalBook class, it implements the isAvailable() and checkOut() methods. If the ebook is available, it will print that it’s downloaded; otherwise, it prints that the ebook is not available.</li>
</ul>

<h4> Library.java (Using Polymorphism)</h4>
<ul>
<li>This class has a method checkOutBook() that accepts any type of Book (whether it's a PhysicalBook or Ebook) as a parameter.</li>
<li>The method calls the checkOut() method on the Book object. Thanks to Polymorphism, it will call the correct checkOut() method (from either PhysicalBook or Ebook) based on the actual type of the object passed.</li>
</ul>

<h5>Main.java</h5>
<ul>
<li>In this class, two books are created: one PhysicalBook and one Ebook. The Library class is then used to check out both books, demonstrating polymorphism. The appropriate checkOut() method is called for each book.</li>
</ul>
