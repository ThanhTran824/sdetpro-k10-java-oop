package lab_12;

public class Eagle implements FlyAble, MoveAble {
    @Override
    public int speed() {
        return 100;
    }

    @Override
    public boolean flyAble() {
        return true;
    }
}
