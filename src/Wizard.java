class Wizard extends GameCharacter {

Wizard(String name) {
    super(name);
}

    @Override
    void attack() {
        System.out.println("Wizard Shoots a fireball!");
    }

@Override
    void attack(String weapon) {
    System.out.println( name + " shoots a fireball with his " + weapon);
}

}
