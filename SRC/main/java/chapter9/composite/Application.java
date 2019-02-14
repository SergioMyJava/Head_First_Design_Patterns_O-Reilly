package chapter9.composite;

public class Application {

    public static void main(String[] args) {
        MenuComponent pancakeMenu = new Menu("PANCAKE HOUSE MENU", "Breakfast");
        MenuComponent cafeMenu = new Menu("CAFE MENU", "Dinner");
        MenuComponent dinerMenu = new Menu("DINER MENU", "Lunch");
        MenuComponent desert = new Menu("DESSERT MENU", "Dessert of course!");

        MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");

        allMenus.add(pancakeMenu);
        allMenus.add(cafeMenu);
        allMenus.add(dinerMenu);



        dinerMenu.add(new MenuItem("Vegetarian BLT",
                "(Fakin’) Bacon with lettuce & tomato on whole wheat", true, 2.99));
        dinerMenu.add(new MenuItem("BLT",
                "Bacon with lettuce & tomato on whole wheat", false, 2.99));
        dinerMenu.add(new MenuItem("Soup of the day",
                "Soup of the day, with a side of potato salad", false, 3.29));
        dinerMenu.add(new MenuItem("Hotdog",
                "A hot dog, with saurkraut, relish, onions, topped with cheese",
                false, 3.05));

        cafeMenu.add(new MenuItem("Veggie Burger and Air Fries",
                "Veggie burger on a whole wheat bun, lettuce, tomato, and fries",true, 3.99));
        cafeMenu.add(new MenuItem("Soup of the day",
                "A cup of the soup of the day, with a side salad",false, 3.69));
        cafeMenu.add(new MenuItem("Burrito",
                "A large burrito, with whole pinto beans, salsa, guacamole",true, 4.29));

        pancakeMenu.add(new MenuItem("Regular Pancake Breakfast",
                "Pancakes with fried eggs, sausage",false,2.99));
        pancakeMenu.add(new MenuItem("K&B s Pancake Breakfast","Pancakes with scrambled eggs, and toast",true,
                2.99));
        pancakeMenu.add(new MenuItem("Blueberry Pancakes",
                "Pancakes made with fresh blueberries",true,3.49));
        pancakeMenu.add(new MenuItem("Waffles",
                "Waffles, with your choice of blueberries or strawberries",true,3.59));

        dinerMenu.add(desert);

        desert.add(new MenuItem("Apple Pie",
                "Apple pie with a flakey crust, topped with vanilla icecream",true,1.59));

        Waitress masha = new Waitress(allMenus);
        masha.printMenu();
    }
}
