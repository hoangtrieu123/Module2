package LuyenTapOOP.bai7;

import java.io.Serializable;

public class Human implements Serializable {
    public String name;
    public int age;
    public String homeTown;
    public int id;

    public Human() {
    }

    public Human(String name, int age, String homeTown, int id) {
        this.name = name;
        this.age = age;
        this.homeTown = homeTown;
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

    public String getHomeTown() {
        return homeTown;
    }

    public void setHomeTown(String homeTown) {
        this.homeTown = homeTown;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", homeTown='" + homeTown + '\'' +
                ", id=" + id +
                '}';
    }
}
