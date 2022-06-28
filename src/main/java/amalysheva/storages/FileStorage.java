package amalysheva.storages;

import amalysheva.entities.Persistable;

import java.io.*;

public abstract class FileStorage<T extends Persistable> implements Storage<T> {

    public T saveIntoFile(String directory, T type) throws IOException {
        String filename = type.getFilename();
        FileWriter writer = new FileWriter(directory + filename);
        String newFile = type.toString();
        writer.write(newFile);
        writer.close();
        return type;
    }

    public T readItemInfo(String directory, String filename) throws IOException {
        BufferedReader fileForRead = new BufferedReader(new FileReader(directory + filename + ".csv"));
        String answer = fileForRead.readLine();
        fileForRead.close();
        return deserialize(answer);
    }

    abstract protected T deserialize(String answer);

    public T deleteFile(String directory, String filename) throws IOException {
        File fileForDelete = new File(directory, filename);
        T temp = readItemInfo(directory, filename);
        fileForDelete.delete();
        return temp;
    }

    public String[] getList(String directory) {
        File showFile = new File(directory);
        return showFile.list();
    }

}
