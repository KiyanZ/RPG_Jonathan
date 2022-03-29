package Item.Potion;

import Item.IConsumable;
import Character.Character;

public abstract class Potion implements IConsumable {
    private double power;

    @Override
    public void consumedBy(Character character) {
        character.heals(power);
    }
}
