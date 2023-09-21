import java.util.Scanner;

public class Encap {
        // Private data members (attributes)
        private String name;
        private int age;

        // Constructor to initialize the attributes
        public Encap(String name, int age) {
            this.name = name;
            this.age = age;
        }

        // Getter method to access the name attribute
        public String getName() {
            return name;
        }

        // Setter method to modify the name attribute
        public void setName(String name) {
            this.name = name;
        }

        // Getter method to access the age attribute
        public int getAge() {
            return age;
        }

        // Setter method to modify the age attribute
        public void setAge(int age) {
            if (age >= 0) {
                this.age = age;
            } else {
                System.out.println("Age cannot be negative.");
            }
        }

        // Display student information
        public void displayInfo() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        }

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter your name:");
            String s= sc.nextLine();
            System.out.println("Enter yout age: ");
            int a= sc.nextInt();
            // Create a Student object
            Encap student = new Encap(s,a);

            // Access and modify attributes using getter and setter methods
            student.setName(s);
            student.setAge(a);

            // Display student information
            student.displayInfo();
        }
    }

