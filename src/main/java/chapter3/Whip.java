package chapter3;

public class Whip extends CondimentDecorator{
    Baverage baverage;

    Whip(Baverage baverage){
        this.baverage = baverage;
    }

    @Override
    public String getDescription() {
        return baverage.getDiskription() + "Whip";
    }

    @Override
    public double coast() {
        return 0.10 + baverage.coast();
    }
}
