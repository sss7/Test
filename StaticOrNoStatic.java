package test;

public class StaticOrNoStatic {

    static class A {
        int value = 5;

        public void Method() {
            System.out.println("Method in Class A");
        }

        public static void StaticMethod() {
            System.out.println("Static method in class A");
        }
    }

    static class B extends A {
        int value = 7;

        public void Method() {
            System.out.println("Method in Class B");
//            if (value --> 5) {
//                System.out.println(value);
//            }
        }

        public static void StaticMethod() {
            System.out.println("Static method in class B");
        }
    }


    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        A ab = new B();
        System.out.println(a.value);
        System.out.println(b.value);
        System.out.println(ab.value);

        a.Method();
        b.Method();
        ab.Method();

        a.StaticMethod();
        b.StaticMethod();
        ab.StaticMethod();

    }
}
