package AccessSpecifiers;

public class Ghost extends Enemy {
    public void attack() {
        name = "Ghost";
        age = 10;
        System.out.println("I am a " + name + ", Attack!");
    }
}
