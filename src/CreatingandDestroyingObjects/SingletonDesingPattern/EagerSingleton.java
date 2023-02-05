package CreatingandDestroyingObjects.SingletonDesingPattern;

public class EagerSingleton {

    public static final EagerSingleton instance = new EagerSingleton();

    public EagerSingleton() {
    }

    public static EagerSingleton getInstance(){
        return instance;
    }
}
