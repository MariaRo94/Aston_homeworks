public class Cat {
    int age;
    String name;

    public void sayMeow () {
        System.out.println("Meow!");
    }
    public void jump () {
        System.out.println("Pryg skok!");

    }
    public Cat (int age, String name){
        this.name = name;
        this.age = age;

    }
    public static void main(String[] args) {
        Cat cat1 = new Cat(2, "Barsik");
        Cat cat2 = new Cat (3, "Luci");
        cat2.jump();
        cat1.sayMeow();


    }

}
