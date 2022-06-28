package amalysheva.entities;

import java.util.Objects;

public class User implements Persistable {
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
    public String toString(){
        return getId() + "," + getNickname() + "," + getName() + "," + getAge() + "," + getGrade();
    }

    @Override
    public String getFilename() {
        return getId() + getNickname() + ".csv";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return getId() == user.getId() &&
                getNickname().equals(user.getNickname());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getNickname());
    }
}
