package ThemePark;

public class Visitor {

    private String name;
    private int age;
    private int height;
    private double money;

    public Visitor(String name, int age, int height, double money) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.money = money;
    }

    public String getVisitorName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public double getMoney() {
        return money;
    }

    public int getAge() {
        return age;
    }
}
