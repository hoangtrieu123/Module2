package luyenTap;

public class food {
    private String ten;
    private int gia;
    private int soLuong;

    public food() {
    }
    public food(String ten, int gia, int soLuong) {
        this.ten = ten;
        this.gia = gia;
        this.soLuong = soLuong;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    @Override
    public String toString() {
        return "food{" +
                "ten='" + ten + '\'' +
                ", gia=" + gia +
                ", soLuong=" + soLuong +
                '}';
    }
}
