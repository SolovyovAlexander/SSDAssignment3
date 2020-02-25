public abstract class HumanEntity {
    int identityNumber;
    String name;
    String surname;
    String[] phones;
    String[] emails;
    String password;

    public HumanEntity(String name, String surname, String[] phones, String[] emails, String password) {
        this.name = name;
        this.surname = surname;
        this.phones = phones;
        this.emails = emails;
        this.password = password;
    }

    public String login (String phone, String password){
        return null;
    }
    public void logout(){}
}
