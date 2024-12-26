package ShopMobile;
// Tạo các lớp con kế thừa từ Product:

// Phone:
// Thuộc tính riêng:
// brand (String): Thương hiệu (ví dụ: Apple, Samsung).
// camera (String): Thông số camera (ví dụ: 108MP).
// Ghi đè phương thức display() để hiển thị thông tin đầy đủ.
public class Phone extends Product {
    private String brand , camera ;

    public Phone(String brand, String camera, String id, String name, double price, int quantity) {
        super(id, name, price, quantity);
        this.brand = brand;
        this.camera = camera;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCamera() {
        return camera;
    }

    public void setCamera(String camera) {
        this.camera = camera;
    }
    @Override
    public void printIn4(){
        System.out.println("ID Phone "+ getId()+" Name Phone "+ getName()+" Quantity "+getQuantity()+" Price "+getPrice()+" Brand "+brand+" Camera In4 "+camera);
    }
}
