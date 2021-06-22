import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QLSV qlsv=new QLSV();
        Scanner sc=new Scanner(System.in);
        while (true){
            System.out.println("1 :Thêm mới thí sinh ");
            System.out.println("2:Hiển thị thông tin của thí sinh và khối của thí sinh ");
            System.out.println("3:Tìm kiếm theo số báo danh ");
            System.out.println("4:thoát khỏi chương trình :");
            int choice=Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    System.out.println("******1:thêm thí sinh khối A ");
                    System.out.println("******2:thêm thí sinh khối B ");
                    System.out.println("******3:thêm thí sinh khối D ");
                    int choice1=Integer.parseInt(sc.nextLine());
                    switch (choice1){
                        case 1:

                            qlsv.addThiSinh("ThiSinhKhoiA");
                            break;
                        case 2:
                            qlsv.addThiSinh("ThiSinhKhoiB");
                            break;
                        case 3:
                            qlsv.addThiSinh("ThiSinhKhoiD");
                            break;

                    }
                    break;
                case 2:
                    qlsv.disPlay();
                    break;
                case 3:
                    System.out.println("nhập số báo danh cần tìm : ");
                    String soBaoDanh1=sc.nextLine();
                    qlsv.timThiSinh(soBaoDanh1);
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("sai lựa chọn,vui lòng nhập lại ");
                    break;

            }
        }
    }

}
