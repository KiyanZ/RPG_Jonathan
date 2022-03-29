package Character;

import Character.Job.Job;
import Character.Race.Race;
import Character.Stat.Constitution;
import Character.Stat.Dexterity;
import Character.Stat.Intelligence;
import Character.Stat.Strength;
import Item.IConsumable;

public class Character implements IDamageable{
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

    private double totalDmg = 0;
    private  Strength strength;
    private  Dexterity dexterity;
    private  Intelligence intelligence;
    private  Constitution constitution;

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
    //(Valor base Constitution + bonif. raza + bonif.profesion)*25
    public double maxHealth() {
        return this.race.modifier(constitution) + this.job.modifier(constitution) * 25;
    }
    //Devuelve el valor de vida actual
    public double health(){
        return maxHealth() - totalDmg;
    }
    //Devuelve true si el daño es mayor o igual a la vida
    public boolean isDead(){
        return totalDmg >= health();
    }
    //Aumenta el daño recibido

    public void consumes(IConsumable consumable) {
        consumable.consumedBy(this);
        System.out.println(name + " consumed: " + consumable);
    }

    public void receivesDamage(double amount){
         totalDmg = totalDmg + amount;
        System.out.println(name + " recieved " + amount + " damage. " + "Health: " + health() + "/" + maxHealth());
    }
    //Disminuye el daño recibido. El daño mínimo es 0
    public void heals(double amount){
        totalDmg = totalDmg - amount;
        if (totalDmg < 0){
            totalDmg = 0;
        }
        System.out.println(name + " healed " + amount + " damage. " + "Health: " + health() + "/" + maxHealth());
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
