public class ThiSinhKhoiB extends ThiSinh{
    private static final String MON_TOAN="Toan";
    private static final String MON_HOA="Hoa";
    private  static final String MON_SINH="Sinh";

    public ThiSinhKhoiB(String soBaoDanh, String name, String address, float priority) {
        super(soBaoDanh, name, address, priority);
    }

    public static String getMonToan() {
        return MON_TOAN;
    }

    public static String getMonHoa() {
        return MON_HOA;
    }

    public static String getMonSinh() {
        return MON_SINH;
    }

    @Override
    public String toString() {
        return "ThiSinhKhoiB{" +super.toString()+ ", khối B : " + MON_TOAN + " _ "+ MON_HOA + " _ "+ MON_SINH +" }";
    }
}
