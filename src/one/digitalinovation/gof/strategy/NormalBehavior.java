package one.digitalinovation.gof.strategy;

public class NormalBehavior implements Behavior{

    @Override
    public void move() {
        System.out.println("Moving normaly");
    }
}
