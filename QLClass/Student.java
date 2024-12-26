package QLClass;
// Student có thêm các thuộc tính:
// studentID (Mã số sinh viên).
// NameStudent,Age
public class Student extends Class{
    private String StudentId;
    private String NameStudent;
    private  int age;

    public Student(String NameStudent, String StudentId, int age, String idClass, String name) {
        super(idClass, name);
        this.NameStudent = NameStudent;
        this.StudentId = StudentId;
        this.age = age;
    }

    

    public String getStudentId() {
        return StudentId;
    }

    public void setStudentId(String StudentId) {
        this.StudentId = StudentId;
    }

    public String getNameStudent() {
        return NameStudent;
    }

    public void setNameStudent(String NameStudent) {
        this.NameStudent = NameStudent;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public void displayInFor() {
        System.out.println("Student ID: "+ StudentId+" NameStudent: "+NameStudent+" Age Student: "+age+" ID Lop: "+getId()+" Name Lop:  "+getName());  
    }
}
