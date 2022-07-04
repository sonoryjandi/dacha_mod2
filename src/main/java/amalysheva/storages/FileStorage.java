package amalysheva.storages;

import amalysheva.entities.Persistable;

import java.io.*;
import java.nio.file.FileAlreadyExistsException;

public abstract class FileStorage<T extends Persistable> implements Storage<T> {

    public T saveIntoFile(File directory, T item, boolean overwritingAllowed) throws IOException {
        String filename = item.getFilename();
        if(new File(directory, filename).exists() && !overwritingAllowed){
            throw new FileAlreadyExistsException("File Already Exists, overwriting is prohibited");
        }
        FileWriter writer = new FileWriter(directory + filename);
        String newFile = item.toString();
        writer.write(newFile);
        writer.close();
        return item;
    }

    public T readItemInfo(File directory, String filename) throws IOException {
        BufferedReader fileForRead = new BufferedReader(new FileReader(directory + filename + ".csv"));
        String answer = fileForRead.readLine();
        fileForRead.close();
        return deserialize(answer);
    }

    abstract protected T deserialize(String answer);

    public T deleteFile(File directory, String filename) throws IOException {
        File fileForDelete = new File(directory, filename);
        if(!fileForDelete.exists()){
            throw new FileNotFoundException("File not found");
        }
        // тут может быть чота не то
        T temp = readItemInfo(new File(directory.toURI()), filename);
        fileForDelete.delete();
        return temp;
    }

    public String[] getList(File directory) {
        File showFile = new File(directory.toURI());
        return showFile.list();
    }

}
