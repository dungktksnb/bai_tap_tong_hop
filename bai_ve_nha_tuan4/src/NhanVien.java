public class NhanVien {
    private String ten;
    private String tuoi;
    private String gioiTinh;
    private String soDienThoai;
    private String mail;
    private double luong;

    public NhanVien() {
    }

    public NhanVien(String ten, String tuoi, String gioiTinh, String soDienThoai, String mail, double luong) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
        this.soDienThoai = soDienThoai;
        this.mail = mail;
        this.luong = luong;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getTuoi() {
        return tuoi;
    }

    public void setTuoi(String tuoi) {
        this.tuoi = tuoi;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }
    public  double doanhThu(double gio){
        return luong*gio;
    }

    @Override
    public String toString() {
        return
                "ten='" + ten + '\'' +
                ", tuoi='" + tuoi + '\'' +
                ", gioiTinh='" + gioiTinh + '\'' +
                ", soDienThoai='" + soDienThoai + '\'' +
                ", mail='" + mail + '\'' +
                ", luong=" + luong +
                ',';
    }
}
