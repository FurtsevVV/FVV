package day12.task5;

public class Task5 {
    public static void main(String[] args) {
        MusicArtist a1 = new MusicArtist("Abbath", 60);
        MusicArtist a2 = new MusicArtist("Gorgoroth XII", 45);
        MusicArtist a3 = new MusicArtist("Naithan Explosion", 35);
        MusicArtist a4 = new MusicArtist("William Murderface", 29);
        MusicArtist a5 = new MusicArtist("Toki Squizgaar", 38);

        MusicBand mb1 = new MusicBand("Deathklok", 2000);
        MusicBand mb2 = new MusicBand("Dobrye Kiski", 2005);

        mb1.addMembers(a1);
        mb1.addMembers(a2);
        mb1.addMembers(a3);
        mb2.addMembers(a4);
        mb2.addMembers(a5);
        mb1.transferMembers(mb1, mb2);
        System.out.println(mb1);
        System.out.println(mb2);
        mb1.printMembers();

    }
}
