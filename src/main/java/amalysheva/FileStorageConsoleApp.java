package amalysheva;

import amalysheva.entities.Persistable;
import amalysheva.storages.Storage;

import java.io.File;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class FileStorageConsoleApp<T extends Persistable> {
    public static final Scanner scanner = new Scanner(System.in);
    private File directory;
    private Storage<T> storage;
    private final Logger LOG = Logger.getLogger(this.getClass().getName());

    public void start() {
        pathInitialisation();
        while (true) {
            showMenu();
            switch (scanner.nextLine()) {
                case "1":
                    saveIntoFile();
                    break;
                case "2":
                    readFromFile();
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

    private void pathInitialisation() {
//        System.out.println("Directory:");
//        while (true) {
//            String pathForCheck = scanner.nextLine();
//            if (new File(pathForCheck).exists()) {
//                this.directory = pathForCheck;
//                break;
//            }
//            System.out.println("Wrong directory path, try again");
//        }
//        char[] directoryLastSignForCheck = directory.toCharArray();
//        if (directoryLastSignForCheck[directoryLastSignForCheck.length - 1] != '\\') {
//            directory += '\\';
//        }

        directory = new File(storage.getSubDir(), "Stuff");
    }

    private boolean saveIntoFile() {
        T newItem = initialization();
        System.out.println("If file exist, do you want to overwrite it? yes - 1, no - 0");
        boolean answer = scanner.nextBoolean();
        try {
            LOG.info("Item " + storage.saveIntoFile(directory, newItem, answer) + " is added");
        } catch (Exception exception) {
            LOG.log(Level.WARNING, exception.getMessage(), exception);
        }
        return true;
    }

    abstract T initialization();

    private boolean readFromFile() {
        System.out.println("Enter item filename");
        try {
            String filename = scanner.nextLine();
            LOG.info("Item " + filename + ": " + storage.readItemInfo(directory, filename));
            return true;
        } catch (Exception exception) {
            LOG.log(Level.WARNING, exception.getMessage(), exception);
            return false;
        }
    }

    private boolean deleteFile() {
        try {
            System.out.println("Enter item filename you want to delete");
            String filename = scanner.nextLine();
            storage.deleteFile(directory, filename + ".csv");
            LOG.info("Item " + filename + " is deleted");
            return true;
        } catch (Exception exception) {
            LOG.log(Level.WARNING, exception.getMessage(), exception);
        }
        return false;
    }

    private void showUserList() {
        storage.getList(directory);
    }

    private void showMenu() {
        System.out.println("1. Create user & write this into file\n" +
                "2. Read user from file\n" +
                "3. Delete file\n" +
                "4. Show list of files\n" +
                "0. Exit");
    }

    abstract String getSubDir();
}
