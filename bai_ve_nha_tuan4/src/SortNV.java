import java.util.Comparator;

public class SortNV implements Comparator<NhanVien> {


    @Override
    public int compare(NhanVien o1, NhanVien o2) {
        return o1.getTen().compareTo(o2.getTen());
    }
}
