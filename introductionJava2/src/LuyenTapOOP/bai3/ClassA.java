package LuyenTapOOP.bai3;

public class ClassA extends Human {
    public int toan, ly, hoa;

    public ClassA(String name, String address, int id, int priority) {
        super(name, address, id, priority);
    }

    public ClassA() {
    }

    public int getToan() {
        return toan;
    }

    public void setToan(int toan) {
        this.toan = toan;
    }

    public int getLy() {
        return ly;
    }

    public void setLy(int ly) {
        this.ly = ly;
    }

    public int getHoa() {
        return hoa;
    }

    public void setHoa(int hoa) {
        this.hoa = hoa;
    }

    @Override
    public String toString() {
        return "ClassA{" +
                "name='" + getName() + '\'' +
                ", address='" + getAddress() + '\'' +
                ", id=" + getId() +
                ", priority=" + getPriority() +
                '}';
    }
}
