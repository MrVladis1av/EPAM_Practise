package JDBCTask.dao.DAOImpl;

import JDBCTask.Entities.Task;
import JDBCTask.dao.DAOInterfaces.TaskDAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class TaskDAOImpl implements TaskDAO {
    private final Connection connection;

    public TaskDAOImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public Task read(int id) {
        Task task = null;
        try (Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery("SELECT * FROM task WHERE task_id=" + id);
            resultSet.next();
            task = new Task(resultSet.getInt(1), resultSet.getString(2), resultSet.getInt(3));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return task;
    }

    @Override
    public List<Task> readAll() {
        return null;
    }

    @Override
    public void update(Task task) {

    }

    @Override
    public void delete(Task task) {

    }

    @Override
    public Task create() {
        return null;
    }
}
