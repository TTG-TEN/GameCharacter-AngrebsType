import java.util.ArrayList;
import java.util.List;
void main() {

List<GameCharacter> gameCharacters = new ArrayList<>();

gameCharacters.add(new Warrior("TopHat"));
gameCharacters.add(new Wizard("Angy"));


for (GameCharacter gameCharacter: gameCharacters) {



if (gameCharacter instanceof Warrior) {
    gameCharacter.attack("Sword");
} else if (gameCharacter instanceof Wizard) {
    ((Wizard) gameCharacter).attack("Staff");
    
}

}




}