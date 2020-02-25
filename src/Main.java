import java.util.*;

public class Main {

    public static void main(String[] args) {
        // (hash map like POST request as example)
        simulate_admin_create_employee();
    }

    private static void simulate_admin_create_employee() {
        String[] phones = {"89177672541"};
        String[] emails = {"sashok@gmail.com"};
        Admin admin = new Admin("Alexander", "Trushin", phones, emails, "12jlk3yh4gvkj213h");

        Map<String, Object> data = new HashMap<String, Object>();
        data.put("name", "Alexander");
        data.put("surname", "Trushin");
        data.put("password", "i1234gb1jk2hb3");
        Employee employee = admin.createEmployee(data);

        System.out.print("Employee in storage before deletion: ");
        System.out.println(Employee.storage.contains(employee));

        System.out.println("--- Employee information ---");
        System.out.println(employee.name);
        System.out.println(employee.surname);
        System.out.println(employee.password);
        System.out.println(employee.status);
        System.out.println("------\n");

        admin.deleteEmployee(employee);

        System.out.print("Employee in storage after deletion: ");
        System.out.println(Employee.storage.contains(employee));
    }

}
