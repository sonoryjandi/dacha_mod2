package amalysheva;

import java.io.File;
import java.util.Scanner;

public class Application {
    public static final Scanner scanner = new Scanner(System.in);
    private String directory;
    private UserWorker userWorker = new UserWorker();

    public void start() {
        menu();
    }

    private void menu() {
        pathInitialisation();
        while (true) {
            showMenu();
            switch (scanner.nextLine()) {
                case "1":
                    saveIntoFile();
                    break;
                case "2":
                    readUserInfo();
                    break;
                case "3":
                    deleteFile();
                    break;
                case "4":
                    showUserList();
                    break;
                case "0":
                    return;
                default:
                    System.out.println("Wrong case");
            }
        }
    }

    private User createUser() {
        System.out.println("Enter id");
        int id = scanner.nextInt();

        System.out.println("Enter nickname");
        String nickname = scanner.next();

        System.out.println("Enter name");
        String name = scanner.next();

        System.out.println("Enter age");
        int age = scanner.nextInt();

        System.out.println("Enter grade");
        String grade = scanner.next();
        scanner.nextLine();

        return new User(id, nickname, name, age, grade);
    }

    private void pathInitialisation() {
        System.out.println("Directory:");
        while (true) {
            String pathForCheck = scanner.nextLine();
            if (new File(pathForCheck).exists()) {
                this.directory = pathForCheck;
                break;
            }
            System.out.println("Wrong directory path, try again");
        }
        char[] directoryLastSignForCheck = directory.toCharArray();
        if (directoryLastSignForCheck[directoryLastSignForCheck.length - 1] != '\\') {
            directory += '\\';
        }
    }

    private boolean saveIntoFile() {
        User newUser = createUser();
        String newUserFilename = newUser.getId() + newUser.getNickname() + ".csv";
        try {
            if ((new File(directory, newUserFilename)).exists()) {
                System.out.println("File does exist. Want to overwrite it? yes/no");
                switch (scanner.nextLine()) {
                    case "yes":
                        userWorker.saveIntoFile(directory, newUser);
                        System.out.println("User is added");
                        return true;
                    case "no":
                        System.out.println("Please, rename the file");
                        userWorker.saveIntoFile(directory, createUser());
                        System.out.println("User is added");
                        return true;
                    default:
                        System.out.println("Wrong case, try again");
                }
            } else {
                userWorker.saveIntoFile(directory, newUser);
                System.out.println("User is added");
            }
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
        return true;
    }

    private boolean readUserInfo() {
        System.out.println("Enter user filename");
        try {
            String filename = scanner.nextLine();
            System.out.println("User " + filename + ": " + userWorker.readUserInfo(directory, filename));
            return true;
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
            return false;
        }
    }

    private boolean deleteFile() {
        System.out.println("Enter user filename you want to delete");
        String filename = scanner.nextLine();
        if (new File(directory + filename + ".csv").exists()) {
            System.out.println(userWorker.deleteFile(directory, filename + ".csv"));
            return true;
        }
        System.out.println("Error. User is not found");
        return false;
    }

    private void showUserList() {
        userWorker.showUserList(directory);
    }

    private void showMenu() {
        System.out.println("1. Create user & write this into file\n" +
                "2. Read user from file\n" +
                "3. Delete file\n" +
                "4. Show list of files\n" +
                "0. Exit");
    }
}
