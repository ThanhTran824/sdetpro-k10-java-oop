package lab_09;

import java.security.SecureRandom;

public class Dog extends RacingAnimal {
    public Dog(){
        this.speed = new SecureRandom().nextInt(Settings.dogMaxSpeed);
        this.name = "Dog";
    }
    public int getSpeed(){
        return super.getSpeed();
    }
}
