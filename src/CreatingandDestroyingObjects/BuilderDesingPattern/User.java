package CreatingandDestroyingObjects.BuilderDesingPattern;

public class User {

    //required parameters
    private final int ID;
    private final String name;
    private final String email;

    //optional parameters
    private final String phone;
    private final int age;
    private final boolean isLogin;

    public static class Builder {
        private final int ID;
        private final String name;
        private final String email;

        private String phone = null;
        private int age = Integer.parseInt(null);
        private boolean isLogin = Boolean.parseBoolean(null);

        public Builder(int ID, String name, String email) {
            this.ID = ID;
            this.name = name;
            this.email = email;
        }

        public Builder phone(String phoneNumber){
            phone = phoneNumber;
            return this;
        }

        public Builder age(int age){
            this.age = age;
            return this;
        }

        public Builder isLogin(boolean bool){
            isLogin = bool;
            return this;
        }

        public User build(){
            return new User(this);
        }
    }

    private User(Builder builder){
        ID = builder.ID;
        name = builder.name;
        email = builder.email;
        phone = builder.phone;
        age = builder.age;
        isLogin = builder.isLogin;
    }


}
