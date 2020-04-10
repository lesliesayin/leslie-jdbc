import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Employee {
    int id;
    String firstName;
    String middleName;
    String lastName;
    double salary;
    LocalDate someDate;
    LocalTime someTime;
    LocalDateTime someDateTime;
    boolean active;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public LocalDate getSomeDate() {
        return someDate;
    }

    public void setSomeDate(LocalDate someDate) {
        this.someDate = someDate;
    }

    public LocalTime getSomeTime() {
        return someTime;
    }

    public void setSomeTime(LocalTime someTime) {
        this.someTime = someTime;
    }

    public LocalDateTime getSomeDateTime() {
        return someDateTime;
    }

    public void setSomeDateTime(LocalDateTime someDateTime) {
        this.someDateTime = someDateTime;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                ", someDate=" + someDate +
                ", someTime=" + someTime +
                ", someDateTime=" + someDateTime +
                ", active=" + active + '\n' +
                '}';
    }
}
