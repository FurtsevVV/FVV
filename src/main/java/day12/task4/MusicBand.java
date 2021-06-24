package day12.task4;

import java.util.ArrayList;
import java.util.Collection;

public class MusicBand {
    private String name;
    private int year;
    private Collection<String> members = new ArrayList<>();

    public MusicBand(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public void addMember(String memberName) {
        members.add(memberName);
    }

    public void deleteMembers(String memberName) {
        members.remove(memberName);
    }

    public static void transferMembers(MusicBand a, MusicBand b) {
        a.members.addAll(b.members);
        b.members.removeAll(b.members);
    }

    public Collection<String> getMembers() {
        return members;
    }

    public void printMembers() {
        for (String memb : members) {
            System.out.println(memb);
        }
    }


    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", members=" + members +
                '}';
    }
}
