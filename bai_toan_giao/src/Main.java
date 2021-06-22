import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            ManageBook manageBook = new ManageBook();
            Book book = new Book();
            while (true) {
                System.out.println("quản lý sách:");
                System.out.println("1.Thêm book");
                System.out.println("2.Sửa book");
                System.out.println("3.Xoá book theo name");
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
                        System.out.println("nhập vị trí cần tìm");
                        int index = Integer.parseInt(sc.nextLine());
                        System.out.println("nhập mã sách :");
                        String bookCode = sc.nextLine();
                        System.out.println("nhập tên sách :");
                        String name = sc.nextLine();
                        System.out.println("nhập giá bán sách :");
                        float price = Integer.parseInt(sc.nextLine());
                        System.out.println("nhập tác giả :");
                        String author = sc.nextLine();
                        Book book1 = new Book(bookCode, name, price, author);
                        manageBook.editBook(index, book1);
                        break;
                    case 3:
                        System.out.println("nhập name cần xóa :");
                        String nameXoa = sc.nextLine();
                        manageBook.removeByName(nameXoa);
                        manageBook.display();
                        break;
                    case 5:
                        System.out.println("nhập giá cần tìm kiếm :");
                        float priceTK = Integer.parseInt(sc.nextLine());
                        manageBook.searchByPrice(priceTK);
                        manageBook.display();

                    case 7:
                        manageBook.display();
                        break;
                    case 6:
                        SortBook sortBook = new SortBook();
                        manageBook.list.sort(sortBook);
                        break;
                    case 4:
                        System.out.println("nhập name  cần tìm kiếm :");
                        String nameTK = sc.nextLine();
                        manageBook.fillByName(nameTK);
                        break;

                    case 8:
                        System.exit(0);

                }

            }
        }
    }

}

