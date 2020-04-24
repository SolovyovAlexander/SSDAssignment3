import Classes.Context;
import Classes.RestingAtHomeState;
import DataTypes.StatusType;
import DataTypes.WorkPositionType;
import Interfaces.State;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.LinkedList;

public class Employee extends HumanEntity {

    static Collection<Employee> storage = new LinkedList<>();
    private StatusType status;
    private int salary;
    private boolean isWorking;
    private WorkPositionType workPosition;
    private Education[] educationData;
    private Context context;

    Employee(String name, String surname, String[] phones, String[] emails, String password, int salary, boolean isWorking, WorkPositionType workPosition, Education[] educationData, StatusType status) {
        super(name, surname, phones, emails, password);
        this.salary = salary;
        this.isWorking = isWorking;
        this.workPosition = workPosition;
        this.educationData = educationData;
        this.status = status;
        this.context = new Context(new RestingAtHomeState());
        Employee.storage.add(this);
    }

    public String getEmployeeState(){
        return this.context.getCurrentActivity();
    }

    public void setEmployeeState(State state){
        this.context.setState(state);
    }

    public StatusType getStatus() {
        return status;
    }

    public void setStatus(StatusType status) {
        this.status = status;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public boolean isWorking() {
        return isWorking;
    }

    public void setWorking(boolean working) {
        isWorking = working;
    }

    public WorkPositionType getWorkPosition() {
        return workPosition;
    }

    public void setWorkPosition(WorkPositionType workPosition) {
        this.workPosition = workPosition;
    }

    public Education[] getEducationData() {
        return educationData;
    }

    public void setEducationData(Education[] educationData) {
        this.educationData = educationData;
    }

    public Employee clone() {
        return new Employee(
                this.getName(), this.getSurname(), this.getPhones(), this.getEmails(), this.password,
                this.getSalary(), this.isWorking(), this.getWorkPosition(),
                this.getEducationData(), this.getStatus()
        );
    }

    public Employee clone(String name, String surname, int salary, String[] emails) {
        return new Employee(
                name, surname, this.getPhones(), emails, this.password,
                salary, this.isWorking(), this.getWorkPosition(),
                this.getEducationData(), this.getStatus()
        );
    }

    public void sendLocation(GPSLocation location) {

    }

    public void takePhoto() {

    }


    public ArrayList<GPSLocation> getLocations(Date date) {
        return null;
    }

}
