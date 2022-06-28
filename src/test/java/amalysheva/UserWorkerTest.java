package amalysheva;

import amalysheva.entities.User;
import amalysheva.storages.FileStorage;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIOException;

class UserWorkerTest {
    private User user1 = new User(1, "nicmurdoc", "Nic", 25, "admin");
    private User user2 = new User(2, "2d", "Stuart Harold", 23, "admin");
    private FileStorage userWorker = new FileStorage();
    private String directory = "C:\\Users\\Anastasia\\Desktop\\DirectoryTask\\UserWorkerTest\\";

    @Test
    void saveIntoFileReturnsFilename() throws IOException {
        clearDirectory();
        assertThat(userWorker.saveIntoFile(directory, user1)).isEqualTo("1nicmurdoc.csv");
        assertThat(userWorker.saveIntoFile(directory, user2)).isEqualTo("22d.csv");
    }

    @Test
    void saveIntoFileOverwriteExistedFile() throws IOException {
        clearDirectory();
        assertThat(userWorker.saveIntoFile(directory, user1)).isEqualTo("1nicmurdoc.csv");
        User user1 = new User(1, "nicmurdoc", "Sick", 29, "admin");
        assertThat(userWorker.saveIntoFile(directory, user1)).isEqualTo("1nicmurdoc.csv");
        assertThat(userWorker.readItemInfo(directory, "1nicmurdoc")).isEqualTo("1,nicmurdoc,Sick,29,admin");
    }

    @Test
    void readUserInfo() throws IOException {
        clearDirectory();
        userWorker.saveIntoFile(directory, user1);
        userWorker.saveIntoFile(directory, user2);
        assertThat(userWorker.readItemInfo(directory, "1nicmurdoc")).isEqualTo("1,nicmurdoc,Nic,25,admin");
        assertThat(userWorker.readItemInfo(directory, "22d")).isEqualTo("2,2d,Stuart Harold,23,admin");
    }

    @Test
    void readUserInfoThrowsNoSuchFileException() {
        clearDirectory();
        assertThatIOException().isThrownBy(()-> userWorker.readItemInfo(directory,"22d"));
    }

    @Test
    void deleteFile() throws IOException {
        clearDirectory();
        userWorker.saveIntoFile(directory, user1);
        userWorker.saveIntoFile(directory, user2);
        assertThat(userWorker.deleteFile(directory,"22d"));
    }

    @Test
    void deleteFileFailedBecauseNoSuchFile() throws IOException {
        clearDirectory();
        userWorker.saveIntoFile(directory, user1);
        assertThat(userWorker.deleteFile(directory,"22d")).isFalse();
    }

    @Test
    void showUserList() throws IOException {
        clearDirectory();
        userWorker.saveIntoFile(directory, user1);
        userWorker.saveIntoFile(directory, user2);
        String[] listOfFiles = new File(directory).list();
        assertThat(listOfFiles.length).isEqualTo(2);
    }

    @Test
    void showUserListIsEmpty(){
        clearDirectory();
        String[] listOfFiles = new File(directory).list();
        assertThat(listOfFiles.length).isEqualTo(0);
    }

    private void clearDirectory() {
        String[] listOfFiles = new File(directory).list();
        for (String filename : listOfFiles) {
            new File(directory + filename).delete();
        }
    }
}