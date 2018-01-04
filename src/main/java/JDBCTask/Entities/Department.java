package JDBCTask.Entities;

public class Department {
    private int id;
    private String departmentName;
    private String phoneNumber;

    public Department(int id, String departmentName, String phoneNumber) {
        this.id = id;
        this.departmentName = departmentName;
        this.phoneNumber = phoneNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
