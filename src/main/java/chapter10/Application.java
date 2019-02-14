package chapter10;


import chapter10.gumballmachine.GumballMachine;

public class Application {
    public static void main(String[] args){

        GumballMachine test = new GumballMachine(10);

        System.out.println(test);
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
