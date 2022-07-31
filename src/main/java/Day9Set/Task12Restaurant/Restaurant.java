package Day9Set.Task12Restaurant;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Restaurant {
    private final Set<Dish> dishes = new HashSet<>();

    @Override
    public String toString() {
        return "Restaurant{" +
                "dishes=" + dishes +
                '}';
    }

    public void addDish(Dish dish) {
        dishes.add(dish);
    }

    public void removeDish(Dish dish) {
        dishes.remove(dish);
    }

    public Dish findMealByName(String name) throws RestauranException {
        for (Dish dish : dishes) {
            if (dish.getName().equals(name)) {
                return dish;
            }
        }
        throw new RestauranException("Nie znalaz³o dania!");
    }

    List<Dish> findDishByType(DishType type) throws RestauranException {
        List<Dish> found = new ArrayList<>();
        for (Dish dish : dishes) {
            if (dish.getType() == type) {
                found.add(dish);
            }
        }
        if (found.size() == 0) {
            throw new RestauranException("[]");
        }
        return found;
    }
}
