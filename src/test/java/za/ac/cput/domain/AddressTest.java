package za.ac.cput.domain;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;
public class AddressTest {
    Address address1 = new Address("12", "Sharp Street", "Cape Town", "Western Cape", "1943");
    Address address2 = new Address("57", "Jupiter Road", "Cape Town", "Western Cape", "2638");
    Address address3 = new Address("12", "Sharp Street", "Cape Town", "Western Cape", "1943");

    @Test
    void testAddressEquality() {
        assertEquals(address1, address1);
        assertNotEquals(address1, address2);
    }

    @Test
    void testObjectIdentity() {
        assertSame(address3, address3);
        assertNotSame(address1, address2);
    }

    @Test
    void testAddressFailing() {
        if (address1.getNumber().equals(address2.getNumber())) fail("Test has failed.");
    }

    @Test
    void testAddressNumberTimeout() {
        assertTimeout(Duration.ofSeconds(4), () -> {
            address1.setNumber("12");
            assertEquals("12", address1.getNumber());
        });
    }

    @Disabled("Test is currently disabled.")
    @Test
    void testDisabling() {
        assertEquals("12", "12");
    }
}
