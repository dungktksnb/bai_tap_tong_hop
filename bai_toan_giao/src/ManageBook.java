import java.util.ArrayList;
import java.util.Scanner;

public class ManageBook {
    Scanner sc = new Scanner(System.in);
    ArrayList<Book> list = new ArrayList<>();

    public Book create() {
        System.out.println("nhập mã sách :");
        String bookCode = sc.nextLine();
        System.out.println("nhập tên sách :");
        String name = sc.nextLine();
        System.out.println("nhập giá bán sách :");
        float price = Integer.parseInt(sc.nextLine());
        System.out.println("nhập tác giả :");
        String author = sc.nextLine();
        return new Book(bookCode, name, price, author);
    }

    public void addBook() {
        Book book = create();
        list.add(book);

    }

    public void editBook(int index, Book book) {
        list.set(index, book);
    }

    public void fillByName(String name) {
        for (Book e : list) {
            if (e.getNameBook().equals(name)) {
                System.out.println(e);
            }

        }
    }

    public void removeByName(String name) {
        for (Book e : list) {
            if (e.getNameBook().equals(name)) {
                list.remove(e);
            }
            break;

        }
    }

    public void show() {
        for (Book e : list) {
            System.out.println(e);
        }
    }
//    public int searchByPrice(String price){
//        int index;
//        for (int i = 0; i < list.size(); i++) {
//
//
//        }
//    }
}
