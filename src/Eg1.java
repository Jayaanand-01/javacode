@FunctionalInterface
interface Lambda
{
public void display();
}
class Demo
{
    public void meth1()
    {
        Lambda m1=()->
        {
            System.out.println("HI");
        };
        }
    }
    public class Eg1
    {
        public static void main(String[] args) {
            Demo d=new Demo();
            d.meth1();
        }
}
