package Character.Job;

import Character.Stat.Stat;

public abstract class Job {

    public abstract int modifier (Stat stat);

    public boolean equals(Object obj){
        return this.getClass() == obj.getClass();
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
