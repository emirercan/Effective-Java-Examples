package CreatingandDestroyingObjects.TelescopingConstructorPattern;

public class User {

    //does not scale well

    private int ID;
    private String name;
    private String email;
    private String phone;
    private int age;
    private boolean isLogin;

    public User(int ID, String name) {
        this(ID,name,null);
    }

    public User(int ID, String name, String email) {
        this(ID,name,email,null);
    }

    public User(int ID, String name, String email, String phone) {
        this(ID,name,email,phone,0);
    }

    public User(int ID, String name, String email, String phone, int age) {
        this(ID,name,email,phone,age,null);
    }

    public User(int ID, String name, String email, String phone, int age, Boolean isLogin) {
        this.ID = ID;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.age = age;
        this.isLogin = isLogin;
    }



}
