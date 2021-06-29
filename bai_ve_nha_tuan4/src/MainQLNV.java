import java.util.Scanner;

public class MainQLNV {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        QLNV qlnv=new QLNV();
        while (true){
            System.out.println("MeNu quản lý nhân viên cho code Gym ");
            System.out.println("1 thêm nhân viên");
            System.out.println("2 xóa nhân viên theo tên ");
            System.out.println("3 hiển thị lương theo tên ");
            System.out.println("4 tìm kiếm nhân viên theo tên ");
            System.out.println("5 sắp xếp nhân viên theo tên ");
            System.out.println("6 show danh sách ");
            System.out.println("7 exit ");
            int choice=Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    System.out.println("1 thêm nhân viên parttime");
                    System.out.println("2 thêm nhân viên fullTime");
                    System.out.println("3 thêm nhân viên tuyển sinh ");
                    int choice1=Integer.parseInt(scanner.nextLine());
                    switch (choice1){
                        case 1:
                            qlnv.addNhanVien("NVPartTime");
                            break;
                        case 2:
                            qlnv.addNhanVien("NVFullTime");
                            break;
                        case 3:
                            qlnv.addNhanVien("NVTuyenSinh");
                            break;
                    }
                    break;
                case 2:
                    System.out.println("nhập tên nhân viên");
                    String name=scanner.nextLine();
                    qlnv.timNhanVien(name);
                    break;
                case 3:
                    System.out.println("nhập tên nhân viên");
                    String name1=scanner.nextLine();
                    qlnv.removeNV(name1);
                    break;
                case 4:
                    System.out.println("nhập tên nhân viên");
                    String name3=scanner.nextLine();
                    qlnv.timNhanVien(name3);
                    break;
                case 5:
                    qlnv.sortNhanVien();
                    break;
                case 6:
                    qlnv.disPlay();
                    break;
                case 7:
                    System.exit(0);
            }
        }
    }

}
