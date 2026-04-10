import AccessSpecifiers.Enemy;

public class Bandit extends Enemy {
    public void attack() {
        name = "Bandit";
//        age = 10;
        System.out.println("I am a " + name + ", Attack!");
    }
}
