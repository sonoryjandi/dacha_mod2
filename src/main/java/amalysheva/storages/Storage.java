package amalysheva.storages;

import amalysheva.entities.Persistable;

import java.io.File;
import java.io.IOException;

public interface Storage<T extends Persistable>{
    T saveIntoFile(File directory, T item, boolean overwritingAllowed) throws IOException;
    
    T readItemInfo(File directory, String filename) throws IOException;

    T deleteFile(File directory, String filename) throws IOException;

    String[] getList(File directory);

    String getSubDir();
}
