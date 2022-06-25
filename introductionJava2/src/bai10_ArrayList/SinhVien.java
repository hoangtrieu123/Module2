package bai10_ArrayList;

public class SinhVien {
    private String hoVaTen;
    private String gioiTinh;
    private int namSinh;
    private double diemTrungBinh;

    public SinhVien() {
    }

    public SinhVien(String hoVaTen, String gioiTinh, int namSinh, double diemTrungBinh) {
        this.hoVaTen = hoVaTen;
        this.gioiTinh = gioiTinh;
        this.namSinh = namSinh;
        this.diemTrungBinh = diemTrungBinh;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public double getDiemTrungBinh() {
        return diemTrungBinh;
    }

    public void setDiemTrungBinh(double diemTrungBinh) {
        this.diemTrungBinh = diemTrungBinh;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "hoVaTen='" + hoVaTen + '\'' +
                ", gioiTinh='" + gioiTinh + '\'' +
                ", namSinh=" + namSinh +
                ", diemTrungBinh=" + diemTrungBinh +
                '}';
    }
}
