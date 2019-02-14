package chapter1;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new ModelDuck();
        mallard.performQuack();
        mallard.setPerformFly(new FlyRocketPowered());
        mallard.performFly();

    }
}
