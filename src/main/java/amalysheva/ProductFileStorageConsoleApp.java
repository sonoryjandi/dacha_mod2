package amalysheva;

import amalysheva.entities.Product;

public class ProductFileStorageConsoleApp extends FileStorageConsoleApp<Product>{
    private final String SUB_DIR = "Product";

    @Override
    Product initialization() {
        System.out.println("Enter id");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter name");
        String name = scanner.nextLine();

        return new Product(id, name);
    }

    @Override
    String getSubDir() {
        return SUB_DIR;
    }
}
