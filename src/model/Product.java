package model;

public class Product {
    private int productCode;
    private String name;
    private int price;
    private int quantity;
    private String desCribe;

    public Product(int productCode, String name, int price, int quantity, String desCribe) {
        this.productCode = productCode;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.desCribe = desCribe;
    }

    public int getProductCode() {
        return productCode;
    }

    public void setProductCode(int productCode) {
        this.productCode = productCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDesCribe() {
        return desCribe;
    }

    public void setDesCribe(String desCribe) {
        this.desCribe = desCribe;
    }

    @Override
    public String toString() {
        return "Mã Sản Phẩm : " + productCode + "| Tên Sản Phẩm : " + name +" | Giá Sản Phẩm Là : " + price + " | Số Lương Sản Phẩm : " + quantity + " | Mô Tả : " + desCribe;
    }
}
