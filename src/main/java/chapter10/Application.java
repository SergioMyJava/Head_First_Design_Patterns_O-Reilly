package chapter10;

import chapter10.gumballmachine.GumbullMachine;

public class Application {
    public static void main(String[] args){

        GumbullMachine test = new GumbullMachine(10);

        test.insertQuarter();
        test.turnCrank();
        System.out.println(" ");

        test.insertQuarter();
        test.turnCrank();
        test.turnCrank();
        System.out.println(" ");

        for(int i = 7;i>0;i--){
            System.out.println(" ");
            test.insertQuarter();
            test.turnCrank();
        }
    }
}
