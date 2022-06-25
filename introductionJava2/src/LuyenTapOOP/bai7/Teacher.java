package LuyenTapOOP.bai7;

import java.io.Serializable;

public class Teacher extends Human implements Serializable {
    private double salary, bonusSalary, fine, realSalary;

    public Teacher() {
    }

    public Teacher(String name, int age, String homeTown, int id, double salary, double bonusSalary, double fine) {
        super(name, age, homeTown, id);
        this.salary = salary;
        this.bonusSalary = bonusSalary;
        this.fine = fine;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getBonusSalary() {
        return bonusSalary;
    }

    public void setBonusSalary(double bonusSalary) {
        this.bonusSalary = bonusSalary;
    }

    public double getFine() {
        return fine;
    }

    public void setFine(double fine) {
        this.fine = fine;
    }

    public double getRealSalary() {
        return realSalary;
    }

    public void setRealSalary(double realSalary) {
        this.realSalary = realSalary;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "Lương=" + salary +
                ", Lương thưởng=" + bonusSalary +
                ", Tiền phạt=" + fine +
                ", Tên='" + name + '\'' +
                ", Tuổi=" + age +
                ", Quê quán='" + homeTown + '\'' +
                ", Mã giáo viên=" + id + "} ";
    }
}
