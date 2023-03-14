/*
 * TestCar.java
 * This is the test class for Testing the Car
 * Ashton Williams - 220468478
 * 14 March 2023
 */
package za.ac.cput.domain;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;
    public class TestCar {
        Car car1 = new Car("Toyota", "V6", 2022, 30000.00);
        Car car2 = new Car("Toyota", "V6", 2022, 30000.00);
        Car car3 = new Car("Honda", "V6", 2022, 30000.00);

        @Test
        void testCarEquality() {
            assertEquals(car1, car2);
            assertNotEquals(car1, car3);
        }

        @Test
        void testCarIdentity(){
            assertSame(car1, car1);
            assertNotSame(car1, car3);
        }

        @Test
        void testCarFailing(){
            if(car1.carModel.equals(car3.carModel)) fail("Hey, this test has failed");
        }

        @Test
        void testCarPriceTimeout() {
            assertTimeout(Duration.ofSeconds(1), () -> {
                car1.setCarPrice(35000.00);
                assertEquals(35000.00, car1.getCarPrice());
            });
        }
        @Disabled("This test is currently disabled.")
        @Test
        void testCarDisabling(){
            car1.setCarPrice(15000.00);
            assertEquals(15000.00, car1.getCarPrice());
        }

    }
