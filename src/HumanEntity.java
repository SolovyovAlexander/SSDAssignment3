import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Random;

public abstract class HumanEntity {
    int identityNumber;
    String name;
    String surname;
    String[] phones;
    String[] emails;
    String password;
    private String auth_token = null;

    public HumanEntity(String name, String surname, String[] phones, String[] emails, String password) {
        this.name = name;
        this.surname = surname;
        this.phones = phones.clone();
        this.emails = emails.clone();
        this.password = password;
    }

    // login Pseudo implementation
    public String login(String phone_or_email, String password){
        System.out.println(Arrays.asList(this.phones));
        System.out.println(Arrays.asList(this.phones).contains(phone_or_email));
        if (Arrays.asList(this.phones).contains(phone_or_email) && this.password.equals(password)) {
            byte[] array = new byte[32];
            new Random().nextBytes(array);
            this.auth_token = new String(array, Charset.forName("UTF-8"));
            return this.auth_token;
        } else {
            return null;
        }
    }
    public void logout(){
        this.auth_token = null;
    }
}
