package JDBCTask.dao.DAOInterfaces;

import JDBCTask.dao.DAOImpl.DepartmentDAOImpl;
import JDBCTask.dao.DAOImpl.EmployeeDAOImpl;
import JDBCTask.dao.DAOImpl.TaskDAOImpl;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DAOFactory {
    private String propertiesFileName = "db";
    public Connection getConnection() throws SQLException {
        Properties properties = new Properties();
        Connection connection = null;
        try (FileInputStream fileInputStream = new FileInputStream("src/main/resources/" + propertiesFileName + ".properties")) {
            properties.load(fileInputStream);
            Class.forName(properties.getProperty("db_driver"));
            connection = DriverManager.getConnection(properties.getProperty("db_url"), properties.getProperty("db_user"), properties.getProperty("db_password"));
        } catch (SQLException | ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }
        return connection;
    }

    public String getPropertiesFileName() {
        return propertiesFileName;
    }

    public void setPropertiesFileName(String propertiesFileName) {
        this.propertiesFileName = propertiesFileName;
    }

    TaskDAO getTaskDAO(Connection connection) {
        return new TaskDAOImpl(connection);
    }

    DepartmentDAO getDepartmentDAO(Connection connection) {
        return new DepartmentDAOImpl(connection);
    }

    EmployeeDAO getEmployeeDAO(Connection connection) {
        return new EmployeeDAOImpl(connection);
    }

}
