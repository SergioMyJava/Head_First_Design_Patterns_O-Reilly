package chapter8.caffeinebeverage;

public abstract class CaffeineBeverage {

    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if(customerWantsCondiments()){
            addCondiments();
        }
    }

    public void boilWater(){
        System.out.println("Boil water . ");
    }

    abstract void brew();

    public void pourInCup(){
        System.out.println("Pour in to cup .");
    }

    boolean customerWantsCondiments(){
        return true;
    }

    abstract void addCondiments();
}
