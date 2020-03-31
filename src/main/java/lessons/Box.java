package lessons;

public class Box implements Figures {
    @Override
    public String getName() {
        String name = "Большая коробка";
        return name;
    }

    @Override
    public int getAge() {
        int age = 12;
        return age;
    }
}
