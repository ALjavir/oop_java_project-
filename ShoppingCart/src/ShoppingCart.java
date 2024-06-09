public class Assinment_3 {


class Item {
    private String name;
    private double price;
    private boolean taxable;

    public Item(String name, double price, boolean taxable) {
        this.name = name;
        this.price = price;
        this.taxable = taxable;
    }

    public double getPrice() {

        return price;
    }

    public boolean isTaxable() {

        return taxable;
    }

    @Override
    public String toString() {

        return name + ": $" + price;
    }
}

class AShoppingCart {
    private static final int MAX_ITEMS = 10;
    private Item[] items;
    private int itemCount;

    public AShoppingCart() {
        this.items = new Item[MAX_ITEMS];
        this.itemCount = 0;
    }

    public void addItem(Item item) {
        if (itemCount < MAX_ITEMS) {
            items[itemCount++] = item;
        } else {
            System.out.println("The cart is full. Cannot add more items.");
        }
    }

    public double cartTotal() {
        double total = 0;
        for (int i = 0; i < itemCount; i++) {
            total += items[i].getPrice();
        }
        return total;
    }

    public double cartTaxAmount(double taxRate) {
        double taxAmount = 0;
        for (int i = 0; i < itemCount; i++) {
            if (items[i].isTaxable()) {
                taxAmount += items[i].getPrice() * taxRate;
            }
        }
        return taxAmount;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Congratulations! Here Wew add Your Shopping Cart Ammounts And Prices:\n");
        System.out.println("\n\n");
        for (int i = 0; i < itemCount; i++) {
            sb.append(items[i].toString()).append("\n");
        }
        return sb.toString();
    }
}

class Main {
    public static void main(String[] args) {
        AShoppingCart cart = new AShoppingCart();

        Item item1 = new Item("Shirt", 20.0, true);
        Item item2 = new Item("Book", 15.0, false);
        Item item3 = new Item("Hat", 10.0, true);
        Item item4 = new Item("T-Shirt", 15.0, true);
        Item item5 = new Item("Ear Buds", 85.0, true);
        Item item6 = new Item("Watch", 65.0, true);
        Item item7 = new Item("Mobile Case", 15.0, false);
        Item item8 = new Item("Sun-glass", 15.0, true);
        Item item9 = new Item("Laptop", 100.0, true);
        Item item10 = new Item("Jeans Pant", 35.0, false);

        cart.addItem(item1);
        cart.addItem(item2);
        cart.addItem(item3);
        cart.addItem(item4);
        cart.addItem(item5);
        cart.addItem(item6);
        cart.addItem(item7);
        cart.addItem(item8);
        cart.addItem(item9);
        cart.addItem(item10);



        System.out.println(cart);

        System.out.println("Total: $" + cart.cartTotal());

        System.out.println("Tax Amount (at 10%): $" + cart.cartTaxAmount(0.1));
        System.out.println("\n");
        
    }
}
}
