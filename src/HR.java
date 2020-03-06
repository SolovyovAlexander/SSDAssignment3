import java.util.Collection;
import java.util.Date;
import java.util.LinkedList;

public class HR extends HumanEntity {

    static Collection<HR> storage = new LinkedList<>();

    HR(String name, String surname, String[] phones, String[] emails, String password) {
        super(name, surname, phones, emails, password);
        HR.storage.add(this);
    }

    public HR clone() {
        return new HR(this.getName(), this.getSurname(), this.getPhones(), this.getEmails(), this.password);
    }

    public GPSLocation checkUserLocation(int idNumber, Date date) {
        return null;
    }

    public int checkSalary(int id, Date date) {
        return 0;
    }

}
