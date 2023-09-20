class outer{
    static int x=10;
     Inner i=new Inner();
  class Inner{
      int y=10;
      int z=100;
       void innerdisplay()
      {
           z=x/y;
          System.out.println(z);
      }
      void outerdisplay()
      {
          i.innerdisplay();
          System.out.println(z);
      }
  }
}
public class Nested {
    public static void main(String[] args) {
       outer.Inner o=new outer().new Inner();
       o.outerdisplay();
    }
}
