package Practice;

public class CongNhan extends CanBo{
    private int bac;

    public CongNhan(int bac) {
        this.bac = bac;
    }

    public CongNhan(String name, int age, String gender, String address, int bac) {
        super(name, age, gender, address);
        this.bac = bac;
    }

    public int getBac() {
        return bac;
    }

    public void setBac(int bac) {
        this.bac = bac;
    }


    @Override
    public String toString() {
        return "CanBo{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender='" + getGender() + '\'' +
                ", address='" + getAddress() + '\'' +
                ", bac=" + bac + '\'' +
                '}';
    }
}
