package chapter12.axamplewithduck;

public class DuckSimulator {

    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        AbstractDuckFactory duckFactory = new CountingDuckFactory();
        AbstracktGooseFactory gooseFactory = new CountingGooseFactory();
        simulator.simulate(duckFactory,gooseFactory);
    }
        void simulate( AbstractDuckFactory duckFactory,AbstracktGooseFactory gooseFactory) {
            System.out.println("\nDuck Simulator: With Composite — Flocks");

            Flock flockOfDucks = new Flock();

            Quackable redHeadDuck = new QuackCounter(duckFactory.createRedHeadDuck());
            Quackable duckCall = new QuackCounter(duckFactory.createDuckCall());
            Quackable rubberDuck = new QuackCounter(duckFactory.createRubberDuck());
            Quackable gooseDuck = gooseFactory.createGoose();
            flockOfDucks.add(redHeadDuck);
            flockOfDucks.add(duckCall);
            flockOfDucks.add(rubberDuck);
            flockOfDucks.add(gooseDuck);

            Flock flockOfMallards = new Flock();

            Quackable mallardOne = duckFactory.createMallardDuck();
            Quackable mallardTwo = duckFactory.createMallardDuck();
            Quackable mallardThree = duckFactory.createMallardDuck();
            Quackable mallardFour = duckFactory.createMallardDuck();
            flockOfMallards.add(mallardOne);
            flockOfMallards.add(mallardTwo);
            flockOfMallards.add(mallardThree);
            flockOfMallards.add(mallardFour);

            flockOfDucks.add(flockOfMallards);

            System.out.println("\nDuck Simulator: Whole Flock Simulation");
            simulate(flockOfDucks);
            System.out.println("\nDuck Simulator: Mallard Flock Simulation");
            simulate(flockOfMallards);
            System.out.println("\nThe ducks quacked " + QuackCounter.getQuacks() +" times");

            System.out.println("\nTesting Observer ");

            Flock flockObserver = new Flock();

            Quackable DuckOne = duckFactory.createRedHeadDuck();
            Quackable duckCallTwo = duckFactory.createDuckCall();
            Quackable rubberDuckThree = duckFactory.createRubberDuck();
            Quackable gooseDuckFour = gooseFactory.createGoose();
            flockObserver.add(DuckOne);
            flockObserver.add(duckCallTwo);
            flockObserver.add(rubberDuckThree);
            flockObserver.add(gooseDuckFour);

            Observer quackologist = new Quackologist();
            flockObserver.registerObserver(quackologist);
            simulate(flockObserver);

            System.out.println("\nThe ducks quacked " + QuackCounter.getQuacks() +" times");
            System.out.println("\nThe goose quacked " + gooseFactory.getGooseQuacked() +" times");

        }

        void simulate(Quackable duck) {
            duck.quack();
        }
}

