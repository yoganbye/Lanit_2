import animals.*;
import food.*;

public class Zoo {
    public static void main(String[] args) {
        Animals duck = new Duck();
        Animals fish = new Fish();
        Animals crocodile = new Crocodile();
        Animals lion = new Lion();
        Animals rabbit = new Rabbit();
        Animals wolf = new Wolf();

        Food chickenMeat = new ChickenMeat();
        Food corn = new Corn();
        Food rabbitMeat = new RabbitMeat();
        Food oats = new Oats();

        Worker worker = new Worker();
        
        worker.feed(duck, rabbitMeat);


    }
}
