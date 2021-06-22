package day11.task2;

public class Shaman extends Hero implements Healer, MagicAttack {
    int magicAtt = 15;

    public Shaman() {
        physAtt = 10;
        magicDef = 0.2;
        physDef = 0.2;
    }

    @Override
    public void healHimself() {
        int healthHimself = 50;
        if (health + healthHimself > HEALTHMAX) {
            health = HEALTHMAX;
        } else
            health = health + healthHimself;
    }

    @Override
    public void healTeammate(Hero hero) {
        int healthTeammate = 30;
        if (hero.health + healthTeammate > HEALTHMAX) {
            hero.health = HEALTHMAX;
        } else
            hero.health = hero.health + healthTeammate;
    }


    @Override
    public void magicalAttack(Hero hero) {
        attValue = magicAtt * (1 - hero.magicDef);
        if (hero.health - attValue < HEALTHMIN) {
            hero.health = 0;
        } else
            hero.health -= attValue;
    }

    @Override
    public String toString() {
        return "Shaman{" +
                "physDef=" + physDef +
                ", magicDef=" + magicDef +
                ", physAtt=" + physAtt +
                ", health=" + health +
                ", magicAtt=" + magicAtt +
                '}';
    }
}
