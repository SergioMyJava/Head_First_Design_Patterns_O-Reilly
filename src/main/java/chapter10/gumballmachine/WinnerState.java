package chapter10.gumballmachine;

public class WinnerState implements State {
    GumbullMachine gumbullMachine;

    public WinnerState(GumbullMachine gumbullMachine){
        this.gumbullMachine = gumbullMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Please wait, we’re already giving you a gumball");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Sorry, you already turned the crank");
    }

    @Override
    public void turnCrank() {
        System.out.println("Turning twice doesn’t get you another gumball!");
    }

    @Override
    public void dispense() {
        gumbullMachine.releaseBall();
        if (gumbullMachine.getCount() == 0) {
            gumbullMachine.setState(gumbullMachine.getSoldOutState());
        } else {
            gumbullMachine.releaseBall();
            System.out.println("YOU’RE A WINNER! You got two gumballs for your quarter");
            if (gumbullMachine.getCount() > 0) {
                gumbullMachine.setState(gumbullMachine.getNoQuarterState());
            } else {
                System.out.println("Oops, out of gumballs!");
                gumbullMachine.setState(gumbullMachine.getSoldOutState());
            }
        }
    }

    @Override
    public void refill() {

    }
}
