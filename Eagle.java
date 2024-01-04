public class Eagle extends Bird  implements Fly {

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }
    @Override
    public void takeOff() {
        System.out.println(getName() + " takes off in the sky.");
    }

    @Override
    public void ascend(int meters) {
        System.out.println(getName() + " ascends to an altitude of " + meters + " meters.");
    }

    @Override
    public void descend(int meters) {
        System.out.println(getName() + " descends to an altitude of " + meters + " meters.");
    }

    @Override
    public void glide() {
        System.out.println(getName() + " glides through the air effortlessly.");
    }

    @Override
    public void land() {
        System.out.println(getName() + " lands gracefully.");
    }

    @Override
    public String sing() {
        // TODO Auto-generated method stub
        return "Eagle singing: Screech! Screech!";
    }
}