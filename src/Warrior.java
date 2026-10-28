public class Warrior extends GameCharacter{

Warrior(String name) {
    super(name);
}

    @Override
    void attack() {
        System.out.println("Warrior swings with his sword");

    }

@Override
    void attack(String weapon) {
    System.out.println(name + " swings his " + weapon);
}

}
