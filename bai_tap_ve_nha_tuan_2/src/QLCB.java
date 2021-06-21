
import java.util.ArrayList;

import java.util.Scanner;
import java.util.concurrent.Callable;

public class QLCB {
    ArrayList<Canbo> list = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    public void addCanBo(String nameCanBo){
        Canbo canbo=create(nameCanBo);
        list.add(canbo);
    }

    public Canbo create(String nameCanbo) {
        System.out.println("nhập tên :");
        String hoTen = sc.nextLine();
        System.out.println("nhập ngày sinh : ");
        String ngaySinh = sc.nextLine();
        System.out.println("nhập giới tính :");
        String gioiTinh = sc.nextLine();
        System.out.println("nhập địa chỉ :");
        String diaChi = sc.nextLine();
        if (nameCanbo == "CongNhan") {
            System.out.println("nhập ngành :");
            String nganh = sc.nextLine();
            System.out.println("nhập bậc :");
            String bac = sc.nextLine();
            return new CongNhan(nganh, bac, hoTen, ngaySinh, gioiTinh, diaChi);

        } else if (nameCanbo == "KySu") {
            System.out.println("nhập ngành :");
            String nganh = sc.nextLine();
            return new KySu(nganh, hoTen, ngaySinh, gioiTinh, diaChi);
        } else {
            return new NhanVien(hoTen, gioiTinh, ngaySinh, diaChi);
        }

    }
    public  void fillByName(String name){
        for (Canbo e:list) {
            if (e.getHoTen().equals(name)){
                System.out.println(e);
                break;
            }

        }

    }
    public void  edit(Canbo canbo,int index){
        list.set(index,canbo);
    }
   public void fillbyNganh(String nganh){
        for (Canbo canbo :list){
            if(canbo instanceof KySu){
                if(((KySu)canbo).getNganh().equals(nganh)){
                    System.out.println(canbo);
                }
            }
            if (canbo instanceof CongNhan){
                System.out.println(canbo);
            }
        }
   }
   public  void removeByName(String name) {
       for (Canbo a : list) {
           if (a.getHoTen().equals(name)) {
               list.remove(a);
               break;
           }

       }
   }
   public  void show(){
       for (Canbo c:list) {
           System.out.println(c);
       }
   }
}
