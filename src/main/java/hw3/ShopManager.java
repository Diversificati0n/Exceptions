package hw3;

public class ShopManager {
    public static double purchaseProduct(int productId, int quantity) throws ProductNotFoundException {
        try {
            Product product = ProductDatabase.getProduct(productId);
            double totalPrice = product.getPrice() * quantity;
            return totalPrice;
        } catch (ProductNotFoundException e) {
            throw e; // Переброс исключения на уровень выше
        }
    }
}


