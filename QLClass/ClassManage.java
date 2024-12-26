package QLClass;
// Lớp Classroom:

import java.util.ArrayList;


// Thuộc tính:

// Danh sách sinh viên (ArrayList<Student>).
// Phương thức:
// addStudent(Student student): Thêm sinh viên vào danh sách.
// removeStudent(String studentId): Xóa sinh viên khỏi danh sách dựa trên mã số sinh viên.
// updateStudent(String studentId, String newName, int newAge): Cập nhật thông tin sinh viên.
// findStudentById(String studentId): Tìm kiếm sinh viên theo mã số và trả về thông tin.
// displayClassInfo(): Hiển thị thông tin toàn bộ sinh viên trong lớp.
public class ClassManage {
    private ArrayList<Student> students;

    public ClassManage() {
        this.students = new ArrayList<>();
    }
    // them sinh vien
    public void addStudent(Student hocsinh){
        students.add(hocsinh);
        System.out.println("Add the successfully");
    }
    //xoa hoc sinh 
    public String removeStudent(String id) {
        for (int i=0;i<students.size();i++){
            Student hocsinh = students.get(i);
            if(hocsinh.getId().equalsIgnoreCase(id)){
                students.remove(i);
                return "Xoa hoc sinh thanh cong";
            }
        }
        return "Khong tim thay hoc sinh"+id;
    }
    
    
    // Hien thi hoc sinh
    public void displayInFor(){

        if(students.isEmpty()){
            System.out.println("Danh sach rong");
        }
        else{
        for(Student hocsinh : students){
            hocsinh.displayInFor();
        }
    }
    //tim kiem theo id
    
    }
    public Student SearchID(String id){
        for(Student hocsinh : students){
            if(hocsinh.getStudentId().equalsIgnoreCase(id)){
                return hocsinh;
            }
        }
        return null;
    }
}
