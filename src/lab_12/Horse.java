package lab_12;

public class Horse implements FlyAble, MoveAble {
    @Override
    public int speed() {
        return 90;
    }

    @Override
    public boolean flyAble() {
        return false;
    }
}
