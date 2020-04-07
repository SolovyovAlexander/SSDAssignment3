import Interfaces.Prototype;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Random;

public abstract class HumanEntity implements Prototype {
    private int identityNumber;
    private String name;
    private String surname;
    private String[] phones;
    private String[] emails;
    String password;
    private String auth_token = null;

    public HumanEntity(String name, String surname, String[] phones, String[] emails, String password) {
        this.name = name;
        this.surname = surname;
        this.phones = phones.clone();
        this.emails = emails.clone();
        this.password = password;
    }

    public int getIdentityNumber() {
        return identityNumber;
    }

    public void setIdentityNumber(int identityNumber) {
        this.identityNumber = identityNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String[] getPhones() {
        return phones;
    }

    public void setPhones(String[] phones) {
        this.phones = phones;
    }

    public String[] getEmails() {
        return emails;
    }

    public void setEmails(String[] emails) {
        this.emails = emails;
    }

    public abstract HumanEntity clone() ;


    // login Pseudo implementation
    public String login(String phone_or_email, String password) {
        System.out.println(Arrays.asList(this.phones));
        System.out.println(Arrays.asList(this.phones).contains(phone_or_email));
        if (Arrays.asList(this.phones).contains(phone_or_email) && this.password.equals(password)) {
            byte[] array = new byte[32];
            new Random().nextBytes(array);
            this.auth_token = new String(array, StandardCharsets.UTF_8);
            return this.auth_token;
        } else {
            return null;
        }
    }

    public void logout() {
        this.auth_token = null;
    }
}
