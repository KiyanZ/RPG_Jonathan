package Character.Race;

import Character.Stat.*;

public class Assassin extends Race{
    public int modifier(Stat stat){
        if (stat instanceof Dexterity){
            return  7;
        } else if (stat instanceof Constitution){
            return -3;
        } else if (stat instanceof Strength) {
            return 1;
        } else return 0;
    }
}
