package day12.task5;

import java.util.ArrayList;
import java.util.Collection;

public class MusicBand {
    private String name;
    private int year;
    private Collection<MusicArtist> artists = new ArrayList<>();

    public MusicBand(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public void addMembers(MusicArtist art) {
        artists.add(art);
    }

    public void deleteMembers(MusicArtist art) {
        artists.remove(art);
    }

    public void transferMembers(MusicBand b1, MusicBand b2) {
        b1.artists.addAll(b2.artists);
        b2.artists.removeAll(b2.artists);
    }

    public void printMembers() {
        for (MusicArtist artists : artists) {
            System.out.println(artists);
        }
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", artists=" + artists +
                '}';
    }
}
