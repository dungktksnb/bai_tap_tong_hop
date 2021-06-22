public class ThiSinhKhoiD extends ThiSinh {
    private  static final String MON_VAN="Văn";
    private static  final String MON_SU="Sử";
    private static final String MON_DIA="Địa";

    public ThiSinhKhoiD(String soBaoDanh, String name, String address, float priority) {
        super(soBaoDanh, name, address, priority);
    }

    public static String getMonVan() {
        return MON_VAN;
    }

    public static String getMonSu() {
        return MON_SU;
    }

    public static String getMonDia() {
        return MON_DIA;
    }

    @Override
    public String toString() {
        return "ThiSinhKhoiD{" +super.toString()+ ", Khối D : " +MON_VAN+ "_"+MON_SU+ "_"+MON_DIA+ "  }";
    }
}
