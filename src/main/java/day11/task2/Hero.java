package day11.task2;

public abstract class Hero implements PhysAttack {
    double physDef;
    double magicDef;
    int physAtt;
    double attValue;
    int health;
    final static int HEALTHMAX = 100;
    final static int HEALTHMIN = 0;


    public Hero() {
        health = HEALTHMAX;

    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public double getPhysDef() {
        return physDef;
    }

    public void setPhysDef(double physDef) {
        this.physDef = physDef;
    }

    public double getMagicDef() {
        return magicDef;
    }

    public void setMagicDef(double magicDef) {
        this.magicDef = magicDef;
    }

    public int getPhysAtt() {
        return physAtt;
    }

    public void setPhysAtt(int physAtt) {
        this.physAtt = physAtt;
    }

    public void physicalAttack(Hero hero) {

        attValue = physAtt * (1 - hero.physDef);
        if (hero.health - attValue < HEALTHMIN) {
            hero.health = HEALTHMIN;
        } else
            hero.health -= attValue;
    }

}
