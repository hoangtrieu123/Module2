package TestOop;

public class cat extends dog{
    public void di(){
        System.out.println("go go");
    }

    public static void main(String[] args) {
        cat cat = new cat();
        cat.di();
        cat.ngu();
        cat.eat();
    }
}

