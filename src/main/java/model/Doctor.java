package model;

public class Doctor {
    private int ID;
    private String fullName;
    private String img;
    private String department;
    private String eduLevel;
    private String phone;
    private String email;

    public Doctor() {
    }

    public Doctor(int ID, String fullName, String department, String phone, String eduLevel) {
        this.ID = ID;
        this.fullName = fullName;
        this.department = department;
        this.phone = phone;
        this.eduLevel = eduLevel;

    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public String getEduLevel() {
        return eduLevel;
    }
    public void setEduLevel(String eduLevel) {
        this.eduLevel = eduLevel;
    }

    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

}
