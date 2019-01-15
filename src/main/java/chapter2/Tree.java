package chapter2;

public abstract class Tree {
    String name;
    Fruit fruit;

    Tree(){}

    public void setFruit(Fruit fr){
        this.fruit = fr;
    }

    public abstract String getName();
}
