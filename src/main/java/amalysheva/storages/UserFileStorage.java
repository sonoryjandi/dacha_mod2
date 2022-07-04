package amalysheva.storages;


import amalysheva.entities.User;

public abstract class UserFileStorage extends FileStorage<User> {
    @Override
    protected User deserialize(String answer) {
        String[] fields = answer.split(",");
        return new User(Integer.parseInt(fields[0]),fields[1], fields[2], Integer.parseInt(fields[3]), fields[4]);
    }
}
