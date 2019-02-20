package chapter8.caffeinebeverage;

public class Application {
    public static void main(String[] args) {
        Tea tea = new Tea();
        Coffee cof = new Coffee();
        tea.prepareRecipe();
        cof.prepareRecipe();
    }
}
