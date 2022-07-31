package Day9Set.Task12Restaurant;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        String potrawa = "cos";
        Restaurant restaurant = new Restaurant();
        Dish dish = new Dish("ogorkowa", 17, DishType.DINNER, 378);
        Dish dish5 = new Dish("salatka", 13, DishType.APPETIZER, 301);
        Dish dish2 = new Dish("kurczak", 28, DishType.BREAKFAST, 152);
        Dish dish3 = new Dish("spaghetti", 28, DishType.DINNER, 152);
        Dish dish4 = new Dish("kanapki", 12, DishType.APPETIZER, 230);
        Dish dish6 = new Dish("platki", 7, DishType.BREAKFAST, 180);
        restaurant.addDish(dish);
        restaurant.addDish(dish2);
        restaurant.addDish(dish3);
        restaurant.addDish(dish4);
        restaurant.addDish(dish5);
        restaurant.addDish(dish6);

        System.out.println("Wyœwietlanie potraw: ");
        System.out.println(restaurant);

        System.out.println("Porównanie potrawy ");
        System.out.println(dish2.equals(dish3));

        System.out.println("Dodanie nowego dania: ");
        restaurant.addDish(new Dish("krewetki", 39, DishType.APPETIZER, 390));
        System.out.println(restaurant);

        System.out.println("Usuniecie dania: ");
        restaurant.removeDish(dish4);
        System.out.println(restaurant);


        try {
            System.out.println("Podaj nazwe dania");
            Scanner scanner = new Scanner(System.in);
            String meal = scanner.nextLine();
            restaurant.findMealByName(meal);
            System.out.println("Uda³o siê znaleŸæ: " + meal);
        } catch (RestauranException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(restaurant.findDishByType(DishType.DINNER));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}