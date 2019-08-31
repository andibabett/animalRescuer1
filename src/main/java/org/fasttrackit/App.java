package org.fasttrackit;

/**
 * Hello animalute!
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

        RecreationalActivity recreationalActivity = new RecreationalActivity();
        recreationalActivity.sleep = "yes";
        recreationalActivity.sleepTime = 10;
        recreationalActivity.eat = Boolean.parseBoolean("true/false");
        recreationalActivity.play = "yes";


        Game game = new Game();
        game.adopter = "hugs";
        game.dog = "run";
        game.vet = "kisses";

        System.out.println( "Hello Animalute!" );
        System.out.println(animal.name);
        System.out.println(animal.game);
        System.out.println(adopter.sex);
        System.out.println(animal.age);
        System.out.println(animal.favoriteFood);
        System.out.println(adopter.avaibleMoney);
        System.out.println(animal.health);
        System.out.println(adopter.name);
        System.out.println(vet.name);
        System.out.println(vet.experience);
        System.out.println(vet.specialization);
        System.out.println(food.foodType);
        System.out.println(food.price);
        System.out.println(recreationalActivity.sleepTime);
        System.out.println(recreationalActivity.play);








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

        RecreationalActivity recreationalActivity2 = new RecreationalActivity();
        recreationalActivity2.sleep = "no";
        recreationalActivity2.sleepTime = 0;
        recreationalActivity2.eat = Boolean.parseBoolean("true");
        recreationalActivity2.play = "yes";

        Game game2 = new Game();
        game2.adopter = "caressing";
        game2.dog = "balls";
        game2.vet = "walk";

        animal2.game = game2;




        System.out.println(animal2.game);
        System.out.println(adopter2.sex);
        System.out.println(animal2.age);
        System.out.println(animal2.favoriteFood);
        System.out.println(adopter2.avaibleMoney);
        System.out.println(animal2.health);
        System.out.println(adopter2.name);
        System.out.println(vet2.name);
        System.out.println(vet2.experience);
        System.out.println(vet2.specialization);
        System.out.println(food2.foodType);
        System.out.println(food2.price);
        System.out.println(recreationalActivity2.sleepTime);
        System.out.println(recreationalActivity2.play);


        System.out.println("animal2 name: " + animal2.name);
        System.out.println("animal name: " + animal.name);
        System.out.println("vet2 name: " + vet2.name);
        System.out.println("vet1 name: " + vet.name);
        System.out.println("adopter2 name: " + adopter2.name);
        System.out.println("adopter1 name: " + adopter.name);




    }
}
