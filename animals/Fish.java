package animals;

import food.Food;

public class Fish extends Herbivore implements Swim {

    @Override
    public String toString(){
        return "Рыба";
    }

    @Override
    public void swim() {
        System.out.println("Рыба плавает");
        
    }
    
    public void eat (Food food) {
        System.out.println("Рыбе дали " + food);
        super.eat(food);

    }
}
