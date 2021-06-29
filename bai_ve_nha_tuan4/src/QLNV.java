import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QLNV {
    Scanner scanner = new Scanner(System.in);
    List<NhanVien> list = new ArrayList<>();

    public NhanVien taoNhanvien(String nameNV) {
        System.out.println("nhập tên nhân viên:");
        String ten = scanner.nextLine();
        System.out.println("nhập tuổi nhân viên");
        String tuoi = scanner.nextLine();
        System.out.println("nhập giới tính");
        String gioiTinh = scanner.nextLine();
        System.out.println("nhập số điện thoại ");
        String soDienThoai = scanner.nextLine();
        System.out.println("nhập mail :");
        String mail = scanner.nextLine();
        System.out.println("nhập lương nhân viên");
        double luong = Double.parseDouble(scanner.nextLine());
        if (nameNV.equals("NVPartTime")) {
            System.out.println("nhập giờ :");
            float gio = Float.parseFloat(scanner.nextLine());
            return new NVPartTime(ten, tuoi, gioiTinh, soDienThoai, mail, luong, gio);
        } else if(nameNV.equals("NVFullTime")){
            return new NVFullTime(ten, tuoi, gioiTinh, soDienThoai, mail, luong);
        }else {
            System.out.println("nhập số lượng tuyển sinh :");
            int soTuyenSinh=Integer.parseInt(scanner.nextLine());
            return new NVTuyenSinh(ten,tuoi,gioiTinh,soDienThoai,mail,luong,soTuyenSinh);
        }
    }

    public void addNhanVien(String nameNV) {
        NhanVien nhanVien = taoNhanvien(nameNV);
        list.add(nhanVien);

    }

    public void removeNV(String name) {
        for (NhanVien e : list) {
            if (e.getTen().equals(name)) {
                list.remove(e);
                break;
            }

        }


    }

    public void timNHanVien(String name) {
        for (NhanVien e:list) {
            if (e.getTen().equals(name)){
                System.out.println(e);

        }
        }

    }

    public void disPlay() {
        for (NhanVien e : list) {
            System.out.println(e);

        }
    }

    public double displayLuong(String name) {
        for (NhanVien e : list) {
            if (e.getTen().equals(name)) {
                return e.getLuong();

            }

        }return -1;


    }
    public void sortNhanVien(){
        SortNV sortNV=new SortNV();
        list.sort(sortNV);

    }
    public  void timNhanVien(String name){
        for (NhanVien e:list) {
            if (e.getTen().equals(name)){
                System.out.println(e);
            }

        }
    }
}


