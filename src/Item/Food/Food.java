package Item.Food;

import Item.IConsumible;
import Character.Character;

public abstract class Food implements IConsumible {
    private double power;

    @Override
    public void consumedBy(Character character){
        character.heals(power);
    }
}
