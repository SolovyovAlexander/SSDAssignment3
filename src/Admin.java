import java.util.Collection;
import java.util.LinkedList;

public class Admin extends HR {

    public static Collection<Admin> storage = new LinkedList<>();

    public Admin(String name, String surname, String[] phones, String[] emails, String password) {
        super(name, surname, phones, emails, password);
        Admin.storage.add(this);
    }

    public Employee createEmployee(){
        return null;
    }
    public Employee updateEmployee(){
        return null;
    }
    public void deleteEmployee(int idNumber){

    }
}
