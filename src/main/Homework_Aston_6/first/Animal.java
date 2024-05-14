/*Создать классы Собака и Кот с наследованием от класса Животное.

Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина
препятствия. Результатом выполнения действия будет печать в консоль.
(Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');

У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание:
 кот не умеет плавать, собака 10 м.).

Добавить подсчет созданных котов, собак и животных.
        Расширить задачу, добавив для котов возможность кушать из миски, выполнив следующие
        пункты:
        Сделать так, чтобы в миске с едой не могло получиться отрицательного количества еды
        (например, в миске 10 еды, а кот пытается покушать 15-20).
Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны).
Если коту удалось покушать (хватило еды), сытость = true.
Считаем, что если коту мало еды в миске, то он её просто не трогает,
то есть не может быть наполовину сыт (это сделано для упрощения логики программы).
Создать массив котов и миску с едой, попросить всех котов покушать из этой миски и
 потом вывести информацию о сытости котов в консоль.
        Добавить метод, с помощью которого можно было бы добавлять еду в миску.*/


package Homework_Aston_6.first;

public class Animal {
    private String name;
    private int count = 0;
    private int foodAmount;


    public Animal(String name) {
        this.name = name;
        count++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getFoodAmount() {
        return foodAmount;
    }

    public void setFoodAmount(int foodAmount) {
        this.foodAmount = foodAmount;
    }

    public boolean eat(int eatAmount, int leftFood) {
        if (eatAmount < 0 || leftFood < 0) {
            throw new RuntimeException("Impossible to add this amount of food");
        }

        if (eatAmount <= leftFood) {
            System.out.println(name + " поел, хватило еды");
            return true;
        } else {
            System.out.println(name + " не поел, еды не хватило");
            return false;
        }
    }

    public void addFood(int foodAmount) {
        if (foodAmount < 0) {
            throw new RuntimeException("Impossible to eat this amount of food");
        }
        setFoodAmount(foodAmount);
        System.out.println("В миску добавлено " + foodAmount + " еды");
    }
}



