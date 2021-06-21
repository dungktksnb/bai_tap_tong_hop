import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ManageBook manageBook = new ManageBook();
        Book book=new Book();
        int index=-1;
        while (true) {
            System.out.println("quản lý sách:");
            System.out.println("1.Thêm book");
            System.out.println("2.Sửa book");
            System.out.println("3.Xoá book");
            System.out.println("4.tìm book theo name");
            System.out.println("5.tìm kiếm book theo giá");
            System.out.println("6.sắp xếp book theo giá.");
            System.out.println("7.show sách");
            System.out.println("8.exit");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    manageBook.addBook();
                    break;
                case 2:
                    break;

                case 7:
                    manageBook.show();
                    break;
                case 4:
                    System.out.println("nhập name  cần tìm kiếm :");
                    String name=sc.nextLine();
                    manageBook.fillByName(name);
                    manageBook.show();
                    break;

                case 8:
                    System.exit(0);

            }

        }
    }

}

