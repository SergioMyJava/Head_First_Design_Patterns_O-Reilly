package chapter3;

public class Mocha extends CondimentDecorator {
    Baverage baverage;

    Mocha(Baverage baverage){
        this.baverage = baverage;
    }

    @Override
    public String getDescription() {
        return baverage.getDiskription() + " Mocha ";
    }

    @Override
    public double coast() {
        return 0.20 + baverage.coast();
    }
}
