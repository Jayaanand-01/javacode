
class phone
{
    public void call()
    {
        System.out.println("Phone is used to call");
    }
    public void SMS()
    {
        System.out.println("Phone is used for messaging");
    }
}
interface  Icamera
{
    void click();
    void record();
}
interface Imusicplayer{
    void play();
    void stop();
}
 class smartphone extends phone implements Icamera,Imusicplayer
{
    @Override
    public void call() {System.out.println("Smartphone video calling");}
    public void click() {System.out.println("Smartphone clicking photo");}
    public void record() {System.out.println("Smartphone is recording the video");}
    public void play() {System.out.println("Smartphone is playing video now");}
    public void stop() {System.out.println("Smartphone is stopped");}

}
public class Smartphone_Interface {
    public static void main(String[] args) {
        smartphone test=new smartphone();
        test.call();
        test.click();
        test.play();
        test.record();
        test.stop();
    }

}
