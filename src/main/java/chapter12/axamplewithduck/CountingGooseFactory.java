package chapter12.axamplewithduck;

public class CountingGooseFactory extends AbstracktGooseFactory {
    static int gooseQuacked = 0;

    @Override
    public GooseAdapter createGoose() {
        gooseQuacked++;
        return new GooseAdapter(new Goose());

    }

    public int getGooseQuacked(){
        return gooseQuacked;
    }
}
