public class GoodsTest {
    public static void main(String[] args) {
        // Goods g1 = new Goods("Laptop", 1500.0);
        // g1.display();
        // Taxable t = new Taxable();
        // Toy t1 = new Toy("Action Figure", 20.0, 5);
        // t1.display();
        // Book b1 = new Book("Java Programming", 50.0, "John Doe");
        // b1.display();
        Food food = new Food("Bread", 15000, 250);
        Toy toy = new Toy("Robot", 120000, 8);
        Book book = new Book("Java Basics", 90000, "A. Programmer");
        food.display();
        System.out.println();
        toy.display();
        System.out.println();
        book.display();
        System.out.println();
        Taxable taxableToy = toy;
        Taxable taxableBook = book;
        System.out.println("Toy tax : " + taxableToy.calculateTax());
        System.out.println("Book tax : " + taxableBook.calculateTax());
    }
}
