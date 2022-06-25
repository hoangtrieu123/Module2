package LuyenTapOOP.bai3;

public class ClassB extends Human {

    private int toan, hoa, sinh;

    public ClassB(String name, String address, int id, int priority) {
        super(name, address, id, priority);
    }

    public ClassB() {

    }

    public int getToan() {
        return toan;
    }

    public void setToan(int toan) {
        this.toan = toan;
    }

    public int getHoa() {
        return hoa;
    }

    public void setHoa(int hoa) {
        this.hoa = hoa;
    }

    public int getSinh() {
        return sinh;
    }

    public void setSinh(int sinh) {
        this.sinh = sinh;
    }

    @Override
    public String toString() {
        return "ClassB{" +
                "name='" + getName() + '\'' +
                ", address='" + getAddress() + '\'' +
                ", id=" + getId() +
                ", priority=" + getPriority() +
                '}';
    }
}
