package Character;

import Character.Job.Job;
import Character.Race.Race;
import Character.Stat.*;

public class Character {
    private String name;

    public String getName() {
        return name;
    }

    private Race race;

    public Race getRace() {
        return race;
    }

    private Job job;

    public Job getJob() {
        return job;
    }

    private Strength strength;
    private Dexterity dexterity;
    private Intelligence intelligence;
    private Constitution constitution;

    public Character(String name, Race race, Job job) {
        this.name = name;
        this.race = race;
        this.job = job;
        this.strength = new Strength(5);
        this.dexterity = new Dexterity(5);
        this.intelligence = new Intelligence(5);
        this.constitution = new Constitution(5);
    }

    public double speed() {
        return this.race.modifier(dexterity) + this.job.modifier(dexterity) * 2;
    }

    public double power() {
        return this.race.modifier(strength) + this.job.modifier(strength) * 2;
    }

    public double magic() {
        return this.race.modifier(intelligence) + this.job.modifier(intelligence) * 2;
    }

    public double health() {
        return this.race.modifier(constitution) + this.job.modifier(constitution) * 25;
    }

    @Override
    public String toString() {
        return "My name is " + name +
                ". I'm a " + race + " " + job +
                ". My stats are: " +
                "Strength:" + strength +
                "Dexterity:" + dexterity +
                "Intelligence:" + intelligence +
                "Constitution:" + constitution +
                "Speed: " + speed() +
                "Power: " + power() +
                "Magic: " + magic() +
                "Health: " + health();
    }
}
