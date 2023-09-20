public class Stack {
    int s[] = new int[10];
    int tos;
    Stack() {
        tos = -1;
    }
    void push(int item) {
        if (tos == 9) {
            System.out.println("Stack is full");
        } else {
            s[++tos] = item;
        }}
        int pop()
        {
            if (tos >= 0)
            {
                return s[tos--];
            }
            else
            {
                System.out.println("Stack is Empty");
                return -1;
            }
//        }
//        int top()
//        {
//            if(tos>0)
//            {
//                return s[tos];
//            }
//            else
//            {
//                System.out.println("Stack is Empty");
//                return -1;
         //   }
        }
    }

             class Stackdemo{
                public static void main(String[] args) {
                    Stack s1=new Stack();
                    s1.push(5);
                    s1.push(10);
                    s1.push(15);
                    //s1.push(20);
                    System.out.println("Top element:"+s1.pop());
                }
            }


