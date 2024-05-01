package Aston_2_homework;

public class Main {
    public static void main(String[] args) {
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Ivanov Ivan", "Engineer",
                "ivivan@mailbox.com", "892312312", 30000, 30);
        persArray[1] = new Person("Ivanova Mary", "QA Engineer",
                "iviv12@mailbox.com", "892312312", 40000, 29);
        persArray[2] = new Person("Petrov Ivan", "Java Engineer",
                "ivi55n@mailbox.com", "892312312", 35000, 28);
        persArray[3] = new Person("Sidorova Ksusha", "Java Engineer",
                "ivi33n@mailbox.com", "892312312", 33000, 26);
        persArray[4] = new Person("Rodionov Pavel", "QA Engineer",
                "iviv933@mailbox.com", "892312312", 32000, 31);

        for (Person person : persArray) {
            System.out.println(person.toString());
        }

        Park park = new Park();
        Park.RollerCoaster rollerCoaster = park.new RollerCoaster();
        Park.FerrisWheel ferrisWheel = park.new FerrisWheel();
        Park.Carousel carousel = park.new Carousel();
        Park.DropTower dropTower = park.new DropTower();
        Park.KiddieRide kiddieRide = park.new KiddieRide();
    }
}
