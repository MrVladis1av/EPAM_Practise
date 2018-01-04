package JDBCTask.dao.DAOInterfaces;

import JDBCTask.Entities.Task;

import java.util.List;

public interface TaskDAO {
    Task read(int id);

    List<Task> readAll();

    void update(Task task);

    void delete(Task task);

    Task create();
}
