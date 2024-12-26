package ShopMobile;
// Laptop:
// Thuộc tính riêng:
// cpu (String): CPU của laptop (ví dụ: Intel i5, AMD Ryzen 7).
// ram (String): Bộ nhớ RAM (ví dụ: 8GB, 16GB).
// Ghi đè phương thức display().
public class Laptop extends Product {
    private String cpu,ram;

    public Laptop(String cpu, String ram, String id, String name, double price, int quantity) {
        super(id, name, price, quantity);
        this.cpu = cpu;
        this.ram = ram;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }
    @Override
    public void printIn4(){
        System.out.println("ID LapTop "+ getId()+" Name LapTop "+ getName()+" Quantity "+getQuantity()+" Price "+getPrice()+" CPU "+cpu+" RAM "+ram);
    }
}
