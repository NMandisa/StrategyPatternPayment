import za.co.fynbos.cart.ShoppingCart;
import za.co.fynbos.product.Item;
import za.co.fynbos.strategy.impl.CreditCardStrategy;
import za.co.fynbos.strategy.impl.PaypalStrategy;

public class ShoppingCartTest {

	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();

		Item item1 = new Item("1234", 20);
		Item item2 = new Item("5678", 70);

		cart.addItem(item1);
		cart.addItem(item2);

		// pay by paypal
		cart.pay(new PaypalStrategy("fab@example.com", "mypwd"));

		// pay by credit card
		cart.pay(new CreditCardStrategy("Ghetto Fab", "41113456789098765", "983", "08/21"));
	}
}
