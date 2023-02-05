package CreatingandDestroyingObjects.SingletonDesingPattern;

public class LazySingleton {

    public static LazySingleton instance;
    public static LazySingleton getInstance(){
        if(instance == null){
            return new LazySingleton();
        }
        return instance;
    }
}
