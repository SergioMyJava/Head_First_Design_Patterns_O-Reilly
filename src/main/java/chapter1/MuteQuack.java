package chapter1;

public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.print("<<Silence>>");
    }
}
