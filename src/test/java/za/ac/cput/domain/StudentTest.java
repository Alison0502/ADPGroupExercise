package za.ac.cput.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    private Student student;

    @BeforeEach
    void setUp() {
        student = new Student("Tamryn","Thomas","219546846@mycput.ac.za","219546846");}
    @Test
    void testStudentNumberIsEqual() {assertEquals( "219546846", student.getStudentNumber());}

    @Test
    void testEmailIsIdentical() { assertSame( "219546846@mycput.ac.za", student.getStudentEmail());}

    @Test
    void testStudentIsNull() { assertNull(student);}

    @Test
    @Timeout(value = 100, unit = TimeUnit.MILLISECONDS)
    void testTimeout(){
        long startTime = System.currentTimeMillis();

        for(int i = 0; i < 1; i++) {
            System.out.println(i);
        }
        long endTime = System.currentTimeMillis();

        System.out.println("That took " + (endTime - startTime) + "milliseconds");
    }

    @Disabled
    @Test
    void testDisableTest() {assertEquals( "Tamryn Thomas",  student.getFirstName() + "" + student.getLastName());}
}