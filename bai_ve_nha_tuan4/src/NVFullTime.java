public class NVFullTime extends NhanVien{
    public NVFullTime() {
    }

    public NVFullTime(String ten, String tuoi, String gioiTinh, String soDienThoai, String mail, double luong) {
        super(ten, tuoi, gioiTinh, soDienThoai, mail, luong);
    }

    @Override
    public String toString() {
        return "NVFullTime{"+super.toString() + "}";
    }

    @Override
    public double doanhThu(double gio) {
        return getLuong()*8;
    }
}
