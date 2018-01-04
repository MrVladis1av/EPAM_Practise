package JDBCTask.dao.DAOInterfaces;

import JDBCTask.Entities.Employee;

import java.util.List;

public interface EmployeeDAO {
    Employee read(int id);

    List<Employee> readAll();

    void update(Employee employee);

    void delete(int id);

    Employee create();
}
