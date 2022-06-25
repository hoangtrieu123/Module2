package LuyenTapOOP.bai3;

public class ClassC extends Human {
    private int van, su, dia;

    public ClassC(String name, String address, int id, int priority) {
        super(name, address, id, priority);
    }

    public ClassC() {

    }

    public int getVan() {
        return van;
    }

    public void setVan(int van) {
        this.van = van;
    }

    public int getSu() {
        return su;
    }

    public void setSu(int su) {
        this.su = su;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    @Override
    public String toString() {
        return "ClassC{" +
                "name='" + getName() + '\'' +
                ", address='" + getAddress() + '\'' +
                ", id=" + getId() +
                ", priority=" + getPriority() +
                '}';
    }
}
