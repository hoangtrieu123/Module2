package LuyenTapOOP.bai9;

public class Bill extends Human {
    public int chiSoDienCu, chiSoDienMoi, soTienPhaiTra;

    public Bill() {
    }

    public Bill(String hoVaTen, String soNha, int maSoCongTo, int chiSoDienCu, int chiSoDienMoi, int soTienPhaiTra) {
        super(hoVaTen, soNha, maSoCongTo);
        this.chiSoDienCu = chiSoDienCu;
        this.chiSoDienMoi = chiSoDienMoi;
        this.soTienPhaiTra = soTienPhaiTra;
    }

    public int getChiSoDienCu() {
        return chiSoDienCu;
    }

    public void setChiSoDienCu(int chiSoDienCu) {
        this.chiSoDienCu = chiSoDienCu;
    }

    public int getChiSoDienMoi() {
        return chiSoDienMoi;
    }

    public void setChiSoDienMoi(int chiSoDienMoi) {
        this.chiSoDienMoi = chiSoDienMoi;
    }

    public int getSoTienPhaiTra() {
        return soTienPhaiTra;
    }

    public void setSoTienPhaiTra(int soTienPhaiTra) {
        this.soTienPhaiTra = soTienPhaiTra;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "chiSoDienCu=" + chiSoDienCu +
                ", chiSoDienMoi=" + chiSoDienMoi +
                ", hoVaTen='" + hoVaTen + '\'' +
                ", soNha='" + soNha + '\'' +
                ", MaSoCongTo=" + MaSoCongTo +
                ", soTienPhaiTra=" + soTienPhaiTra +
                "} ";
    }
}
