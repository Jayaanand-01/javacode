public class Employee {
    String name;
    int yearofJoining;
    String address;

    public Employee(String name, int yearofJoining, String address) {
        this.name = name;
        this.yearofJoining = yearofJoining;
        this.address = address;
    }
    void display()
    {
        System.out.printf("%-15s %-20d %-20s\n",name,yearofJoining,address);
    }
}
class good{
    public static void main(String[] args) {
        Employee e1=new Employee("Robert", 1994, "64C- WallsStreet");
        Employee e2=new Employee("Sam", 2000, "68D- WallsStreet");
        Employee e3=new Employee("John", 1999, "26B- WallsStreet"   );
        System.out.println("Name             Joiningyear              Address");
        e1.display();
        e2.display();
        e3.display();
    }
}

