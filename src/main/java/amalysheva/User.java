package amalysheva;

import java.util.Objects;

public class User {
    private int id;
    private String nickname;
    private String name;
    private int age;
    private String grade;

    public User(int id, String nickname, String name, int age, String grade) {
        this.id = id;
        this.nickname = nickname;
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    //region get/set

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
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

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
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
