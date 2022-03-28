package Item.Potion;

import Item.IConsumible;
import Character.Character;

public abstract class Potion implements IConsumible {
    private double power;

    @Override
    public void consumedBy(Character character) {
        character.heals(power);
    }
}
