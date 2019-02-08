package chapter11;

import chapter11.gumballmachine.GumballMachine;
import chapter11.gumballmachine.GumballMonitor;

public class Application {

    public static void main(String[] args) {
        int count = 0; //объявили переменную

        if (args.length < 2) { // считали строку в данном случае она = 1 ,если я правильно понимаю
            System.out.println("GumballMachine <name> <inventory>"); //странно но просто печатает эту строку
            System.exit(1); //просто выход из программы и дальше ничего не выполняется, я правильно понимаю что есл  System.exit(0); то работало бы дальше.
        }
        count = Integer.parseInt(args[1]); //присваиваем переменной в данном случае это была бы 1 если бы не exit
        GumballMachine gumballMachine = new GumballMachine(args[0], count);//не ясно откуда возмется args[0]
        GumballMonitor monitor = new GumballMonitor(gumballMachine);

        System.out.println(gumballMachine);
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        System.out.println(" ");

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.turnCrank();
        System.out.println(" ");

        monitor.report();
    }
}
