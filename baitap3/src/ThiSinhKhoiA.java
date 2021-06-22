public class ThiSinhKhoiA extends ThiSinh {
    public static final String MON_TOAN="Toan";
    public  static  final  String MON_LY="Ly";
    public  static  final  String MON_HOA="Hoa";
    private String truong;

    public ThiSinhKhoiA() {
    }

    public ThiSinhKhoiA(String soBaoDanh, String name, String address, float priority) {
        super(soBaoDanh, name, address, priority);
    }

    public static String getMonHoa() {
        return MON_HOA;
    }

    @Override
    public String toString() {
        return "ThiSinhKhoiA{"+super.toString() + ", Khối A : " +MON_TOAN+ " _ " +MON_LY+ " _ "+MON_HOA+
                '}';
    }
}
