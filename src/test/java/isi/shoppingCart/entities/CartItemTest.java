package isi.shoppingCart.entities;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CartItemTest {
    private CartItem cartItem;
    private Product product;
    @BeforeEach
    void setUp() {
        product = new Product (1 , " Mouse ", 50000 , 10) ;
        cartItem = new CartItem(product, 1);

    }
    @Test
    void getProduct() {
        assertEquals(product, cartItem.getProduct());
    }

    @Test
    void getQuantity() {
        assertEquals(1, cartItem.getQuantity());
    }

    @Test
    void increaseQuantity() {
        cartItem.increaseQuantity();
        assertEquals(2, cartItem.getQuantity());
    }

    @Test
    void getSubtotal() {
        assertEquals(50000, cartItem.getSubtotal());
    }
}