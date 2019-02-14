package chapter7.turkeyexample;

public class AdapterForTurkey implements Duck{
    CrasyWildeTurkey turkey;

    public AdapterForTurkey(CrasyWildeTurkey turkey){
        this.turkey = turkey;
    }

    @Override
    public void squack() {
     turkey.gobble();
    }

    @Override
    public void fly() {
    for(int i = 0;i<5;i++){
        turkey.fly();
    }
    }
}
