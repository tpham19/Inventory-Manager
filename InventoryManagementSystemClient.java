import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

public class InventoryManagementSystemClient {

	public static void main(String[] args) {
		Map<String, Integer> products = new TreeMap<String, Integer>();
		Random rand = new Random();
		for (int i = 1; i <= 9; i++) {
			int quantity = rand.nextInt(11);
			// Given a random quantity from 0 to 10.
			products.put("product" + i, quantity);
		}
		InventoryManagementSystemTest inventory = new InventoryManagementSystemTest(products);
		inventory.printInventory();
		PickingResult inventoryTwo = inventory.pickProduct("product4", 2);
		inventoryTwo.printInventory();
		RestockingResult inventoryThree = inventory.restockProduct("product5", 3);
		inventoryThree.printInventory();
		RestockingResult inventoryFour = inventory.restockProduct("product6", 4);
		inventoryFour.printInventory();
	}
}
