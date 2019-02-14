package chapter8.SortDucks;

public class Duck implements Comparable{
    String name;
    int whight;

    public Duck(int whight, String name){
        this.name = name;
        this.whight = whight;
    }

    @Override
    public int compareTo(Object o) {
        Duck duck = (Duck) o;
        if (this.whight > duck.whight){
            return 1;
    }
        else if(this.whight < duck.whight){
            return  -1;
        }
        else
            return 0;
    }

    public String getName(){
        return name;
    }
}
