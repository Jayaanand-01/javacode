import java.util.Scanner;
public class Array1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=s.nextInt();
        while(n>20||n<0)
        {
            System.out.print("Invalid number,Put different number");
        }
        int[] number=new int[n];
        fillarraynumbers(number);
        printarraynumbers(number);
    }
    public static void printarraynumbers(int[] number)
    {
        System.out.println("The elements are:");
    }
    public static void fillarraynumbers(int[] number)
    {
        Scanner input=new Scanner(System.in);
        for(int i=0;i<number.length;i++)
        number[i]=input.nextInt();
    }
}
