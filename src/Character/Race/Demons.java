package Character.Race;

import Character.Stat.*;

public class Demons extends Race{
    public int modifier(Stat stat){
        if (stat instanceof Intelligence){
            return  4;
        } else if (stat instanceof Dexterity){
            return 1;
        } else if (stat instanceof Strength){
            return -1;
        } else return 0;
    }
}
