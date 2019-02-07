package chapter10.gumballmachine;

public class SoldOutState implements State {
    GumbullMachine gumbullMachine;

    public SoldOutState(GumbullMachine gumbullMachine){
        this.gumbullMachine = gumbullMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("We sorry but the balls are over. Call us and we will replenish the piggy bank. Call 911.");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("We did not take your coin, it is where you put it.");
    }

    @Override
    public void turnCrank() {
        System.out.println("Stop messing around, we will call your parents.Balls are over.");
    }

    @Override
    public void dispense() {
        System.out.println("We sorry but the balls are over. Call us and we will replenish the piggy bank. Call 911.");
    }

    public void refill() {
        gumbullMachine.setState(gumbullMachine.getNoQuarterState());
    }
}
