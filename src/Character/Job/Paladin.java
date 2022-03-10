package Character.Job;

import Character.Stat.Constitution;
import Character.Stat.Dexterity;
import Character.Stat.Intelligence;
import Character.Stat.Stat;

public class Paladin extends Job{
    public int modifier(Stat stat){
        if (stat instanceof Intelligence){
            return  +2;
        } else if (stat instanceof Constitution){
            return +2;
        } else if (stat instanceof Dexterity){
            return +1;
        } else return +0;
    }
}
