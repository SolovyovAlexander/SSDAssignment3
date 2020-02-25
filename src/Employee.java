import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.LinkedList;

public class Employee extends HumanEntity {

    static Collection<Employee> storage = new LinkedList<>();

    int salary;
    boolean isWorking;
    DataTypes.WorkPosition workPosition;
    DataTypes.Education[] educationData;
    DataTypes.Status status;

    public Employee(String name, String surname, String[] phones, String[] emails, String password, int salary, boolean isWorking, DataTypes.WorkPosition workPosition, DataTypes.Education[] educationData, DataTypes.Status status) {
        super(name, surname, phones, emails, password);
        this.salary = salary;
        this.isWorking = isWorking;
        this.workPosition = workPosition;
        this.educationData = educationData;
        this.status = status;
        Employee.storage.add(this);
    }

    public void sendLocation(GPSLocation location){

    }
    public void takePhoto(){

    }
    public ArrayList<GPSLocation> getLocations(Date date){
        return  null;
    }

}
