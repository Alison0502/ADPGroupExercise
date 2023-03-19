package za.ac.cput.domain;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;


import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

public class productTest {
    Product product1 = new Product("T-shirt", "9373627283", "Plain light blue woman cotton t-shirt", "R150");
    Product product2 = new Product("Shoes", "9283764827", "Grey and white Nike sneakers", "R1200");
    Product product3 = new Product("T-shirt", "9373627283", "Plain light blue woman cotton t-shirt", "R150");

    @Test
    void testProductEquality() {
        assertEquals(product3, product3);
        assertNotEquals(product1, product2);
    }

    @Test
    void testProductIdentity() {
        assertSame(product1, product1);
        assertNotSame(product1, product2);
    }
    @Test
    void testProductFailing() {
        if(product2.getProdName().equals(product1.getProdName()))fail("Test Failed");
    }
    @Test
    void testProductCodeTimeout() {
        assertTimeout(Duration.ofSeconds(2), () -> {

            product1.setProdCode("1653736376");
            assertEquals("1653736376", product1.getProdCode());
        });
    }
    @Disabled("The test is disabled")
    @Test
    void testProductDisabling(){
        product1.setProdCode("82726252542");
        assertEquals("82726252542", product1.getProdCode());

    }

}

