package ShopMobile;
// Tạo lớp StoreManager:

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


// Quản lý danh sách sản phẩm bằng ArrayList<Product>.
// Chức năng:
// Thêm sản phẩm: Thêm sản phẩm vào kho (Phone hoặc Laptop).
// Tìm kiếm sản phẩm: Tìm sản phẩm theo id hoặc name.
// Xóa sản phẩm: Xóa sản phẩm khỏi kho dựa trên id.
// Cập nhật số lượng: Cập nhật số lượng hàng trong kho theo id.
// Hiển thị danh sách sản phẩm: Hiển thị tất cả sản phẩm trong kho.
public class StoraManagement {
    public static void main(String[] args) {
        List<Product> spp = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true) { 
            System.out.println("1.Add Phone");
            System.out.println("2.Add Laptop");
            System.out.println("3.Search Product with id");
            System.out.println("4.Dele Product with id");
            System.out.println("5.Print all product");
            System.out.println("Enter your pick number ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    // Them dine thoai
                    sc.nextLine();
                    System.out.println("Nhap Hang Dien Thoai ");
                    String branPhone = sc.nextLine();
                    System.out.println("Nhap Camera Cho dine thoai");
                    String cameraaPhone = sc.nextLine();
                    System.out.println("Nhapp id dien thoai ");
                    String idPhone = sc.nextLine();
                    System.out.println("Nhap ten dien thoai ");
                    String namePhone = sc.nextLine();
                    System.out.println("Nhap gia cua dien thoai");
                    double pricePPhone = sc.nextDouble();
                    System.out.println("Nhapp so luong cua dien thoai can them ");
                    int qunatityPPhoen = sc.nextInt();
                    Phone dt = new Phone(branPhone, cameraaPhone, idPhone, namePhone, pricePPhone, qunatityPPhoen);
                    spp.add(dt);
                    System.out.println("Them Thanh Cong Dien Thoai");
                    break;
                case 2 :
                    sc.nextLine();
                    System.out.println("Nhap cpu cho laptop ");
                    String cpuLap = sc.nextLine();
                    System.out.println("Nhapo ram cho laptop");
                    String ramLap = sc.nextLine();
                    System.out.println("Nhapp id LapTop ");
                    String idLap = sc.nextLine();
                    System.out.println("Nhap ten LapTop ");
                    String nameLap = sc.nextLine();
                    System.out.println("Nhap gia cua LapTop");
                    double priceLap = sc.nextDouble();
                    System.out.println("Nhapp so luong cua LapTop can them ");
                    int qunatityLap = sc.nextInt();
                    Laptop ppc = new Laptop(cpuLap, ramLap, idLap, nameLap, priceLap, qunatityLap);
                    spp.add(ppc);
                    System.out.println("Them thanh cong laptop");
                    break;

                case 3 :
                    // tim kiem theo id 
                    System.out.println("Nhap id can tim kiem (id dt bat dau bang dt va id laptop bat dau bang lp)");
                    sc.nextLine();
                    String searchID = sc.nextLine();
                    boolean flag = false;
                    for(Product sanpham : spp){
                        if(sanpham.getId().equalsIgnoreCase(searchID)){
                            
                            flag = true;
                            sanpham.printIn4();
                        }
                    }
                    if(!flag){
                        System.out.println("Khong tim thay san pham");
                    }
                    break;
                case 4:
                    // Xoa san pham theo id 
                    sc.nextLine();
                    System.out.println("Nhap id san pham can xoa");
                    String idDele = sc.nextLine();
                    boolean check = spp.removeIf(sanpham -> sanpham.getId().equalsIgnoreCase(idDele));
                    if(check){
                        System.out.println("Xoa san ppham thanh cong ");
                    }
                    else{
                        System.out.println("KHKong tim thay id san pham nay ");
                    }
                    break;
                case 5 :
                    System.out.println("Tat ca san pham trong danh sach");
                    if(spp.isEmpty()){
                        System.out.println("Danh saschn rtong");
                    }
                    for(Product sanpham : spp){
                        sanpham.printIn4();
                    }
                    break;
                default:
                    throw new AssertionError();
            }
        }
    }
}
