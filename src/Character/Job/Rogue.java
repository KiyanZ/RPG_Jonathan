package Character.Job;

import Character.Stat.*;

public class Rogue extends Job{
    public int modifier(Stat stat){
        if (stat instanceof Dexterity){
            return  +5;
        } else if (stat instanceof Constitution){
            return -4;
        } else if (stat instanceof Strength){
            return -1;
        } else return +0;
    }
}
