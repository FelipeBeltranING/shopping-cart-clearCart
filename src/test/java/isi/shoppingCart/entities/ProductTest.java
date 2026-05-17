package isi.shoppingCart.entities;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test ;

class ProductTest {
    @Test
    void increaseAvailableQuantityDebeAumentarCantidadProducto () {
        //postConidicones-> la cantidad hay aumentdo el valor inidicado
        Product product = new Product(1,"Mouse",50000,10);
        product.increaseAvailableQuantity(1);
        assertEquals(11,product.getAvailableQuantity());
    }

    @Test
    void decreaseAvailableQuantityDebeDisminuirCantidadProducto () {
        Product product = new Product(1,"Mouse",50000,10);
        product.decreaseAvailableQuantity(1);
        assertEquals(9,product.getAvailableQuantity());
    }

    @Test
    void changePriceDeebeCambiarPrecioProducto () {
        Product product = new Product(1,"Mouse",50000,10);
        product.changePrice(200);
        assertEquals(200,product.getPrice());
    }
}