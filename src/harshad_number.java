import java.util.Scanner;
//If remainder is zero then it is the harshad number
public class harshad_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n= sc.nextInt();
        int x=n;
        int y,sum=0;
        while(x>0)
        {
            y=x%10;
            sum=sum+y;
            x=x/10;
        }
        if(n%sum==0)
            System.out.println(n+" is a harshad number");
        else
            System.out.println(n+ " is not a harshad number.");
    }
}