class GameCharacter {
String name;

GameCharacter(String name) {
    this.name = name;
}

 void attack() {

    System.out.println("Character attacks!");


}

void attack(String weapon) {
    System.out.println(name + "attacks with " + weapon);

}

}
