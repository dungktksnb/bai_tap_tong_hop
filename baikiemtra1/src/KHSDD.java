import java.util.Date;

public class KHSDD {
    private String maKhachHang;
    private String name;
    private String ngayRaHoaDon;
    private int donGia;
    private int soLuongTieuThu;

    public KHSDD() {
    }


    public KHSDD(String maKhachHang, String name, String ngayRaHoaDon, int donGia, int soLuongTieuThu) {
        this.maKhachHang = maKhachHang;
        this.name = name;
        this.ngayRaHoaDon = ngayRaHoaDon;
        this.donGia = donGia;
        this.soLuongTieuThu = soLuongTieuThu;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }

    public int getSoLuongTieuThu() {
        return soLuongTieuThu;
    }

    public void setSoLuongTieuThu(int soLuongTieuThu) {
        this.soLuongTieuThu = soLuongTieuThu;
    }

    public String getNgayRaHoaDon() {
        return ngayRaHoaDon;
    }

    public void setNgayRaHoaDon(String ngayRaHoaDon) {
        this.ngayRaHoaDon = ngayRaHoaDon;
    }

    @Override
    public String toString() {
            return    "maKhachHang='" + maKhachHang + '\'' +
                ", name='" + name + '\'' +
                ", ngayRaHoaDon='" + ngayRaHoaDon + '\'' +
                ", donGia=" + donGia +
                ", soLuongTieuThu=" + soLuongTieuThu +
                ',';
    }
}
