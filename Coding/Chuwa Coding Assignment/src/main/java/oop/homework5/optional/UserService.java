package oop.homework5.optional;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class UserService {
    private final Map<String, User> users;

    public UserService() {
        this.users = new HashMap<String, User>();
    }

    public void addUser(User user) {
        users.put(user.getName(), user);
    }

    public Optional<User> findUserByName(String name) {
        return Optional.ofNullable(users.get(name));
    }

    public String getUserEmail(User user) {
        return Optional.ofNullable(user.getEmail()).orElse("No email provided");
    }

    public int getUserAge(User user) {
        Integer age = Optional.ofNullable(user.getAge()).orElse(Integer.valueOf(0));
        return age.intValue();
    }
}


