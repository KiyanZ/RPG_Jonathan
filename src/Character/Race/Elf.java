package Character.Race;

import Character.Stat.*;

public class Elf {
        public int modifier(Stat stat){
            if (stat instanceof Intelligence){
                return  2;
            } else if (stat instanceof Dexterity){
                return 3;
            } else if (stat instanceof Constitution){
                return -1;
            } else return 0;
        }
}
