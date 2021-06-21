public class CongNhan extends  Canbo {
    private  String nganh;
    private  String bac;

    public CongNhan(String nganh, String bac) {
        this.nganh = nganh;
        this.bac = bac;
    }

    public CongNhan(String hoTen, String ngaySinh, String gioiTinh, String diaChi, String nganh, String bac) {
        super(hoTen, ngaySinh, gioiTinh, diaChi);
        this.nganh = nganh;
        this.bac = bac;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    public String getBac() {
        return bac;
    }

    public void setBac(String bac) {
        this.bac = bac;
    }

    @Override
    public String toString() {
        return "CongNhan{" + super.toString() +              "nganh='" + nganh + '\'' +
                ", bac='" + bac + '\'' +
                '}';
    }
}
