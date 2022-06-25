package LuyenTapOOP.bai3;

public class Human {
    private String name, address;
    private int id, priority;

    public Human() {
    }

    public Human(String name, String address, int id, int priority) {
        this.name = name;
        this.address = address;
        this.id = id;
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", id=" + id +
                ", priority=" + priority +
                '}';
    }
}
