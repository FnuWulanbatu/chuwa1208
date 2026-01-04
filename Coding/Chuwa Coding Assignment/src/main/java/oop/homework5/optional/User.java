package oop.homework5.optional;

public class User {
    private final String name;
    private final String email; // nullable
    private final Integer age; // nullable

    public User(String name, String email, Integer age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Integer getAge() {
        return age;
    }
}


