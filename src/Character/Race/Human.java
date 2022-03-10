package Character.Race;

import Character.Stat.*;

public class Human extends Race{
        public int modifier(Stat stat){
            if (stat instanceof Strength){
                return  2;
            } else if (stat instanceof Constitution){
                return 2;
            } else if (stat instanceof Dexterity){
                return 1;
            } else return 0;
        }
}
