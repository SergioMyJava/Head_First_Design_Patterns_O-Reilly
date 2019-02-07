package chapter10.gumballmachine;

public class GumbullMachine {
    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State soldState;
    State winnerState;

    State state;
    int count = 0;

    public GumbullMachine(int numberGumballs) {
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        winnerState = new WinnerState(this);
        this.count = numberGumballs;
        if (numberGumballs > 0) {
            state = noQuarterState;
        } else {
            state = soldOutState;
        }
    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    void setState(State state) {
        this.state = state;
    }

    void releaseBall() {
        System.out.println("A gumball comes rolling out the slot...");
        if (count != 0) {
            this.count = count-1;
        }
    }

    State getHasQuarterState(){
        return hasQuarterState;
    }

    State getNoQuarterState(){
        return noQuarterState;
    }

    public int getCount(){
        return count;
    }

    State getSoldState(){
        return soldState;
    }

    State getSoldOutState(){
        return soldOutState;
    }

    State getWinnerState(){
        return winnerState;
    }

    public String toString(){
        return "Count " + getCount() ;
    }

    void refill(int count) {
        this.count += count;
        System.out.println("The gumball machine was just refilled; it's new count is: " + this.count);
        state.refill();
    }
}
