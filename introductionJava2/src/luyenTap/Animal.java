package luyenTap;

public class Animal {
    double weight;
    double height;
    String gender;
    String color;

    public Animal() {
    }
    public Animal(double weight, double height, String gender, String color) {
        this.weight = weight;
        this.height = height;
        this.gender = gender;
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "weight=" + weight +
                ", height=" + height +
                ", gender='" + gender + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
