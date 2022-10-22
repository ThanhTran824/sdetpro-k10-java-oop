package lab_11;

import java.security.SecureRandom;

public class Dog extends AnimalAbstract {

    @Override
    public void setRaceSpeed(int maxSpeed) {
        this.speed = new SecureRandom().nextInt(maxSpeed);
    }

    @Override
    public int getSpeed() {
        return this.speed;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
