package amalysheva;

import java.io.FileWriter;
import java.util.Scanner;

public class Application {
    public static final Scanner scanner = new Scanner(System.in);
    private String directory;
//    private UserWorker userWorker = new UserWorker();

    public void start() {
        menu();
    }

    public void menu(){
        pathInitialisation();
        while(true){
            showMenu();
            switch (scanner.nextLine()){
                case "1":
//                    saveIntoFile();
                case "2":
                case "3":
                case "4":
                case "5":
                    System.out.println("");
                default:
                    System.out.println("Wrong case");
            }
        }
    }

    private void pathInitialisation() {
        System.out.println("Directory:");
        this.directory = scanner.nextLine();
    }

    public boolean saveIntoFile(User user, String directory, String fileName) {
        try {
            FileWriter writer = new FileWriter(directory + fileName);
            writer.write(user.getId() + ",");
            writer.write(user.getName() + ",");
            writer.write(user.getAge() + ",");
            writer.write(user.getGrade());
            writer.close();
            return true;
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
            return false;
        }
    }

    public boolean readUserInfo() {
        try{
            return true;
        } catch (Exception exception){

        }
        return false;
    }

    public boolean deleteFile() {
        return false;
    }

    public void showUserList() {

    }

    private void showMenu(){
        System.out.println("1. Create user & write this into file\n" +
                "2. Read user from file\n" +
                "3. Delete file\n" +
                "4. Show list of files\n" +
                "0. Exit");
    }
}
