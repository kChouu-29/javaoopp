package ShopMobile;
// Tạo lớp trừu tượng Product:

// Thuộc tính:
// id (String): Mã sản phẩm.
// name (String): Tên sản phẩm.
// price (double): Giá sản phẩm.
// quantity (int): Số lượng trong kho.
// Phương thức:



public abstract    class Product {
    private String id,name;
    private double price;
    private int quantity;
    // Phương thức khởi tạo (constructor).
    public Product(String id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    // Getter và Setter cho các thuộc tính.
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    // Phương thức trừu tượng display(): Hiển thị thông tin sản phẩm.
    public abstract void printIn4();
}
