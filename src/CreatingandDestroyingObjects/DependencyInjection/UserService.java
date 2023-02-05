package CreatingandDestroyingObjects.DependencyInjection;

import java.util.List;

public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAll{
        return userRepository.findAll();
    }

    public User getUserById{
        return userRepository.findById();
    }
}
