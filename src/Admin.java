import java.util.Collection;
import java.util.LinkedList;
import java.util.Map;

public class Admin extends HR {

    static Collection<Admin> storage = new LinkedList<>();

    Admin(String name, String surname, String[] phones, String[] emails, String password) {
        super(name, surname, phones, emails, password);
        Admin.storage.add(this);
    }

    public Admin clone() {
        return new Admin(this.getName(), this.getSurname(), this.getPhones(), this.getEmails(), this.password);
    }

    Employee createEmployee(Map<String, Object> data) {
        String emp_name = null;
        String emp_surname = null;
        String emp_password = null;
        try {
            emp_name = (String) data.get("name");
            if (getName() == null) {
                System.err.println("field is not presented");
                System.exit(-1);
            }

        } catch (ClassCastException exception) {
            System.err.println("Invalid Format");
            System.exit(-1);
        }

        try {
            emp_surname = (String) data.get("surname");
            if (getSurname() == null) {
                System.err.println("field [surname] is not presented");
                System.exit(-1);
            }
        } catch (ClassCastException exception) {
            System.err.println("Invalid Format");
            System.exit(-1);
        }

        try {
            emp_password = (String) data.get("password");
            if (password == null) {
                System.err.println("field [password] is not presented");
                System.exit(-1);
            }
        } catch (ClassCastException exception) {
            System.err.println("Invalid Format");
            System.exit(-1);
        }

        // Manual serialization etc...

        EmployeeBuilder employee_builder = new EmployeeBuilder();
        employee_builder.setName(emp_name);
        employee_builder.setSurname(emp_surname);
        employee_builder.setPassword(emp_password);

        return employee_builder.build();
    }

    void deleteEmployee(Employee employee) {
        Employee.storage.remove(employee);
    }
}
