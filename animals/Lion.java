package animals;

import food.Food;

public class Lion extends Carnivorous implements Voice, Run {

    @Override
    public String toString(){
        return "Лев";
    }

    @Override
    public void run() {
        System.out.println("Лев бежит");
        
    }

    @Override
    public String voice() {
        return "Лев рычит";
    }

    public void eat (Food food) {
        System.out.println("Льву дали " + food);
        super.eat(food);

    }
    
}
