package chapter8;

import chapter8.sortducks.Duck;

import java.util.ArrayList;
import java.util.Arrays;

public class Application {

    public static void main(String[] args){
        ArrayList test = new ArrayList();
        Duck duck1 = new Duck(12,"Krasha");
        Duck duck2 = new Duck(1,"Porky");
        Duck duck3 = new Duck(9,"Siniy");
        Duck duck4 = new Duck(4,"Marta");
        Duck duck5 = new Duck(15,"Karapuz");
        Duck[] ducks = {duck1,duck2,duck3,duck4,duck5};
        System.out.println("Before sorting");
        prinDuck(ducks);
        System.out.println();
        System.out.println("After sorting");
        Arrays.sort(ducks);
        prinDuck(ducks);

    }
    static void prinDuck(Duck[] ducks){
        for(Duck d:ducks){
            System.out.println(d.getName());
        }
    }
}
