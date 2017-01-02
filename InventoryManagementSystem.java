public interface InventoryManagementSystem {
	public PickingResult pickProduct(String productID, int amountToPick);

	public RestockingResult restockProduct(String productId, int amountToRestock);
}
