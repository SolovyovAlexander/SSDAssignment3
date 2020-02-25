public abstract class HumanEntity {
    int identityNumber;
    String name;
    String surname;
    String[] phones;
    String[] emails;
    String password;
    boolean isLogin;

    public String login (String phone, String password){
        return null;
    }
    public void logout(){}
}
