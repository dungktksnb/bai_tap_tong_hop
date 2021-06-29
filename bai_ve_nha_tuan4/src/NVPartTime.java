public class NVPartTime  extends NhanVien{
    private float gio;

    public NVPartTime(float gio) {
        this.gio = gio;
    }

    public NVPartTime(String ten, String tuoi, String gioiTinh, String soDienThoai, String mail, double luong, float gio) {
        super(ten, tuoi, gioiTinh, soDienThoai, mail, luong);
        this.gio = gio;
    }

    public float getGio() {
        return gio;
    }

    public void setGio(float gio) {
        this.gio = gio;
    }

    @Override
    public String toString() {
        return "NVPartTime{" + super.toString()+
                "gio=" + gio +this.doanhThu(getGio())+
                '}';
    }

    @Override
    public double doanhThu (double gio){
        return getLuong()*getGio();
    }
}
