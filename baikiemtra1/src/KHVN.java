import java.util.Date;

public class KHVN extends KHSDD{
    private int dinhMuc;

    public KHVN(int dinhMuc) {
        this.dinhMuc = dinhMuc;
    }

    public KHVN(String maKhachHang, String name, String ngayRaHoaDon, int donGia, int soLuongTieuThu, int dinhMuc) {
        super(maKhachHang, name, ngayRaHoaDon, donGia, soLuongTieuThu);
        this.dinhMuc = dinhMuc;
    }

    public int getDinhMuc() {
        return dinhMuc;
    }

    public void setDinhMuc(int dinhMuc) {
        this.dinhMuc = dinhMuc;
    }

    @Override
    public String toString() {
        return "KHVN{" + super.toString()+
                "dinhMuc=" + dinhMuc +
                '}';
    }
}
