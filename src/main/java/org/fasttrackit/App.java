package org.fasttrackit;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Animal animal = new Animal();
        animal.name = "Caine";
        animal.age = 1;
        animal.health = 9;
        animal.hunger = 5;
        animal.mood = 5;
        animal.favoriteFood = "Meal";
        animal.recreationalActivity = "eat";
        animal.weight = 12.6;


        Food food = new Food();
        food.foodType = "Meal";
        food.price = 10;
        food.amount = 2;
        food.avaible = "true";
        food.favoriteFood = "Meal";

        Adopter adopter = new Adopter();
        adopter.name = "Ms";
        adopter.avaibleMoney = 70;
        adopter.age = 30;
        adopter.sex = "female";

        Vet vet = new Vet();
        vet.name = "Doctor";
        vet.age = 25;
        vet.experience = "false";
        vet.specialization = "animalBehavior";
        vet.sex = "Male";

        RecreationalActivity recreationalactivity = new RecreationalActivity();
        recreationalactivity.sleep = "yes";
        recreationalactivity.sleepTime = 10;
        recreationalactivity.eat = Boolean.parseBoolean("true/false");
        recreationalactivity.play = "yes";


        Game game = new Game();
        game.adopter = "hugs";
        game.dog = "run";
        game.vet = "kisses";

        animal.game = game;

        System.out.println(animal.name);
        System.out.println(animal.game);
        System.out.println(adopter.sex);





        Animal animal2 = new Animal();
        animal2.name = "Pisica";
        animal2.age = 2;
        animal2.health = 6;
        animal2.hunger = 2;
        animal2.mood = 8;
        animal2.favoriteFood = "Milk";
        animal2.recreationalActivity = "sleep";
        animal2.weight = 2.2;

        Food food2 = new Food();
        food2.foodType = "Milk";
        food2.favoriteFood ="Milk";
        food2.avaible = "true";
        food2.amount = 0.5;
        food2.price = 15.33;

        Adopter adopter2 = new Adopter();
        adopter2.name = "Mr";
        adopter2.avaibleMoney = 50;
        adopter2.sex = "male";
        adopter2.age = 5;

        Vet vet2 = new Vet();
        vet2.name = "Medic";
        vet2.age = 50;
        vet2.experience = "true";
        vet2.specialization = "animalWelfare";

        RecreationalActivity recreationalactivity2 = new RecreationalActivity();
        recreationalactivity2.sleep = "no";
        recreationalactivity2.sleepTime = 0;
        recreationalactivity2.eat = Boolean.parseBoolean("true");
        recreationalactivity2.play = "yes";

        Game game2 = new Game();
        game2.adopter = "caressing";
        game2.dog = "balls";
        game2.vet = "walk";

        animal2.game = game2;


















        System.out.println( "Hello World!" );
    }
}
