public class ThiSinh {
    private String soBaoDanh;
    private  String name;
    private String address;
    private float priority;

    public ThiSinh() {
    }

    public ThiSinh(String soBaoDanh, String name, String address, float priority) {
        this.soBaoDanh = soBaoDanh;
        this.name = name;
        this.address = address;
        this.priority = priority;
    }

    public String getSoBaoDanh() {
        return soBaoDanh;
    }

    public void setSoBaoDanh(String soBaoDanh) {
        this.soBaoDanh = soBaoDanh;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public float getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return
                "soBaoDanh='" + soBaoDanh + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", priority=" + priority
                ;
    }
}
