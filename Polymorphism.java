package test;

/**
 * Created by psushenko on 12.07.2017.
 */
class Class1 {
    public Class1() {
        System.out.println("Class1");
    }
}

class Class2 extends Class1 {
    public Class2() {
        System.out.println("Class2");
    }
}

class Class3 extends Class2{
    public Class3() {
        System.out.println("Class3");
    }
}

class Class4 {
    public Class4() {
        System.out.println("Class4");
    }
}

class Class5 {
    public Class5() {
        System.out.println("Class5");
    }
}


public class Polymorphism extends Class3 {
    private Class4 c4;// = new Class4();
    private Class5 c5;// = new Class5();

    public Polymorphism() {
        System.out.println("Polymorphism");
        c4 = new Class4();
        c5 = new Class5();

    }

    public static void main(String[] args) {
        System.out.println("BEGIN");
        Polymorphism polymorphism = new Polymorphism();
        System.out.println("END");
    }
}
