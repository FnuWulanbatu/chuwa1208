package oop.homework5.optional;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        UserService service = new UserService();
        service.addUser(new User("Alice", "alice@example.com", Integer.valueOf(20)));
        service.addUser(new User("Bob", null, Integer.valueOf(25)));
        service.addUser(new User("Carol", "carol@example.com", null));

        Optional<User> aliceOpt = service.findUserByName("Alice");
        System.out.println("Alice isPresent: " + aliceOpt.isPresent());
        aliceOpt.ifPresent(user -> System.out.println("Alice email: " + service.getUserEmail(user)));

        Optional<User> nobodyOpt = service.findUserByName("Nobody");
        System.out.println("Nobody isPresent: " + nobodyOpt.isPresent());
        nobodyOpt.ifPresent(user -> System.out.println(user.getName()));

        User bob = service.findUserByName("Bob").get();
        System.out.println("Bob email: " + service.getUserEmail(bob));
        System.out.println("Bob age: " + service.getUserAge(bob));

        System.out.println("---- orElse vs orElseGet ----");
        Optional<String> presentEmail = Optional.of("present@example.com");

        String a = presentEmail.orElse(expensiveDefault("orElse"));
        System.out.println("orElse result: " + a);

        String b = presentEmail.orElseGet(() -> expensiveDefault("orElseGet"));
        System.out.println("orElseGet result: " + b);

        Optional<String> emptyEmail = Optional.<String>empty();
        String c = emptyEmail.orElse(expensiveDefault("orElse(empty)"));
        System.out.println("orElse(empty) result: " + c);

        String d = emptyEmail.orElseGet(() -> expensiveDefault("orElseGet(empty)"));
        System.out.println("orElseGet(empty) result: " + d);
    }

    private static String expensiveDefault(String label) {
        System.out.println("Generating default value: " + label);
        return "No email provided";
    }
}


