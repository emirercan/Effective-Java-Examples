package CreatingandDestroyingObjects.DependencyInjection;

import java.util.List;

public class UserRepository {

    public List<User> findAll(){
        return null;
    }

    public User findById(long id){
        return new User(id);
    }
}
