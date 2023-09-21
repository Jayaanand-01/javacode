import java.util.Scanner;

public class pattern1 {
    //{
//    public static void main(String[] args) {
//
//        int count=0;
////        Scanner sc=new Scanner(System.in);
////        int n= sc.nextInt();
//        for(int i=1;i<=5;i++)
//        {
//        for(float j=1;j<=(5-i)+1;j++)
//        {
//        count++;
//        System.out.printf(" %02f ",count);
//        }
//        System.out.println("  ");
//        }
//        }
//        }
//    public static void main(String[] args) {
//
//        int  count = 15;
//        for (int i = 1; i <= 5; i++) {
//            for (int j = 1; j <= i; j++) {
//                count++;
//                System.out.print(count + " ");
//            }
//            System.out.println(" ");
//        }
//    }
//}

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println(" ");
        }
    }
}

