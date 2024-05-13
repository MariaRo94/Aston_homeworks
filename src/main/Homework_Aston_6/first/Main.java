package Homework_Aston_6.first;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int countOfFood = 50; // update food count with method

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
        //Создать массив котов и миску с едой, попросить всех котов покушать из этой миски и потом вывести информацию о сытости котов в консоль.
        //Добавить метод, с помощью которого можно было бы добавлять еду в миску.

        Cat[] cats = new Cat[5];
        cats[0] = catKassy;
        cats[1] = catJassy;
        cats[2] = catFassy;
        cats[3] = catMassy;
        cats[4] = catClassy;

        for (Cat cat : cats) {
            int eatFood = new Random().nextInt(10);
            cat.eat(//);
            // update food
            System.out.println(cat.isFeed());
        }
    }
}
