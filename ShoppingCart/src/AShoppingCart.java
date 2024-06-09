import java.util.ArrayList;

public class ShoppingCart {
    private ArrayList<Item> items;
    private int capacity;

    // Constructor
    public ShoppingCart(int capacity) {
        this.capacity = capacity;
        this.items = new ArrayList<>(capacity);
    }

    // Method to add an item to the cart
    public void addItem(Item item) {
        if (items.size() < capacity) {
            items.add(item);
        } else {
            System.out.println("The shopping cart is full.");
        }
    }

    // Method to compute the total price of the cart
    public double cartTotal() {
        double total = 0.0;
        for (Item item : items) {
            total += item.getPrice();
        }
        return total;
    }

    // Method to compute the total tax to charge
    public double cartTaxAmount(double taxRate) {
        double taxAmount = 0.0;
        for (Item item : items) {
            if (item.getTaxable()) {
                taxAmount += item.getPrice() * (taxRate / 100);
            }
        }
        return taxAmount;
    }

    // Method to display the contents of the shopping cart
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Shopping Cart Contents:\n");
        for (Item item : items) {
            sb.append(item.toString()).append("\n");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart(10);
        Item item1 = new Item("Shirt", "Fashion Store", 20.0, 10.0, 0.5, true);
        Item item2 = new Item("Book", "Bookstore", 15.0, 8.0, 0.3, false);

        cart.addItem(item1);
        cart.addItem(item2);

        System.out.println(cart);
        System.out.println("Total Price: $" + cart.cartTotal());
        System.out.println("Total Tax: $" + cart.cartTaxAmount(5.0)); // Assuming 5% tax rate
    }
}
