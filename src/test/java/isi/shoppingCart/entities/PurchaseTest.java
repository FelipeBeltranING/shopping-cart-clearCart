package isi.shoppingCart.entities;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PurchaseTest {
    private Purchase purchase;
    private Customer customer;
    private List<PurchaseItem> items;
    private PurchaseItem purchaseItem;
    private Product product;

    @BeforeEach
    void setUp() {
        customer = new Customer(0, "User");
        purchase = new Purchase(0, customer);
        items = new ArrayList<PurchaseItem>();
        product = new Product(1, " Mouse ", 50000, 10);
        purchaseItem = new PurchaseItem(product, 1, 50000);
    }

    @Test
    void getId() {
        assertEquals(0, purchase.getId());
    }

    @Test
    void getCustomer() {
        assertEquals(customer, purchase.getCustomer());
    }


    @Test
    void getItems() {
        assertEquals(items, purchase.getItems());
    }

    @Test
    void addItem() {
        purchase.addItem(purchaseItem);
        assertEquals(1, purchase.getItems().size());
        assertEquals(product, purchaseItem.getProduct());
    }

    @Test
    void getTotal() {
        purchase.addItem(purchaseItem);
        assertEquals(50000, purchase.getTotal());
    }
}