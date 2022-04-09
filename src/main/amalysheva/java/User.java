import java.util.Objects;

public class User {
    private int id;
    private String name;
    private int age;
    private String permissions;

    public User(int id, String name, int age, String permissions) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.permissions = permissions;
    }

    //region get/set

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPermissions() {
        return permissions;
    }

    public void setPermissions(String permissions) {
        this.permissions = permissions;
    }
    //endregion

    @Override
    public boolean equals(Object otherUser) {
        if (this == otherUser) return true;
        if (!(otherUser instanceof User)) return false;
        User user = (User) otherUser;
        return getId() == user.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
