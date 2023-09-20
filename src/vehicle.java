
//Parent class vehicle
public class vehicle {
    private String name;
    private int currentspeed;
    private int currentdirection;

    //Constructor is used
    public vehicle(String name) {
        this.name = name;
        this.currentspeed = 0;
        this.currentdirection = 0;
    }

    public void steer(int direction) {
        this.currentdirection = currentdirection + direction;
        System.out.println("Steer method called:\n Steering at " + currentdirection + " degrees");
    }

    public void move(int speed, int direction) {
        currentspeed = speed;
        currentdirection = direction;
        System.out.println("Move method called:\nMoving at " + currentspeed + " in direction" + currentdirection);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCurrentspeed() {
        return currentspeed;
    }

    public void setCurrentspeed(int currentspeed) {
        this.currentspeed = currentspeed;
    }

    public int getCurrentdirection() {
        return currentdirection;
    }

    public void setCurrentdirection(int currentdirection) {
        this.currentdirection = currentdirection;
    }

    public void stop() {
        this.currentspeed = 0;
        System.out.println("Vehicle is stopped ");
    }
}

class carappl {
        public static void main(String[] args) {
            SUV Innova = new SUV("Innova", false);
            Innova.move(40, 0);
            Innova.accelerate(0);
           // Innova.accelerate(-60);
            System.out.println("CurrentGear "+Innova.getCurrentgear());
            System.out.println("Currentdirection "+Innova.getCurrentdirection());
            System.out.println("Currentspeed "+Innova.getCurrentspeed());
            System.out.println("Type "+Innova.getType());
            System.out.println("Doors "+Innova.getDoors());
        }
    }



