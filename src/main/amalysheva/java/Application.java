import java.io.FileWriter;

public class Application {
    public boolean saveIntoFile(User user, String DIRECTORY, String fileName) {
        try {
            FileWriter writer = new FileWriter(DIRECTORY + fileName);
            writer.write(user.getId() + ",");
            writer.write(user.getName() + ",");
            writer.write(user.getAge() + ",");
            writer.write(user.getPermissions());
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
}
