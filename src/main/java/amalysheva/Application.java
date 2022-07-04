package amalysheva;

import amalysheva.entities.Product;
import amalysheva.entities.User;

import java.util.Scanner;

public class Application {
    Scanner scanner = new Scanner(System.in);

    public void start(){
        while (true){
            System.out.println("Which object you want to work to? /n" +
                    "User - 1/n" +
                    "Product - 2");
            switch (scanner.nextLine()){
                case "1":
                    FileStorageConsoleApp<User> userFileStorageConsoleApp = new UserFileStorageConsoleApp();
                    userFileStorageConsoleApp.start();
                case "2":
                    FileStorageConsoleApp<Product> productFileStorageConsoleApp = new ProductFileStorageConsoleApp();
                    productFileStorageConsoleApp.start();
                default:
                    System.out.println("Wrong number, try again");
            }
        }
    }
}

