import java.util.*;

public class Admin extends HR {

    public static Collection<Admin> storage = new LinkedList<>();

    public Admin(String name, String surname, String[] phones, String[] emails, String password) {
        super(name, surname, phones, emails, password);
        Admin.storage.add(this);
    }

    public Employee createEmployee(Map<String, Object> data){
        String emp_name = null;
        String emp_surname = null;
        String emp_password = null;
        try {
            emp_name = (String) data.get("name");
            if (name == null) {
                System.err.println("field is not presented");
                System.exit(-1);
            }

        } catch (ClassCastException exception) {
            System.err.println("Invalid Format");
            System.exit(-1);
        }

        try {
            emp_surname = (String) data.get("surname");
            if (surname == null) {
                System.err.println("field [surname] is not presented");
                System.exit(-1);
            }
        } catch (ClassCastException exception) {
            System.err.println("Invalid Format");
            System.exit(-1);
        }

        try {
            emp_password = (String) data.get("password");
            if (surname == null) {
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
    public void deleteEmployee(Employee employee){
        Employee.storage.remove(employee);
    }
}
