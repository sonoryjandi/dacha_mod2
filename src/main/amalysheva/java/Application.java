public class Application implements UserWorkerInterface {
    @Override
    public boolean saveIntoFile() {
        return false;
    }

    @Override
    public boolean readUserInfo() {
        return false;
    }

    @Override
    public boolean deleteFile() {
        return false;
    }

    @Override
    public void showUserList() {

    }
}
