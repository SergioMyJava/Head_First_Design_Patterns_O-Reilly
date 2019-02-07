package chapter10.gumballmachine;

import java.util.Random;

public class HasQuarterState implements State {
    Random randomWinner = new Random(System.currentTimeMillis());
    GumbullMachine gumbullMachine;

    public HasQuarterState(GumbullMachine gumbullMachine){
        this.gumbullMachine = gumbullMachine;
    }

    public void insertQuarter() {
        System.out.println("You can’t insert another quarter");
    }

    public void ejectQuarter() {
        System.out.println("Quarter returned");
        gumbullMachine.setState(gumbullMachine.getNoQuarterState());
    }
    public void turnCrank() {
        System.out.println("You turned...");
        int winner = randomWinner.nextInt(10);
        if((gumbullMachine.getCount()>1)&&(winner ==0)){
            gumbullMachine.setState(gumbullMachine.getWinnerState());
        }
        else {
            gumbullMachine.setState(gumbullMachine.getSoldState());
        }
    }

    public void dispense() {
        System.out.println("No gumball dispensed");
    }

    @Override
    public void refill() {

    }
}
