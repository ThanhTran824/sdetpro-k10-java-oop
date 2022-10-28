package lab_12;

public class Dog implements FlyAble, MoveAble {
    @Override
    public int speed() {
        return 50;
    }

    @Override
    public boolean flyAble() {
        return false;
    }
}

