package Homework_Aston_6.first;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
        count++;
    }

    private final int runLimit = 500;
    private final int swimLimit = 10;
    private int count;

    public int getSwimLimit() {
        return swimLimit;
    }

    @Override
    public int getCount() {
        return count;
    }

    @Override
    public void setCount(int count) {
        this.count = count;
    }

    public int getRunLimit() {
        return runLimit;
    }

    public void run(int runCountInMeters) {
        if (runCountInMeters <= runLimit) {
            System.out.println(super.getName() + " пробежал " + runCountInMeters + " м.");
        } else {
            System.out.println(super.getName() + " не может пробежать такую дистанцию");
        }
    }

    public void swim(int swimCountInMeters) {
        if (swimCountInMeters <= swimLimit) {
            System.out.println(super.getName() + " проплыл " + swimCountInMeters + " м.");
        } else {
            System.out.println(super.getName() + " не может проплыть такую дистанцию");
        }
    }
}


