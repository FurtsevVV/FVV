package day11.task2;

public class Magician extends Hero implements MagicAttack {
    int magicAtt = 20;

    public Magician() {
        physAtt = 5;
        magicDef = 0.8;
        physDef = 0.0;
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
        return "Magician{" +
                "physDef=" + physDef +
                ", magicDef=" + magicDef +
                ", physAtt=" + physAtt +
                ", health=" + health +
                ", magicAtt=" + magicAtt +
                '}';
    }
}
