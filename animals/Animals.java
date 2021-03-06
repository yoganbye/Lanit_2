package animals;
import food.Food;

/**
 * Animals
 */

public abstract class Animals {
    protected int satiety; 

    public abstract void eat(Food food);

    public void getSatiety() {
        System.out.println("Сытость: " + satiety);
    }

}