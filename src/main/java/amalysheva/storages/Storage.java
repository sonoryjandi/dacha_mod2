package amalysheva.storages;

import amalysheva.entities.Persistable;

import java.io.IOException;

public interface Storage<T extends Persistable>{
    T saveIntoFile(String directory, T type, boolean isOverwrited) throws IOException;
    
    T readItemInfo(String directory, String filename) throws IOException;

    T deleteFile(String directory, String filename) throws IOException;

    String[] getList(String directory);
}
