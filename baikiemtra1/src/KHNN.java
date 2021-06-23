import java.util.Date;

public class KHNN extends KHSDD {
    private String quocTich;

    public KHNN(String quocTich) {
        this.quocTich = quocTich;
    }

    public KHNN(String maKhachHang, String name, String ngayRaHoaDon, int donGia, int soLuongTieuThu, String quocTich) {
        super(maKhachHang, name, ngayRaHoaDon, donGia, soLuongTieuThu);
        this.quocTich = quocTich;
    }

    public String getQuocTich() {
        return quocTich;
    }

    public void setQuocTich(String quocTich) {
        this.quocTich = quocTich;
    }

    @Override
    public String toString() {
        return "KHNN{" +
                super.toString() +
                "quocTich='" + quocTich + '\'' +
                '}';
    }
}
