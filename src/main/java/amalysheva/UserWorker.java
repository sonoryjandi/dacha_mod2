package amalysheva;

import java.io.*;

public class UserWorker {

    public String saveIntoFile(String directory, User user) throws IOException {
        String filename = user.getId() + user.getNickname() + ".csv";
            FileWriter writer = new FileWriter(directory + filename);
            writer.write(user.getId() + "," + user.getNickname() + "," + user.getName() + "," + user.getAge() + "," + user.getGrade());
            writer.close();
        return filename;
    }


    public String readUserInfo(String directory, String filename) throws IOException {
        BufferedReader fileForRead = new BufferedReader(new FileReader(directory + filename + ".csv"));
        String answer = fileForRead.readLine();
        fileForRead.close();
        return answer;
    }

    public boolean deleteFile(String directory, String filename) {
        File fileForDelete = new File(directory, filename);
        return fileForDelete.delete();
    }

    public void showUserList(String directory) {
        File showFile = new File(directory);
        String[] listOfFile = showFile.list();
        if (listOfFile.length < 1) {
            System.out.println("Directory is empty");
        }
        for (String s : listOfFile) {
            System.out.println(s);
        }
    }
}
