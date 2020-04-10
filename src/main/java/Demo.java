import java.sql.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Employee> employees = select();
        System.out.println(employees);
    }

    private static void insertUpdateDelete() {
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/demo", "admin", "pass123");
             Statement statement = connection.createStatement()) {
            statement.executeUpdate("insert into employees (id, first_name, middle_name, last_name, salary, some_date, some_time, some_datetime, active) " +
                    "values('5', 'Jubilee', 'Suarez', 'Sayin', '1234', '2020-04-10', '12:18:00', '2020-04-10 12:18:00', '0' )");
            statement.executeUpdate("UPDATE employees SET first_name = 'Pearly' WHERE id = 5");
            statement.executeUpdate("delete from employees where id = 5");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static List<Employee> select() {
        List<Employee> employees = new ArrayList<>();
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/demo", "admin", "pass123");
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("select * from employees")) {
            while (resultSet.next()) {
                Employee employee = new Employee();
                employee.setId(resultSet.getInt("ID"));
                employee.setFirstName(resultSet.getString("FIRST_NAME"));
                employee.setMiddleName(resultSet.getString("MIDDLE_NAME"));
                employee.setLastName(resultSet.getString("LAST_NAME"));
                employee.setSalary(resultSet.getDouble("SALARY"));
                employee.setSomeDate(resultSet.getDate("SOME_DATE").toLocalDate());
                employee.setSomeTime(resultSet.getTime("SOME_TIME").toLocalTime());
                employee.setSomeDateTime(resultSet.getTimestamp("SOME_DATETIME").toLocalDateTime());
                employee.setActive(resultSet.getBoolean("ACTIVE"));

                employees.add(employee);
            }
            return employees;
        } catch (SQLException e) {
            e.printStackTrace();
            return employees;
        }
    }
}
