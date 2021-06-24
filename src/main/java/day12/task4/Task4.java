package day12.task4;

public class Task4 {
    public static void main(String[] args) {
        MusicBand m1 = new MusicBand("Aria", 2000);
        MusicBand m2 = new MusicBand("Riot", 2010);
        m1.addMember("Sasha");
        m1.addMember("Kot");
        m1.addMember("Puh");
        m2.addMember("Gof");
        m2.addMember("Hilander");
        m2.addMember("Tesak");
        m2.deleteMembers("Tesak");
        m2.printMembers();
        MusicBand.transferMembers(m2, m1);
        System.out.println(m2.getMembers());
        System.out.println(m1.getMembers());
        m2.printMembers();


    }
}
