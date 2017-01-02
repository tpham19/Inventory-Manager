import java.util.Map;
import java.util.TreeMap;

// Establishes a RestockingResult object to which holds the state of the inventory
// after one of its products is restocked.
public class RestockingResult {

	private Map<String, Integer> products;

	// Establishes an empty inventory.
	public RestockingResult() {
		products = new TreeMap<String, Integer>();
	}

	// Establishes an inventory.
	public RestockingResult(Map<String, Integer> products) {
		this.products = products;
	}

	// Returns a Map structure representing the inventory.
	public Map<String, Integer> getProducts() {
		return products;
	}

	// Sets the products and quantity of each product within the inventory.
	public void setProducts(Map<String, Integer> products) {
		this.products = products;
	}

	// Prints the physical location and level of each product within
	// the warehouse on a single separated line.
	public void printInventory() {
		for (String productId : products.keySet()) {
			System.out.print(productId + " " + products.get(productId) + " ");
		}
		System.out.println();
	}
}
