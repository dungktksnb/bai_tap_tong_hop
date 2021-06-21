public class KySu  extends  Canbo{
    private  String nganh;

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    public KySu(String nganh) {
        this.nganh = nganh;
    }

    public KySu(String hoTen, String ngaySinh, String gioiTinh, String diaChi, String nganh) {
        super(hoTen, ngaySinh, gioiTinh, diaChi);
        this.nganh = nganh;
    }

    @Override
    public String toString() {
        return "KySu{" + super.toString() +
                "nganh='" + nganh + '\'' +
                '}';
    }
}
