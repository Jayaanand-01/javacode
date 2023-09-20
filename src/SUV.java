public class SUV extends car {

    public SUV(String name, boolean ismanual) {
        super(name, 4, 4, 6, ismanual, "SUV");
    }

    public void accelerate(int rate) {
        int newSpeed = getCurrentspeed() + rate;
        if (newSpeed == 0) {
            stop();
            changeGear(1);
        } else if (newSpeed > 0 && newSpeed <= 10) {
            changeGear(1);
        } else if (newSpeed > 10 && newSpeed <= 20) {
            changeGear(2);
        } else if (newSpeed > 20 && newSpeed <= 40) {
            changeGear(3);
        } else if (newSpeed > 40 && newSpeed < 60) {
            changeGear(4);
        } else if (newSpeed > 60 && newSpeed <= 70) {
            changeGear(5);
        } else
            changeGear(6);
        if (newSpeed > 0) {
            changeSpeed(newSpeed, getCurrentdirection());
        }
    }
}
