package lab_09;

import java.security.SecureRandom;

public class RacingAnimal {
    private int speed;
    private String name;

    public int getSpeed() {
        return this.speed;
    }

    public String getName() {
        return this.name;
    }

    public void setRandomSpeed() {
        this.speed = new SecureRandom().nextInt(Settings.horseMaxSpeed);
    }

    public void setName(String name) {
        this.name = name;
    }
}
