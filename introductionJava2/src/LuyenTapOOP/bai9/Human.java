package LuyenTapOOP.bai9;

public class Human {
    public String hoVaTen;
    public String soNha;
    public int MaSoCongTo;

    public Human() {
    }

    public Human(String hoVaTen, String soNha, int maSoCongTo) {
        this.hoVaTen = hoVaTen;
        this.soNha = soNha;
        MaSoCongTo = maSoCongTo;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public String getSoNha() {
        return soNha;
    }

    public void setSoNha(String soNha) {
        this.soNha = soNha;
    }

    public int getMaSoCongTo() {
        return MaSoCongTo;
    }

    public void setMaSoCongTo(int maSoCongTo) {
        MaSoCongTo = maSoCongTo;
    }

    @Override
    public String toString() {
        return "Human{" +
                "hoVaTen='" + hoVaTen + '\'' +
                ", soNha='" + soNha + '\'' +
                ", MaSoCongTo=" + MaSoCongTo +
                '}';
    }
}
