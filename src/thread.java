public class thread extends Thread
{
    public void run()
    {
        int i=1;
        while(true) {
            System.out.println(i + "Hello");
            i++;
        }
    }

    public static void main(String[] args) {
        thread t=new thread();
        t.start();
//        try {
//            t.join();
//        }
//        catch (Exception e){
//            System.out.println(e);
//        }
        int j=1;
        while(true)
        {
            System.out.println(j+"world");
            j++;
        }
    }
}
