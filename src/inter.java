interface Llambda
{
    public void display(String str);
}

public class inter
{
    public inter(String str)
    {
        System.out.println(str.toUpperCase());

    }
//    public  void reverse(String str)
//    {
//        StringBuffer sb = new StringBuffer(str);
//        sb.reverse();
//        System.out.println(sb);
//    }
        public static void main(String[] args)
        {
           // inter n=new inter();
        Llambda m=inter::new;
        m.display("heello");
        }
}
