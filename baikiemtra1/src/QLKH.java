import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class QLKH {
    Scanner sc = new Scanner(System.in);
    ArrayList<KHSDD> list = new ArrayList<>();

    public KHSDD taoKhachHang(String tenKhachHang) {
        System.out.println("nhập mã khách hàng : ");
        String maKhachHang = sc.nextLine();
        System.out.println("nhập tên khách hàng :");
        String hoTen = sc.nextLine();
        System.out.println("nhập ngày ra hóa đơn :");
        String ngayRaHoaDon = sc.nextLine();
        System.out.println("nhập đơn giá :");
        int donGia = Integer.parseInt(sc.nextLine());
        System.out.println("nhập số lượng tiêu thụ :");
        int soLuongTieuThu = Integer.parseInt(sc.nextLine());
        if (tenKhachHang == "KHVN") {
            System.out.println("nhập định mức :");
            int dinhMuc = Integer.parseInt(sc.nextLine());
            return new KHVN(maKhachHang, hoTen, ngayRaHoaDon, donGia, soLuongTieuThu, dinhMuc);

        } else {
            System.out.println("nhập quốc tịch :");
            String quocTich = sc.nextLine();
            return new KHNN(maKhachHang, hoTen, ngayRaHoaDon, donGia, soLuongTieuThu, quocTich);
        }

    }

    public void addKH(String tenKhachHang) {
        KHSDD khsdd = taoKhachHang(tenKhachHang);
        list.add(khsdd);
    }

    public void disPlay() {
        for (KHSDD e : list) {
            System.out.println(e);

        }
    }

    public void suaKhachHang(int index, KHSDD khsdd) {
        list.set(index, khsdd);

    }
    public  void timTheoTen(String ten){
        for (KHSDD e:list) {
            if(e.getName().equals(ten)){
                System.out.println(e);
            }
        }
    }
    public  void  timTheoMa(String ma){
        for (KHSDD e:list) {
            if(e.getMaKhachHang().equals(ma)){
                System.out.println(e);
            }

        }
    }
    public void xoaKH(String name){
        for (KHSDD e: list) {
            if(e.getName().equals(name)){
                list.remove(e);
            }

        }
    }


}



