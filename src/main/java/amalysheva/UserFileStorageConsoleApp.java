package amalysheva;

import amalysheva.entities.User;

public class UserFileStorageConsoleApp extends FileStorageConsoleApp<User> {
    private final String SUB_DIR = "User";
    @Override
    User initialization() {
        System.out.println("Enter id");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter nickname");
        String nickname = scanner.nextLine();

        System.out.println("Enter name");
        String name = scanner.nextLine();

        System.out.println("Enter age");
        int age = scanner.nextInt();

        System.out.println("Enter grade");
        String grade = scanner.next();
        scanner.nextLine();

        return new User(id, nickname, name, age, grade);
    }

    @Override
    String getSubDir() {
        return SUB_DIR;
    }
}
