package view;

import manager.ProductManager;
import model.Product;
import validate.Validate;

import java.util.Scanner;

public class Menu {
    ProductManager productManager = new ProductManager();
    Scanner scanner = new Scanner(System.in);

    public void showMenu() {
        int choice;
        do {
            System.out.println("===Menu===\n1.Xem Danh Sách\n2.Thêm Mới\n3.Cập Nhật\n4.Xóa\n5.Sắp Xếp\n6.Tìm sản Phẩm Đắt Nhất\n9.Thoát Chương Trình");
            System.out.println("Nhập Lựa chọn của bạn");
            choice = Validate.choice();
            switch (choice) {
                case 1:
                    showAll();
                    break;
                case 2:
                    add();
                    break;
                case 3:
                    update();
                    break;
                case 4:
                    delete();
                    break;
                case 5:
                    Arrange();
                    break;
                case 6:
                    maxMoney();
                    break;

            }
        } while (choice != 9);
    }

    public void add() {
        System.out.println("Nhập Mã Sản Phẩm");
        int producCode = Validate.number();
        System.out.println("Nhập Tên Sản Phẩm");
        String name = scanner.nextLine();
        System.out.println("Nhập Giá Sản Phẩm");
        int price = Validate.number();
        System.out.println("Nhập Số Lượng");
        int quantity = Validate.number();
        System.out.println("Mô tả Của Sản Phẩm");
        String desCribe = scanner.nextLine();
        Product product = new Product(producCode, name, price, quantity, desCribe);
        productManager.add(product);
        System.out.println("Thêm Thành Công");
    }

    public void showAll() {
        System.out.println(productManager.findAll());
    }

    public void update() {
        System.out.println("Nhập Mã Sản Phẩm Bạn Muốn Sửa");
        int productCodeEdit = Validate.number();
        if (productManager.findByid(productCodeEdit) != -1) {
            System.out.println("Nhập Tên Sản Phẩm");
            String nameEdit = scanner.nextLine();
            System.out.println("Nhập Giá Sản Phẩm");
            int priceEdit = Validate.number();
            System.out.println("Nhập Số Lượng");
            int quantityEdit = Validate.number();
            System.out.println("Mô tả Của Sản Phẩm");
            String desCribeEdit = scanner.nextLine();
            Product product = new Product(productCodeEdit, nameEdit, priceEdit, quantityEdit, desCribeEdit);
            productManager.update(productCodeEdit, product);
            System.out.println("Sửa Thành Công");
        } else {
            System.out.println("Không Có ID Này");
        }
    }

    public void delete() {
        System.out.println("Nhập Mã Sản Phẩm Muốn Xóa");
        int productCode = Validate.number();
        if (productManager.findByid(productCode) != -1) {
            System.out.println("Bạn Chắc Chắn Muốn Xóa Không \n1.Chắc Chắn\n2.Không");
            int choice = Validate.choice();
            switch (choice) {
                case 1:
                    productManager.remove(productCode);
                    System.out.println("Xóa Thành Công");
                    break;
                case 2:
                    System.out.println("Xóa Không Thành Công");
                    break;

            }
        } else {
            System.out.println("Không Có ID Này");
        }
    }

    public void maxMoney() {
        System.out.println(productManager.maxMoney());
    }
    public void Arrange(){
            productManager.sortIncreaseProduct();
    }


}
