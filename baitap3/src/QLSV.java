import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QLSV {
    List<ThiSinh> thiSinhList;
    Scanner sc = new Scanner(System.in);

    public QLSV() {
        this.thiSinhList = new ArrayList<>();
    }

    public ThiSinh creat(String nameThiSinh) {
        System.out.println("nhập Số báo danh :");
        String soBaoDanh = sc.nextLine();
        System.out.println("nhập tên thí sinh :");
        String name = sc.nextLine();
        System.out.println("nhập địa chỉ thí sinh :");
        String address = sc.nextLine();
        System.out.println("nhập điểm ưu tiên của thí sinh :");
        float priority = Integer.parseInt(sc.nextLine());
        if (nameThiSinh == "ThiSinhKhoiA") {
            return new ThiSinhKhoiA(soBaoDanh, name, address, priority);
        } else if (nameThiSinh == "ThiSinhKhoiB") {
            return new ThiSinhKhoiB(soBaoDanh, name, address, priority);
        } else {
            return new ThiSinhKhoiD(soBaoDanh, name, address, priority);
        }
    }
    public void timThiSinh(String soBaoDanh){
        for (ThiSinh e: thiSinhList) {
            if (e.getSoBaoDanh().equals(soBaoDanh)){
                System.out.println(e);
            }
        }
    }



    public void addThiSinh(String nameThiSinh) {
        ThiSinh thiSinh = creat(nameThiSinh);
        thiSinhList.add(thiSinh);

    }

    public void disPlay() {
        for (ThiSinh e : thiSinhList) {
            System.out.println(e);

        }
    }
}
