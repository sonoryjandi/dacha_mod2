package amalysheva;

import java.io.*;

public class UserWorker {
    private String directory;

    public UserWorker(String directory) {
        this.directory = directory;
    }

    //createNewFile
    public String saveIntoFile(User user) throws IOException {
        String filename = user.getNickname() + user.getId() + ".csv";
        File file = new File(directory, filename);
        FileWriter writer = new FileWriter(directory + filename);
        writer.write(user.getId() + "," + user.getNickname() + "," + user.getName() + "," + user.getAge() + "," + user.getGrade());
        writer.close();
        //проверка
        return filename;
    }

    public String readUserInfo(String filename) throws IOException {
        BufferedReader fileForRead = new BufferedReader(new FileReader(directory + filename));
        String answer = fileForRead.readLine();
        fileForRead.close();
        return answer;
    }

    public boolean deleteFile(String filename) {
        File fileForDelete = new File(directory, filename);
        return fileForDelete.delete();
    }

    public void showUserList() {
        File showFile = new File(directory);
        String[] listOfFile = showFile.list();
        for (String s : listOfFile) {
            System.out.println(s);
        }
    }

    public void createNewEmptyFile(String filename) throws IOException {
        File file = new File(directory + filename + ".csv");
        if (file.createNewFile()) {
            System.out.println("File created");
        } else {
            System.out.println("File already created");
        }
    }
}
