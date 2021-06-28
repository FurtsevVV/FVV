package day13;

import java.util.*;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {

        User u1 = new User("Kot");
        User u2 = new User("Lob");
        User u3 = new User("Mirt");

        u1.subscribe(u2);
        u2.subscribe(u1);
        u3.sendMessage(u1, "Pogovorim?");
        u1.sendMessage(u2, "Privet!");
        u1.sendMessage(u2, "Kak dela");
        u2.sendMessage(u1, "Kupi");
        u2.sendMessage(u1, "Bystree");
        u2.sendMessage(u1, "Kota");
        Thread.sleep(1000);
        u3.sendMessage(u1, "Get");
        u3.sendMessage(u1, "Over");
        u3.sendMessage(u1, "Here");

        u1.sendMessage(u3, "Idem na ulicu1!");
        u1.sendMessage(u3, "Idem na ulicu2!");
        Thread.sleep(2000);
        u1.sendMessage(u3, "Idem na ulicu3!");
        u3.sendMessage(u1, "OverHere");


        MessageDataBase.showDialog(u1, u3);

    }
}
