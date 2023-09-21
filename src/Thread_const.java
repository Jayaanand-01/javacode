public class Thread_const extends Thread{
    public Thread_const(String name)
    {
        super(name);
    }
}
 class Mythread{
    public static void main(String[] args)
    {
        Thread_const th=new Thread_const("Helloo") ;
//th=th.setPriority(10);
        System.out.println(th);
    }
}
