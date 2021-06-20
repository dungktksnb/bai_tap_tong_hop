package bai1;

public class CanBo {
    private String name;
    private int yearOfBirth;
    private String sex;
    private String address;

    public CanBo() {
    }

    public CanBo(String name, int yearOfBirth, String sex, String address) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.sex = sex;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                        ", yearOfBirth=" + yearOfBirth +
                        ", sex='" + sex + '\'' +
                        ", address='" + address + '\'' +
                        ',';
    }
}
