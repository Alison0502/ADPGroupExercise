/*
 * TestEmployee.java
 * This is the test class for Employee
 * Brandon Wise - 220049173
 * 14 March 2023
 */

package za.ac.cput.domain;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import java.time.Duration;
import static org.junit.jupiter.api.Assertions.*;

public class TestEmployee {
    @Test
    public void testEquality() {
        Employee emp1 = new Employee("1000", "Steven", "Smith");
        Employee emp2 = new Employee("1000", "Steven", "Smith");

        assertEquals(emp1, emp2);
    }

    @Test
    public void testIdentity() {

        Employee employee1 = new Employee("1001", "Brandon", "Wise");
        Employee employee2 = new Employee("1001", "Brandon", "Wise");

        assertAll("Employee identity",
                () -> assertNotNull(employee1),
                () -> assertNotNull(employee2),
                () -> assertEquals(employee1.getEmployeeNumber(), employee2.getEmployeeNumber()),
                () -> assertEquals(employee1.getFirstName(), employee2.getFirstName()),
                () -> assertEquals(employee1.getLastName(), employee2.getLastName())
        );
    }

    @Test
    public void testFail() {
        assertThrows(IllegalArgumentException.class, () -> new Employee("", "John", "Brown"));
        assertThrows(NullPointerException.class, () -> new Employee("1001", null, "Brown"));
        assertThrows(NullPointerException.class, () -> new Employee("1001", "John", null));
    }

    @Test
    void testTimeout() {
        assertTimeoutPreemptively(Duration.ofSeconds(1), () -> {
            Employee employee = new Employee("1003", "Steven", "Jones");
            assertEquals("1003", employee.getEmployeeNumber());
            assertEquals("Steven", employee.getFirstName());
            assertEquals("Jones", employee.getLastName());
        });
    }

    // Disabled test method
    @Disabled("This test is currently disabled.")
    @Test
    void testEmployeeSalary() {
        // To be continued
    }
}