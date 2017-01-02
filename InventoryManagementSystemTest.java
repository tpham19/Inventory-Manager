import java.util.Map;
import java.util.TreeMap;

// Implements the IMS interface and establishes the inventory.
public class InventoryManagementSystemTest implements InventoryManagementSystem {
	private Map<String, Integer> products;

	// Establishes an empty inventory.
	public InventoryManagementSystemTest() {
		products = new TreeMap<String, Integer>();
	}

	// Establishes an inventory.
	public InventoryManagementSystemTest(Map<String, Integer> products) {
		this.products = products;
	}

	// Returns a PickingResult object to which holds the state of the inventory
	// after one of its products is picked.
	public PickingResult pickProduct(String productId, int amountToPick) {
		if (products.containsKey(productId)) {
			if (products.get(productId) < amountToPick) {
				throw new IllegalArgumentException();
			} else {
				products.put(productId, products.get(productId) - amountToPick);
			}
		}
		return new PickingResult(products);
	}

	// Returns a RestockingResult object to which holds the state of the
	// inventory after one of its products is restocked.
	public RestockingResult restockProduct(String productId, int amountToRestock) {
		if (products.containsKey(productId)) {
			if (amountToRestock < 0) {
				throw new IllegalArgumentException();
			} else {
				products.put(productId, products.get(productId) + amountToRestock);
			}
		}
		return new RestockingResult(products);
	}

	// Returns a Map structure representing the inventory.
	public Map<String, Integer> getProducts() {
		return products;
	}

	// Prints the physical location and level of each product within the
	// warehouse on a single separated line.
	public void printInventory() {
		for (String productId : products.keySet()) {
			System.out.print(productId + " " + products.get(productId) + " ");
		}
		System.out.println();
	}
}