package chapter9.composite;

public class MenuItem extends MenuComponent{
    String name;
    String description;
    boolean vegetarian;
    double price;

    public MenuItem(String name,String description,boolean vegetarian,double price){
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    public String getName(){
        return name;
    }

    public String getDescription(){
        return description;
    }

    public boolean isVegetarian() { return vegetarian; }

    public double getPrice(){ return price;}

    public void print(){
        System.out.println(" " + getName());
        if(isVegetarian()){System.out.println(" V ");}
        System.out.println(", " + getDescription());
        System.out.println("    -- " + getPrice());
    }
}
