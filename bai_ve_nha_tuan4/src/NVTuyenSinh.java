public class NVTuyenSinh extends NhanVien{
    private int soTuyenSinh;

    public NVTuyenSinh(int soTuyenSinh) {
        this.soTuyenSinh = soTuyenSinh;
    }

    public NVTuyenSinh(String ten, String tuoi, String gioiTinh, String soDienThoai, String mail, double luong, int soTuyenSinh) {
        super(ten, tuoi, gioiTinh, soDienThoai, mail, luong);
        this.soTuyenSinh = soTuyenSinh;
    }

    public int getSoTuyenSinh() {
        return soTuyenSinh;
    }

    public void setSoTuyenSinh(int soTuyenSinh) {
        this.soTuyenSinh = soTuyenSinh;
    }


    public double doanhThu() {
        return getLuong()*8+getSoTuyenSinh()*10;
    }

    @Override
    public String toString() {
        return "NVTuyenSinh{" + super.toString()+
                "soTuyenSinh=" + soTuyenSinh + this.doanhThu()+
                '}';
    }
}
