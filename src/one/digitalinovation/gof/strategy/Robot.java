package one.digitalinovation.gof.strategy;

public class Robot {

    private Behavior behavior;

    public void setBehavior(Behavior behavior) {
        this.behavior = behavior;
    }

    public void move() {
        behavior.move();
    }

    public Robot() {}
}
