import java.time.LocalDate;

public class Set {
    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of(2006, 8, 30);
        User user = new User("Dima", birthday, "diasdd@gmail.com", "371312", "Denisenko", 73, 125, 9000);
        LocalDate birthday1 = LocalDate.of(1949, 11, 15);
        User user1 = new User("John", birthday1,"gggg@gmail.com", "38972", "Grip", 93,155,4000);
        LocalDate birthday2 = LocalDate.of(1990, 4, 14);
        User user2 = new User("Sad", birthday2,"bob@gmail.com", "6767312", "Pop", 90,105,10000);

        user.printAccountInfo();
        System.out.println();
        user.setSurname("Den");
        user.setWeight(90);
        user.setPressure(125);
        user.setSteps(17000);
        user.printAccountInfo();

        System.out.println();
        user1.printAccountInfo();
        System.out.println();
        user1.setSurname("Brig");
        user1.setWeight(80);
        user1.setPressure(115);
        user1.setSteps(15000);
        user1.printAccountInfo();

        System.out.println();
        user2.printAccountInfo();
    }
}

