package animals;

import food.Food;
import food.Grass;

public abstract class Herbivore extends Animals {
    public void eat(Food food) {
        if (food instanceof Grass) {
            System.out.println("Животное сьело траву!");
            satiety += food.getValueFood();
            
        } else {
            System.out.println("Данный тип еды не подходит для животного!");
        }
        
    }
    
}
