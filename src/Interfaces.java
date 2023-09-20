
    abstract class Test
    {
        abstract void meth1();
        abstract void meth2();
    }
     class my extends Test
    {
        @Override
        public void meth1() {
        System.out.println("My method");
        }
        public void meth2() {
            System.out.println("My method2");
        }
    }
    public class Interfaces
    {
    public static void main(String[] args) {
    Test t;
        t = new my();
        t.meth1();
    t.meth2();
        }
    }


