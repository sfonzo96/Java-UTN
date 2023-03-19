import Guia.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class CartTest {

    // Relative file Path
    String fileDir = ".\\src\\Guia\\testProducts.txt";

    // Defines products in cart from file data
    CartItem[] items = CartItemsGenerator.getProductsFromFile(fileDir);

    @Test
    void noDiscount () {
        Cart cart = new Cart(items);
        double cartPrice = cart.getSubtotal();
        assertEquals(5027.6, cartPrice, 0);
    }

    @Test
    void percentualDisctount() {
        // Discounts 10 % of total
        Discount percentual = new PercentualDiscount(10);
        Cart cart = new Cart(items);
        double cartPrice = cart.getSubtotal(percentual);
        assertEquals(4524.84, cartPrice, 0);
    }

    @Test
    void fixedDiscount() {
        // Discounts $ 500 from total
        Discount fixed = new FixedDiscount(500);
        Cart cart = new Cart(items);
        double cartPrice = cart.getSubtotal(fixed);
        assertEquals(4527.6, cartPrice, 0);
    }

    @Test
    void CappedPercentualDiscount() {
        // Expected total of cart is 5027.6, discount cap will be $ 250 but will be a 10 % discount if discount < $ 250
        // Since 10 % of expected is 502.76, final discount will be $ 250 with cart having a final price of $ 4777.6
        Discount percentualWithCap = new PercentualDiscountWithCap(10, 250);
        Cart cart = new Cart(items);
        double cartPrice = cart.getSubtotal(percentualWithCap);
        assertEquals(4777.6, cartPrice, 0);
    }

}