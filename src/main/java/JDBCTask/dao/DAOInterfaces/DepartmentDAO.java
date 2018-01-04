package JDBCTask.dao.DAOInterfaces;

import JDBCTask.Entities.Department;

import java.util.List;

public interface DepartmentDAO {
    Department read(int id);

    List<Department> readAll();

    void update(Department department);

    void delete(Department department);

    Department create();
}
