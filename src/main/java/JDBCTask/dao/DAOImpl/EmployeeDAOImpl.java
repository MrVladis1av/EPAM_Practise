package JDBCTask.dao.DAOImpl;

import JDBCTask.Entities.Employee;
import JDBCTask.dao.DAOInterfaces.EmployeeDAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAOImpl implements EmployeeDAO {
    private final Connection connection;

    public EmployeeDAOImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public Employee read(int id) {
        Employee employee = null;
        try (Statement statement = connection.createStatement()) {
            ResultSet rs = statement.executeQuery("SELECT * FROM employees JOIN department ON employees.department_num=department.department_num WHERE id=" + id);
            rs.next();
            employee = new Employee(
                    rs.getInt(1)
                    , rs.getString(2)
                    , rs.getString(3)
                    , rs.getString(4)
                    , rs.getInt(5)
                    , rs.getString(7));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return employee;
    }

    @Override
    public List<Employee> readAll() {
        ArrayList list = new ArrayList();
        try (Statement statement = connection.createStatement()) {
            ResultSet rs = statement.executeQuery("SELECT * FROM employees JOIN department ON employees.department_num=department.department_num");
            rs.next();
            list.add(new Employee(
                    rs.getInt(1)
                    , rs.getString(2)
                    , rs.getString(3)
                    , rs.getString(4)
                    , rs.getInt(5)
                    , rs.getString(7)));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    public List<Employee> readByDepartment(int departmentNum) {
        ArrayList list = new ArrayList();
        try (Statement statement = connection.createStatement()) {
            ResultSet rs = statement.executeQuery("SELECT * FROM employees " +
                    "JOIN department ON employees.department_num=department.department_num " +
                    "WHERE employees.department_num=" + departmentNum);
            rs.next();
            list.add(new Employee(
                    rs.getInt(1)
                    , rs.getString(2)
                    , rs.getString(3)
                    , rs.getString(4)
                    , rs.getInt(5)
                    , rs.getString(7)));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public void update(Employee employee) {

    }

    @Override
    public void delete(int id) {
        try (Statement statement = connection.createStatement()) {
            statement.executeUpdate("DELETE FROM employees WHERE id=" + id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Employee create() {
        return null;
    }

}
