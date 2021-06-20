package bai1;

public class NhanVien extends CanBo{
    private String work;

    public NhanVien(String work) {
        this.work = work;
    }

    public NhanVien(String name, int yearOfBirth, String sex, String address, String work) {
        super(name, yearOfBirth, sex, address);
        this.work = work;
    }

    public NhanVien() {
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    @Override
    public String toString() {
        return "NhanVien{" + super.toString() +
                "work='" + work + '\'' +
                '}';
    }
}
