package day11.task2;

public class Paladin extends Hero implements Healer, PhysAttack {
    public Paladin() {
        physAtt = 15;
        physDef = 0.5;
        magicDef = 0.2;
    }

    @Override
    public void healHimself() {
        int healthHimself = 25;
        if (health + healthHimself > HEALTHMAX) {
            health = HEALTHMAX;
        } else
            health = health + healthHimself;
    }

    @Override
    public void healTeammate(Hero hero) {
        int healthTeammate = 10;
        if (hero.health + healthTeammate > HEALTHMAX) {
            hero.health = HEALTHMAX;
        } else
            hero.health = hero.health + healthTeammate;
    }

    @Override
    public String toString() {
        return "Paladin{" +
                "physDef=" + physDef +
                ", magicDef=" + magicDef +
                ", physAtt=" + physAtt +
                ", health=" + health +
                '}';
    }
}
