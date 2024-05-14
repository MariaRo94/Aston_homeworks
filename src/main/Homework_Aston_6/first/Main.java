package Homework_Aston_6.first;

import java.util.Random;

public class Main {
    public static int countOfFood = 45;

    public static void main(String[] args) {

        Cat catJassy = new Cat("Jassy");
        catJassy.run(180);
        catJassy.swim(100);

        Cat catClassy = new Cat("Jassy");
        catClassy.run(180);
        catClassy.swim(100);

        Cat catFassy = new Cat("Jassy");
        catFassy.run(180);
        catFassy.swim(100);

        Cat catMassy = new Cat("Jassy");
        catMassy.run(180);
        catMassy.swim(100);

        Cat catKassy = new Cat("Jassy");
        catKassy.run(180);
        catKassy.swim(100);

        Dog dogHanny = new Dog("Hanny");
        dogHanny.run(355);
        dogHanny.swim(8);

        Cat[] cats = new Cat[5];
        cats[0] = catKassy;
        cats[1] = catJassy;
        cats[2] = catFassy;
        cats[3] = catMassy;
        cats[4] = catClassy;

        for (Cat cat : cats) {
            int eatFood = 10;
            if (!cat.eat(eatFood, countOfFood)) {
                updateCountOfFood(eatFood - countOfFood);
                System.out.println("Добавили в миску еще еды");
                cat.eat(eatFood, countOfFood);
            }
            countOfFood = countOfFood - eatFood;
            System.out.println(cat.isFeed());
        }
    }

    public static void updateCountOfFood(int value) {
        countOfFood = countOfFood + value;
    }
}
