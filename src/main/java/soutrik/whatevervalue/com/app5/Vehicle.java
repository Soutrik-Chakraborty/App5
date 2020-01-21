package soutrik.whatevervalue.com.app5;

public class Vehicle {

    private int speed;
    private final boolean hasBreakingSystem;
    private int numberofWheels;

    private int rideSpeed;


    public Vehicle (int speed, boolean hasBreakingSystem, int numberofWheels) {

        this.speed = speed;
        this.hasBreakingSystem = hasBreakingSystem;
        this.numberofWheels = numberofWheels;


    }


    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean getHasBreakingSystem() {
        return hasBreakingSystem;
    }

    public int getNumberofWheels() {
        return numberofWheels;
    }

    public void setNumberofWheels(int numberofWheels) {
        this.numberofWheels = numberofWheels;
    }

    public int getRideSpeed() {
        return rideSpeed;
    }

    public void setRideSpeed(int rideSpeed) {
        this.rideSpeed = rideSpeed;
    }

    public void ride () {

        int result = getSpeed() * getNumberofWheels();
        rideSpeed = result;

    }

    @Override
    public  String toString () {
        return String.format("")

    }

}
