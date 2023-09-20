public class car extends vehicle {
    private int wheels;
    private String type;
    private int doors;
    private int gears;
    private boolean ismanual;
    private int currentgear;

    public car(String name, int wheels, int doors, int gears, boolean ismanual, String type) {
        super(name);
        this.type = type;
        this.currentgear = 1;
        this.doors = doors;
        this.gears = gears;
        this.wheels = wheels;
        this.ismanual = ismanual;
    }

    public void changeGear(int newGear) {
        this.currentgear = newGear;
        System.out.println("Change gear method is called:\n changed to " + this.currentgear + " gear");
    }

    public void changeSpeed(int newSpeed, int newDirection) {
        move(newSpeed, newDirection);
        System.out.println("Changed speed method is called:\nSpeed---> " + newSpeed + " direction--->" + newDirection);
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getGears() {
        return gears;
    }

    public void setGears(int gears) {
        this.gears = gears;
    }

    public boolean isIsmanual() {
        return ismanual;
    }

    public void setIsmanual(boolean ismanual) {
        this.ismanual = ismanual;
    }

    public int getCurrentgear() {
        return currentgear;
    }

    public void setCurrentgear(int currentgear) {
        this.currentgear = currentgear;
    }
}
