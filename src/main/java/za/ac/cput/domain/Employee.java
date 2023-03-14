package za.ac.cput.domain;

public class Employee {
        private String employeeNumber;
        private String firstName;
        private String lastName;

    public Employee(){}

    public Employee(String employeeNumber, String firstName, String lastName){

        if (employeeNumber == null || employeeNumber.isEmpty()) {
            throw new IllegalArgumentException("Employee number cannot be null or empty.");
        }
        if (firstName == null || firstName.isEmpty()) {
            throw new NullPointerException("First name cannot be null or empty.");
        }
        if (lastName == null || lastName.isEmpty()) {
            throw new NullPointerException("Last name cannot be null or empty.");
        }

        this.employeeNumber = employeeNumber;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getEmployeeNumber() { return employeeNumber; }

    public String getFirstName() { return firstName; }

    public String getLastName() { return lastName; }

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Employee)) {
            return false;
        }
        Employee other = (Employee) obj;
        return this.employeeNumber.equals(other.employeeNumber)
                && this.firstName.equals(other.firstName)
                && this.lastName.equals(other.lastName);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeNumber='" + employeeNumber + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}