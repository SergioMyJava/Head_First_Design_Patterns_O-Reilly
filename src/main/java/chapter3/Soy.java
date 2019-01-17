package chapter3;

public class Soy extends CondimentDecorator{
    Baverage baverage;

    Soy(Baverage baverage){
        this.baverage = baverage;
    }


    @Override
    public String getDescription() {
        return baverage.getDiskription() + "Soy";
    }

    @Override
    public double coast() {
        return 0.23 + baverage.coast();
    }
}
