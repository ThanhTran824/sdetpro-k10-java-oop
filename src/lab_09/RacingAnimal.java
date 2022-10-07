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

    public void setRandomSpeed(int speed) {
        this.speed = new SecureRandom().nextInt(speed);
    }

    public void setName(String name) {
        this.name = name;
    }
}
