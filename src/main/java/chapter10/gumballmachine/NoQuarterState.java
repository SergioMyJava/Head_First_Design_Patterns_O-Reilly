package chapter10.gumballmachine;

public class NoQuarterState implements State {
    GumbullMachine gumbullMachine;

    public NoQuarterState(GumbullMachine gumbullMachine){
        this.gumbullMachine = gumbullMachine;
    }

    public void insertQuarter() {
        System.out.println("You inserted a quarter");
        gumbullMachine.setState(gumbullMachine.getHasQuarterState());
    }
    public void ejectQuarter() {
        System.out.println("You haven’t inserted a quarter");
    }
    public void turnCrank() {
        System.out.println("You turned, but there’s no quarter");
    }

    @Override
    public void dispense() {
        System.out.println("You need to pay first");
    }

}
