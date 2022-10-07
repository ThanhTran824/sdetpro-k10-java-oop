package lab_09;

import java.security.SecureRandom;

public class Horse extends RacingAnimal {

    /*public Horse(){
        this.speed = new SecureRandom().nextInt(Settings.horseMaxSpeed);
        this.name = "Horse";
    }*/
    public int getSpeed(){
        return super.getSpeed();
    }
}
