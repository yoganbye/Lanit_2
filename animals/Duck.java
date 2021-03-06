package animals;

import food.Food;

public class Duck extends Herbivore implements Fly, Swim, Voice, Run {

    @Override
    public String toString(){
        return "Утка";
    }

    @Override
    public void run() {
        System.out.println("Утка бежит");
        
    }

    @Override
    public String voice() {
        return "Утка крякает";
    }

    @Override
    public void swim() {
        System.out.println("Утка плавает");
        
    }

    @Override
    public void fly() {
        System.out.println("Утка летает");
        
    }

    public void eat (Food food) {
        System.out.println("Утке дали " +  food.toString());
        super.eat(food);


    }

    
}
