package QLClass;
// Lớp trừu tượng Person có các thuộc tính:

// name (Họ tên)
// age (Tuổi)
// id (Mã định danh)
// Và các phương thức:

// Phương thức displayInfo() hiển thị thông tin cá nhân.
public abstract  class Class {
  
    private String name,idClass;

    public Class( String idClass, String name) {
        this.idClass = idClass;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return idClass;
    }

    public void setId(String idClass) {
        this.idClass = idClass;
    }
    
    public abstract void displayInFor();
}
