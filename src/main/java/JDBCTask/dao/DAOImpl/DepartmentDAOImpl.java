package JDBCTask.dao.DAOImpl;

import JDBCTask.Entities.Department;
import JDBCTask.dao.DAOInterfaces.DepartmentDAO;

import java.sql.Connection;
import java.util.List;

public class DepartmentDAOImpl implements DepartmentDAO {
    private final Connection connection;

    public DepartmentDAOImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public Department read(int id) {
        return null;
    }

    @Override
    public List<Department> readAll() {
        return null;
    }

    @Override
    public void update(Department department) {

    }

    @Override
    public void delete(Department department) {

    }

    @Override
    public Department create() {
        return null;
    }
}
