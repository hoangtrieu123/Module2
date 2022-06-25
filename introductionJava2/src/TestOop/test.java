package TestOop;

public class test {
    public static void main(String[] args) {
        A a = new A();
        a.add(10);
        a.ad(10.0);
    }
}

class A extends B {
    public void add(double number) {
        System.out.println(number);
    }
}

class B {
    public void ad(double number) {
        System.out.println(number * 2);
    }
}
