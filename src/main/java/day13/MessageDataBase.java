package day13;

import java.util.ArrayList;
import java.util.List;

public class MessageDataBase {
    private static List<Message> messages = new ArrayList<>();

    public static void addNewMessage(User u1, User u2, String text) {
        messages.add(new Message(u1, u2, text));
    }

    public static List<Message> getMessages() {

        return messages;
    }

    public static void showDialog(User u1, User u2) {
        for (Message mes : messages) {
            if ((mes.getSender() == u1 || mes.getReceiver() == u1) && (mes.getReceiver() == u2 || mes.getSender() == u2)) {
                System.out.println(mes);

            }
        }
    }

}
