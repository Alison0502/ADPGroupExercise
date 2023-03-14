package za.ac.cput.domain;

import java.util.Objects;

public class Student {
    private String firstName;
    private String lastName;
    private String studentEmail;
    private String studentNumber;



    public Student(){

    }
    public Student(String firstName, String lastName, String studentEmail, String studentNumber){
        this.firstName =firstName;
        this.lastName = lastName;
        this.studentEmail = studentEmail;
        this.studentNumber = studentNumber;
    }



    public String getFirstName() {return firstName;}

    public String getLastName() {return lastName;}

    public String getStudentEmail() {return studentEmail;}

    public String getStudentNumber() {return studentNumber;}

    public void setFirstName(String firstName) {this.firstName = firstName;}

    public void setLastName(String lastName) {this.lastName = lastName;}

    public void setStudentEmail(String studentEmail) {this.studentEmail = studentEmail;}

    public void setStudentNumber(String studentNumber) {this.studentNumber = studentNumber;}

    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student student = (Student) obj;
        return Objects.equals(firstName, student.firstName) &&
                Objects.equals(lastName, student.lastName) &&
                Objects.equals(studentEmail, student.studentEmail) &&
                Objects.equals(studentNumber, student.studentNumber);
    }

    @Override
    public int hashCode(){
        return Objects.hash(firstName,
                lastName,
                studentEmail,
                studentNumber);

    }

    @Override
    public String toString(){
        return "Student{" +
                "FirstName='" + firstName + '\'' +
                ", LastName='" + lastName + '\'' +
                ", StudentEmail='" + studentEmail + '\'' +
                ", StudentNumber='" + studentNumber + '\'' +
                '}';
    }
}
