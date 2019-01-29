package chapter8.CaffeineBeverage;

public class Application {
    public static void main(String[] args) {
        Tea tea = new Tea();
        Coffee cof = new Coffee();
        tea.prepareRecipe();
        cof.prepareRecipe();
    }
}
