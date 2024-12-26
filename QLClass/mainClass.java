package QLClass;

import java.util.Scanner;

public class mainClass {
   public static void main(String[] args) {
        ClassManage qllop = new ClassManage();
        Scanner sc = new Scanner(System.in);
       while (true) { 
           System.out.println("1.Them hoc sinh");
           System.out.println("2.Xoa Hoc sinh");
           System.out.println("3.Hien thi hoc sinh");
           System.out.println("5.Tim kiem hoc sinh theo id");
           int choice = sc.nextInt() ;
           sc.nextLine();
           switch (choice) {
               case 1:
                   System.out.println("Nhap thong tin hoc sinh can them");
                   System.out.println("Nhap ten hoc sinh");
                   String nameSt=sc.nextLine();
                   System.out.println("Nhap id hoc sinh");
                   String idSt = sc.nextLine();
                   System.out.println("Nhap tuoi hoc sinh");
                   int ageSt = sc.nextInt();
                   sc.nextLine();
                   System.out.println("Nhap id lop");
                   
                   String idClass = sc.nextLine();
                   System.out.println("Nhap ten lop");
                   String nameClass = sc.nextLine();
                   
                   Student hocsinh = new Student(nameSt, idSt, ageSt, idClass, nameClass);
                   qllop.addStudent(hocsinh);
                   break;
                   case 2:
                   // Đọc ID cần xóa
                   System.out.println("Nhập id cần xóa");
                 // Đảm bảo xóa bỏ dấu '\n' còn sót lại trong bộ đệm
                   String idDelle = sc.nextLine();  // Đọc chuỗi ID
                   
                   // Gọi phương thức removeStudent để xóa học sinh
                  String result = qllop.removeStudent(idDelle);
                  System.out.println(result);
                   break;
               
                case 3:
                    qllop.displayInFor();
                    break;
                case 4:
                    System.out.println("Thoat chuong trinh");
                    sc.close();
                    return;
                case 5 :
                
                    System.out.println("Nhap id can tim kime");
                
                    String timkiemID = sc.nextLine();
                    Student st = qllop.SearchID(timkiemID);
                    if(st!=null){
                        st.displayInFor();
                    }
                    else{
                        System.out.println("Khong tim thay");
                    }
                    break;
               default:
                   throw new AssertionError();
           }

       }
   } 
}
