package chapter10.gumballmachine;

public class SoldState implements State {
    GumbullMachine gumbullMachine;

    public SoldState(GumbullMachine gumbullMachine){
        this.gumbullMachine = gumbullMachine;
    }

    public void insertQuarter() {
        System.out.println("Please wait, we’re already giving you a gumball");
    }

    public void ejectQuarter() {
        System.out.println("Sorry, you already turned the crank");
    }

    public void turnCrank() {
        System.out.println("Turning twice doesn’t get you another gumball!");
    }

    public void dispense() {
        gumbullMachine.releaseBall();
        if (gumbullMachine.getCount() > 0) {
            gumbullMachine.setState(gumbullMachine.getNoQuarterState());
        } else if(gumbullMachine.getCount() == 0) {
            System.out.println("Oops, out of gumballs!");
            gumbullMachine.setState(gumbullMachine.getSoldOutState());
        }
    }

    @Override
    public void refill() {

    }
}
