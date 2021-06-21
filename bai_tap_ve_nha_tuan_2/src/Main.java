import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        QLCB qlcb=new QLCB();
        while (true){
            System.out.println("Quản lý cán bộ :");
            System.out.println("1.Thêm cán bộ ");
            System.out.println("2. Tìm kiếm theo họ tên");
            System.out.println("3. Xoá nhân viên theo tên.");
            System.out.println("4. Edit nhân viên theo tên.");
            System.out.println("5. Hiển thị thông tin về danh sách các cán bộ");
            System.out.println("6. Sắp xếp nhân viên theo tên.");
            System.out.println("7. tìm kiếm toàn bộ cán bộ theo ngành(cả nhân viên và kỹ sư)");
            System.out.println("8.Exit");
            int choise=Integer.parseInt(sc.nextLine());
            switch (choise){
                case 1:
                    System.out.println("***** 1:Thêm nhân viên ");
                    System.out.println("***** 2:Thêm công nhân ");
                    System.out.println("***** 3:Thêm kỹ sư ");
                    int choise1=Integer.parseInt(sc.nextLine());
                    switch (choise1){
                        case 1:
                            qlcb.addCanBo("NhanVien");
                            break;
                        case 2:
                            qlcb.addCanBo("CongNhan");
                            break;
                        case 3:
                            qlcb.addCanBo("KySu");
                            break;
                    }
                    break;
                case 2:
                    System.out.println("nhập name cần tìm  :  ");
                    String name=sc.nextLine();
                    qlcb.fillByName(name);
                    break;
                case 3:
                    System.out.println("nhập tên cần xóa :");
                    String namexoa=sc.nextLine();
                    qlcb.removeByName(namexoa);
                    break;
                case 4:
                    break;
                case  5:
                    qlcb.show();
                case 6:
                    break;
                case 7:
                    System.out.println("nhập ngành cần tìm :");
                    String nganh=sc.nextLine();
                    qlcb.fillbyNganh(nganh);
                case 8:
                    System.exit(0);
            }
        }

    }

}

