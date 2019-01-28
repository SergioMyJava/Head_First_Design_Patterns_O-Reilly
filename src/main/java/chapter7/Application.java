package chapter7;

import chapter7.turkeyexample.AdapterForTurkey;
import chapter7.turkeyexample.CrasyWildeTurkey;
import chapter7.turkeyexample.Duck;
import chapter7.turkeyexample.RealDuck;

public class Application {

    public static void main(String[] args) {
        RealDuck duck = new RealDuck();
        CrasyWildeTurkey turkey = new CrasyWildeTurkey();
        AdapterForTurkey adapter = new AdapterForTurkey(turkey);

        System.out.println("Test Turkey");
        turkey.gobble();
        turkey.fly();

        System.out.println("Test Duck");
        test(duck);

        System.out.println("Test Adapter");
        test(adapter);

    }
    public  static void test(Duck duck){
        duck.squack();
        duck.fly();
    }
}