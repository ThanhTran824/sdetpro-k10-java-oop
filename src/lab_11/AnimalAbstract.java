package lab_11;

import java.security.SecureRandom;

public abstract class AnimalAbstract {
    protected String name;
    protected int speed;

    public abstract void setRaceSpeed(int maxSpeed);

    public abstract int getSpeed();

    public abstract void setName(String name);

    public abstract String getName();
}
