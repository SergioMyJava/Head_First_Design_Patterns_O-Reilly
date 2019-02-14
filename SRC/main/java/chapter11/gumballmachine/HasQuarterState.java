package chapter11.gumballmachine;

import java.util.Random;

public class HasQuarterState implements State {
    private static final long serialVersionUID = 2L;
    transient GumballMachine gumballMachine;
    Random randomWinner = new Random(System.currentTimeMillis());

    public HasQuarterState(GumballMachine gumbullMachine){
        this.gumballMachine = gumbullMachine;
    }

    public void insertQuarter() {
        System.out.println("You can’t insert another quarter");
    }

    public void ejectQuarter() {
        System.out.println("Quarter returned");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }
    public void turnCrank() {
        System.out.println("You turned...");
        int winner = randomWinner.nextInt(10);
        if((gumballMachine.getCount()>1)&&(winner ==0)){
            gumballMachine.setState(gumballMachine.getWinnerState());
        }
        else {
            gumballMachine.setState(gumballMachine.getSoldState());
        }
    }

    public void dispense() {
        System.out.println("No gumball dispensed");
    }

    @Override
    public void refill() {
    }

    public String toString() {
        return " no quarter state ";
    }
}
