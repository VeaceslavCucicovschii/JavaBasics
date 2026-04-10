package AccessSpecifiers;

public abstract class Enemy {
    protected String name;
    int age;

    public void attack() {
        this.name = "Enemy";
        this.age = 30;
        System.out.println("I am an enemy. Attack");
    }
}