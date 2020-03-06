import DataTypes.StatusType;
import DataTypes.WorkPositionType;

//Builder Pattern
public class EmployeeBuilder {

    private String name;
    private String surname;
    private String[] phones = {};
    private String[] emails = {};
    private String password;
    private Integer salary = 0;
    private boolean isWorking = true;
    private StatusType status = StatusType.WORKING;
    private Education[] educationData = null;
    private WorkPositionType position = null;

    public Employee build() {
        return new Employee(name, surname, phones, emails, password, salary, isWorking, position, educationData, status);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPhones(String[] phones) {
        this.phones = phones;
    }

    public void setEmails(String[] emails) {
        this.emails = emails;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public void setWorking(boolean working) {
        isWorking = working;
    }

    public void setStatus(StatusType status) {
        this.status = status;
    }

    public void setEducationData(Education[] educationData) {
        this.educationData = educationData;
    }

    public void setPosition(WorkPositionType position) {
        this.position = position;
    }


}
