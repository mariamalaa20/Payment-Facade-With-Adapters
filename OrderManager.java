public class OrderManager {
    private InventorySystem inventory;
    private ShippingSystem shipping;

    public OrderManager() {
        inventory = new InventorySystem();
        shipping = new ShippingSystem();
    }

    public void processOrder(String productId, String address) {
        if (inventory.isAvailable(productId)) {
            inventory.reduceStock(productId);
            shipping.ship(address);
        } else {
            System.out.println("Product not available.");
        }
    }
}
