package isi.shoppingCart.entities;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CartTest {

    @Test
    void testAddProduct(){

        Cart cart = new Cart();

        Product product = new Product(1, "Product 1", 10.0,1);

        cart.addProduct(product);

        assertTrue(!cart.getItems().isEmpty(), "Carrito debería tener productos");

        cart.addProduct(product);

        assertEquals(2,cart.getQuantityByProductId(1), "La cantidad del producto debería ser 2");

    }

    @Test
    void getQuantityByProductId(){

        Cart cart = new Cart();

        Product product = new Product(1, "Product 1", 10.0,1);

        cart.addProduct(product);

        assertEquals(1,cart.getQuantityByProductId(product.getId()), "La cantidad del producto debería ser 1");
    }

    @Test
    void getTotal(){

        Cart cart = new Cart();

        Product product1 = new Product(1, "Product 1", 10.0,1);
        Product product2 = new Product(2, "Product 2", 20.0,1);

        cart.addProduct(product1);
        cart.addProduct(product2);

        assertEquals(30.0,cart.getTotal(), "El total del carrito debería ser 30.0");
    }

    @Test
    void testClearCart(){

        Cart cart = new Cart();

        cart.addProduct(new Product(1, "Product 1", 10.0,1));

        cart.clearCart();

        assertTrue(cart.getItems().isEmpty(),"Carrito debería estar vacio");
    }
}