package isi.shoppingCart.entities;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class PurchaseItemTest {

    @Test
    void testConstructorAndGetters() {
        Product product = new Product(1, "Product 1", 10.0, 1);
        PurchaseItem item = new PurchaseItem(product, 3, 10.0);

        assertEquals(product, item.getProduct(), "El producto debería ser el asignado");
        assertEquals(3, item.getQuantity(), "La cantidad debería ser 3");
        assertEquals(10.0, item.getUnitPrice(), "El precio unitario debería ser 10.0");
    }

    @Test
    void testGetSubtotal() {
        Product product = new Product(1, "Product 1", 10.0, 1);
        PurchaseItem item = new PurchaseItem(product, 3, 12.5);

        assertEquals(37.5, item.getSubtotal(), "El subtotal debería ser 37.5");
    }

    @Test
    void testGetSubtotalWithZeroQuantity() {
        Product product = new Product(1, "Product 1", 10.0, 1);
        PurchaseItem item = new PurchaseItem(product, 0, 15.0);

        assertEquals(0.0, item.getSubtotal(), "El subtotal debería ser 0.0 si la cantidad es cero");
    }
}
