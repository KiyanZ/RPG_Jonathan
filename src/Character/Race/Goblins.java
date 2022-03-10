package Character.Race;

import Character.Stat.*;

public class Goblins extends Race{
    public int modifier(Stat stat){
        if (stat instanceof Dexterity){
            return  8;
        } else if (stat instanceof Constitution){
            return -3;
        } else if (stat instanceof Strength) {
            return -1;
        } else return 0;
    }
}
