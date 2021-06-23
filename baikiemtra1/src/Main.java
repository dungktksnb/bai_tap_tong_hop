import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        QLKH qlkh=new QLKH();
        while (true){
            System.out.println("Menu quản lý khách hàng sử dụng điên :");
            System.out.println("1:Thêm khach hàng ");
            System.out.println("2:Sửa khách hàng ");
            System.out.println("3:Xóa khách hàng ");
            System.out.println("4:tìm khách hàng theo tên ");
            System.out.println("5:Tìm kiến khách hàng theo mã khách hàng");
            System.out.println("6:Sắp xếp khách hàng theo mã khách hàng ");
            System.out.println("7:Hiển thị thông tin khách hàng ");
            System.out.println("8:thoát");
            int choice =Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    System.out.println("1********1thêm khách hàng việt nam ");
                    System.out.println("2:*******thêm khách hàng nước ngoài");
                    int choice2=Integer.parseInt(sc.nextLine());
                    switch (choice2){
                        case 1:
                            qlkh.addKH("KHVN");
                            break;
                        case 2:
                            qlkh.addKH("KHNN");
                            break;
                    }
                    break;
                case 2:
                    System.out.println("1*****sửa khách hàng việt nam :");
                    System.out.println("2*****sửa khách hàng nước ngoài :");
                    int choice1=Integer.parseInt(sc.nextLine());
                    switch (choice1){
                        case 1:
                            System.out.println("bạn hãy nhập");
                    }

                    break;
                case 3:
                    System.out.println("nhập tên khách hàng cần xóa ");
                    String name=sc.nextLine();
                    qlkh.xoaKH(name);
                    break;
                case 4:
                    System.out.println("bạn hãy nhập tên cần tìm kiếm :");
                    String ten=sc.nextLine();
                    qlkh.timTheoTen(ten);
                    break;
                case  5:
                    System.out.println("bạn hãy nhập mã khách hàng cần tìm kiếm");
                    String ma=sc.nextLine();
                    qlkh.timTheoMa(ma);
                    break;
                case 7:
                    qlkh.disPlay();
                    break;
                case 8:
                    System.exit(0);
                default:

            }
        }

    }

}
