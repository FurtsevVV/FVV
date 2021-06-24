package day12.task5;

import java.util.Collection;

public class MusicArtist {
    private String artistName;
    private int artistAge;


    public MusicArtist(String artistName, int artistAge) {
        this.artistName = artistName;
        this.artistAge = artistAge;
    }


    @Override
    public String toString() {
        return "Музыкант" +
                " по имени " + artistName + '\'' +
                ", годиков " + artistAge +
                '}';
    }
}
