package Homework_Aston_6.first;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
        setFeed(false);
        count++;
    }

    private final int runLimit = 200;
    private final int swimLimit = 0;
    private int count = 0;
    private boolean isFeed;


    public void run(int runCountInMeters) {
        if (runCountInMeters <= runLimit) {
            System.out.println(super.getName() + " пробежал " + runCountInMeters + " м.");
        } else {
            System.out.println(super.getName() + " не может пробежать такую дистанцию");
        }
    }

    public void swim(int meters) {
        System.out.println(super.getName() + " не умеет плавать");
    }

    @Override
    public void addFood(int addFoodAmount) {
        super.addFood(addFoodAmount);
    }

    @Override
    public boolean eat(int eatAmount, int leftFood) {
        isFeed = super.eat(eatAmount, leftFood);
        return isFeed;
    }

    public boolean isFeed() {
        return isFeed;
    }

    public void setFeed(boolean feed) {
        isFeed = feed;
    }
}


