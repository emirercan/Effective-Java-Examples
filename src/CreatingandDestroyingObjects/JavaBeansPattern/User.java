package CreatingandDestroyingObjects.JavaBeansPattern;

public class User {

    //allows inconsistency, mandates mutabilit

    private int ID;
    private String name;
    private String email;
    private String phone;
    private int age;
    private boolean isLogin;

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setLogin(boolean login) {
        isLogin = login;
    }
}
