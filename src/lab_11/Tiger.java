package lab_11;

import java.security.SecureRandom;

public class Tiger extends AnimalAbstract {
    //private int speed;
    //private String name;

    public void setRaceSpeed(int maxSpeed) {
        this.speed = new SecureRandom().nextInt(maxSpeed);
    }

    public int getSpeed() {
        return this.speed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
