public class Nature {

    public static void main(String[] args) {

        /*
        javac *.java
        java Nature 
        Pingou dives into the water.
        Pingou swims downward, depths : 3
        Pingou swims upward, depths : 2
        Pingou swims downward, depths : 6
        Pingou swims upward, depths : 1
        Pingou swims upward, depths : 0
        Pingou gets out of the water.
        Hawkeye takes off in the sky.
        Hawkeye ascends to an altitude of 120 meters.
        Hawkeye ascends to an altitude of 30 meters.
        Hawkeye glides through the air effortlessly.
        Hawkeye descends to an altitude of 140 meters.
        Hawkeye lands gracefully.
        Hawkeye descends to an altitude of 9 meters.
        Hawkeye lands gracefully.

        */
        Penguin pingou = new Penguin("Pingou");
        pingou.dive();
        pingou.swimDown(3);
        pingou.swimUp(1);
        pingou.swimDown(4);
        pingou.swimUp(5);
        pingou.swimUp(1);
        pingou.getOut();

        Eagle hawkeye = new Eagle("Hawkeye");
        // TODO : uncomment the following code in order to test it
        
        hawkeye.takeOff();
        hawkeye.ascend(120);
        hawkeye.ascend(30);
        hawkeye.glide();
        hawkeye.descend(140);
        hawkeye.land();
        hawkeye.descend(9);
        hawkeye.land();
        
    }
}
