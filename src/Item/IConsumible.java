package Item;
import Character.Character;

public interface IConsumible {
    //Pasamos el personaje para poder actuar sobre él
    void consumedBy(Character character);
}
