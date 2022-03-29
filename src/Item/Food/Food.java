package Item.Food;

import Item.IConsumable;
import Character.Character;

public abstract class Food implements IConsumable {
    private double power;

    @Override
    public void consumedBy(Character character){
        character.heals(power);
    }
}
