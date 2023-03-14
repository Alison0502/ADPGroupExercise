/* This is the TestEmployee.java class

 */

package za.ac.cput.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestEmployee {
    @Test
    public void testEquals() {
        Employee emp1 = new Employee("1000", "Steven", "Smith");
        Employee emp2 = new Employee("1000", "Steven", "Smith");

        assertEquals(emp1, emp2);
    }

    @Test
    public void testEmployeeIdentity() {

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



}
