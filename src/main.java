import java.util.ArrayList;
import java.util.List;

public class main {
	public static void main(String[] args) {
	Item item1 = new Item("Book", 20, 1);
	item1.addDiscount(DiscountType.AMOUNT, 5);
	
	// Creating item2 (a TaxableItem)
	TaxableItem item2 = new TaxableItem("Laptop", 1000, 1);
	item2.addDiscount(DiscountType.PERCENTAGE, 0.1);
	
	// Assuming GiftCardItem is similar to TaxableItem but without tax functionalities
	GiftCardItem item3 = new GiftCardItem("Gift Card", 10, 1);
	item3.addDiscount(DiscountType.AMOUNT, 0);
		
        List<Item> items = new ArrayList<>();
        items.add(item1);
        items.add(item2);
        items.add(item3);

        Order order = new Order(items, "John Doe", "johndoe@example.com");

        System.out.println("Total Price: " + order.calculateTotalPrice());

        order.sendConfirmationEmail();

        order.printOrder();
    }
}

