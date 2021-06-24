package day12.task3;

import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        List list = new ArrayList();
        MusicBand mb1 = new MusicBand("Aria", 1985);
        MusicBand mb2 = new MusicBand("Iron MAiden", 1975);
        MusicBand mb3 = new MusicBand("Carcass", 1989);
        MusicBand mb4 = new MusicBand("Catharsis", 1997);
        MusicBand mb5 = new MusicBand("GjeldRune", 2014);
        MusicBand mb6 = new MusicBand("Enspherium", 2007);
        MusicBand mb7 = new MusicBand("Bathory", 1983);
        MusicBand mb8 = new MusicBand("Uratsakidogi", 2017);
        MusicBand mb9 = new MusicBand("Vorovaiki", 1995);
        MusicBand mb10 = new MusicBand("Ludmila Gurchenko", 1978);
        list.add(mb1);
        list.add(mb2);
        list.add(mb3);
        list.add(mb4);
        list.add(mb5);
        list.add(mb6);
        list.add(mb7);
        list.add(mb8);
        list.add(mb9);
        list.add(mb10);
        Collections.shuffle(list);
        System.out.println(list);
        System.out.println(groupsAfter2000(list));

    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> list) {
        List listAfter2000 = new ArrayList();
        for (int i = 0; i < 10; i++) {
            if (list.get(i).getYear() > 2000) {
                listAfter2000.add(list.get(i));
            }
        }
        return listAfter2000;
    }
}

